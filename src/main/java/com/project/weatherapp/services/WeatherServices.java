package com.project.weatherapp.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.project.weatherapp.models.APIWeather;
import com.project.weatherapp.models.Location;
import com.project.weatherapp.models.Weather;
import com.project.weatherapp.proxy.APIWeatherProxy;

import feign.FeignException;

@Service
public class WeatherServices {
    @Value("${apiweather.key}")
    private String key;

    private final APIWeatherProxy weatherProxy;
    
    public WeatherServices(APIWeatherProxy weatherProxy) {
        this.weatherProxy = weatherProxy;
    }

    public Weather getWeatherFromLocation(Location location) {
        try {
            APIWeather weatherDetail = weatherProxy.getWeather(key, location.getLatitude() + "," + location.getLongitude(), 3);
            Weather weather = new Weather();
            weather.setTemperature(weatherDetail.getCurrent().getTemp_c());
            weather.setLocation(weatherDetail.getLocation().getName() + ", " + weatherDetail.getLocation().getCountry());
            weather.setCondition(weatherDetail.getCurrent().getCondition().getText());
            weather.setPressure(weatherDetail.getCurrent().getPressure_mb());
            weather.setWind(weatherDetail.getCurrent().getWind_mph());

            weather.setTodayHumidity(weatherDetail.getForecast().getForecastday().get(0).getDay().getAvghumidity());
            weather.setTomorrowHumidity(weatherDetail.getForecast().getForecastday().get(1).getDay().getAvghumidity());
            weather.setAfterTomorrowHumidity(weatherDetail.getForecast().getForecastday().get(2).getDay().getAvghumidity());

            for (int i = 0; i < 3; i++) {
                weather.getWillItRain()[i] = weatherDetail.getForecast().getForecastday().get(i).getDay().getDaily_will_it_rain();
                weather.getUv()[i] = weatherDetail.getForecast().getForecastday().get(i).getDay().getUv();
            }

            for (int i = 0; i < 24; i++) {
                weather.getTemperatureToday()[i] = weatherDetail.getForecast().getForecastday().get(0).getHour().get(i).getTemp_c();
            }

            return weather;
        } catch (FeignException e) {
            return null;
        }
    }
}

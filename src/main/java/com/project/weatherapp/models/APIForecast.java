package com.project.weatherapp.models;

import java.util.List;

public class APIForecast {
    private List<APIWeatherForecast> forecastday;

    public List<APIWeatherForecast> getForecastday() {
        return forecastday;
    }

    public void setForecastdays(List<APIWeatherForecast> forecastday) {
        this.forecastday = forecastday;
    }
}

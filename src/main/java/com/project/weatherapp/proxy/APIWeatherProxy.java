package com.project.weatherapp.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.project.weatherapp.models.APIWeather;

@FeignClient(name = "weather", url = "${apiweather.url}")
public interface APIWeatherProxy {
    @GetMapping("/forecast.json")
    public APIWeather getWeather(@RequestParam String key, @RequestParam String q, @RequestParam int days);
}

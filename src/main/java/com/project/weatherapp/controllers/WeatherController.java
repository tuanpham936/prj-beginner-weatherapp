package com.project.weatherapp.controllers;

import org.springframework.web.bind.annotation.RestController;
import com.project.weatherapp.models.Location;
import com.project.weatherapp.models.Weather;
import com.project.weatherapp.services.WeatherServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class WeatherController {
    private final WeatherServices weatherServices;

    public WeatherController(WeatherServices weatherServices) {
        this.weatherServices = weatherServices;
    }

    @PostMapping("/location")
    public ResponseEntity<Weather> postMethodName(@RequestBody(required = true) Location location) {
        Weather weather = weatherServices.getWeatherFromLocation(location);
        if (weather == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        return ResponseEntity.status(HttpStatus.OK).body(weather);
    }
    
}

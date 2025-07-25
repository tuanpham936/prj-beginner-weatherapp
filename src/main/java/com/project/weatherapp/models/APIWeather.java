package com.project.weatherapp.models;

public class APIWeather {
    private APILocation location;
    private APICurrentWeather current;
    private APIForecast forecast;
    public APIForecast getForecast() {
        return forecast;
    }
    public void setForecast(APIForecast forecast) {
        this.forecast = forecast;
    }
    public APILocation getLocation() {
        return location;
    }
    public void setLocation(APILocation location) {
        this.location = location;
    }
    public APICurrentWeather getCurrent() {
        return current;
    }
    public void setCurrent(APICurrentWeather current) {
        this.current = current;
    }
}

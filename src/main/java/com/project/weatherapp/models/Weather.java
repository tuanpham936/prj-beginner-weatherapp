package com.project.weatherapp.models;

public class Weather {
    private double temperature;
    private String location;
    private String condition;
    private double pressure;
    private double wind;
    public double getTemperature() {
        return temperature;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
    public double getPressure() {
        return pressure;
    }
    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
    public double getWind() {
        return wind;
    }
    public void setWind(double wind) {
        this.wind = wind;
    }
}

package com.project.weatherapp.models;

public class Weather {
    private double temperature;
    private String location;
    private String condition;
    private double pressure;
    private double wind;
    private double todayHumidity;
    private double tomorrowHumidity;
    private double afterTomorrowHumidity;
    private double[] temperatureToday = new double[24];
    private int[] willItRain = new int[3];
    private double[] uv = new double[3];
    public int[] getWillItRain() {
        return willItRain;
    }
    public void setWillItRain(int[] willItRain) {
        this.willItRain = willItRain;
    }
    public double[] getUv() {
        return uv;
    }
    public void setUv(double[] uv) {
        this.uv = uv;
    }
    public double getTodayHumidity() {
        return todayHumidity;
    }
    public void setTodayHumidity(double todayHumidity) {
        this.todayHumidity = todayHumidity;
    }
    public double getTomorrowHumidity() {
        return tomorrowHumidity;
    }
    public void setTomorrowHumidity(double tomorrowHumidity) {
        this.tomorrowHumidity = tomorrowHumidity;
    }
    public double getAfterTomorrowHumidity() {
        return afterTomorrowHumidity;
    }
    public void setAfterTomorrowHumidity(double afterTomorrowHumidity) {
        this.afterTomorrowHumidity = afterTomorrowHumidity;
    }
    public double[] getTemperatureToday() {
        return temperatureToday;
    }
    public void setTemperatureToday(double[] temperatureToday) {
        this.temperatureToday = temperatureToday;
    }
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

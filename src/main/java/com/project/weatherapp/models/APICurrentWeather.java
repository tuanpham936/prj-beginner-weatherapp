package com.project.weatherapp.models;

public class APICurrentWeather {
    private long last_updated_epoch;
    private String last_updated;
    private double temp_c;
    private double temp_f;
    private int is_day;
    private APICondition condition;
    private double wind_mph;
    private double wind_kph;
    private int wind_degree;
    private String wind_dir;
    private double pressure_mb;
    private double pressure_in;
    private double precip_mm;
    private double precip_in;
    private int humidity;
    private int cloud;
    private double feelslike_c;
    private double feelslike_f;
    private double windchill_c;
    private double windchill_f;
    private double heatindex_c;
    private double heatindex_f;
    private double dewpoint_c;
    private double dewpoint_f;
    private double vis_km;
    private double vis_miles;
    private double uv;
    private double gust_mph;
    private double gust_kph;
    public long getLast_updated_epoch() {
        return last_updated_epoch;
    }
    public void setLast_updated_epoch(long last_updated_epoch) {
        this.last_updated_epoch = last_updated_epoch;
    }
    public String getLast_updated() {
        return last_updated;
    }
    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }
    public double getTemp_c() {
        return temp_c;
    }
    public void setTemp_c(double temp_c) {
        this.temp_c = temp_c;
    }
    public double getTemp_f() {
        return temp_f;
    }
    public void setTemp_f(double temp_f) {
        this.temp_f = temp_f;
    }
    public int getIs_day() {
        return is_day;
    }
    public void setIs_day(int is_day) {
        this.is_day = is_day;
    }
    public APICondition getCondition() {
        return condition;
    }
    public void setCondition(APICondition condition) {
        this.condition = condition;
    }
    public double getWind_mph() {
        return wind_mph;
    }
    public void setWind_mph(double wind_mph) {
        this.wind_mph = wind_mph;
    }
    public double getWind_kph() {
        return wind_kph;
    }
    public void setWind_kph(double wind_kph) {
        this.wind_kph = wind_kph;
    }
    public int getWind_degree() {
        return wind_degree;
    }
    public void setWind_degree(int wind_degree) {
        this.wind_degree = wind_degree;
    }
    public String getWind_dir() {
        return wind_dir;
    }
    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }
    public double getPressure_mb() {
        return pressure_mb;
    }
    public void setPressure_mb(double pressure_mb) {
        this.pressure_mb = pressure_mb;
    }
    public double getPressure_in() {
        return pressure_in;
    }
    public void setPressure_in(double pressure_in) {
        this.pressure_in = pressure_in;
    }
    public double getPrecip_mm() {
        return precip_mm;
    }
    public void setPrecip_mm(double precip_mm) {
        this.precip_mm = precip_mm;
    }
    public double getPrecip_in() {
        return precip_in;
    }
    public void setPrecip_in(double precip_in) {
        this.precip_in = precip_in;
    }
    public int getHumidity() {
        return humidity;
    }
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    public int getCloud() {
        return cloud;
    }
    public void setCloud(int cloud) {
        this.cloud = cloud;
    }
    public double getFeelslike_c() {
        return feelslike_c;
    }
    public void setFeelslike_c(double feelslike_c) {
        this.feelslike_c = feelslike_c;
    }
    public double getFeelslike_f() {
        return feelslike_f;
    }
    public void setFeelslike_f(double feelslike_f) {
        this.feelslike_f = feelslike_f;
    }
    public double getWindchill_c() {
        return windchill_c;
    }
    public void setWindchill_c(double windchill_c) {
        this.windchill_c = windchill_c;
    }
    public double getWindchill_f() {
        return windchill_f;
    }
    public void setWindchill_f(double windchill_f) {
        this.windchill_f = windchill_f;
    }
    public double getHeatindex_c() {
        return heatindex_c;
    }
    public void setHeatindex_c(double heatindex_c) {
        this.heatindex_c = heatindex_c;
    }
    public double getHeatindex_f() {
        return heatindex_f;
    }
    public void setHeatindex_f(double heatindex_f) {
        this.heatindex_f = heatindex_f;
    }
    public double getDewpoint_c() {
        return dewpoint_c;
    }
    public void setDewpoint_c(double dewpoint_c) {
        this.dewpoint_c = dewpoint_c;
    }
    public double getDewpoint_f() {
        return dewpoint_f;
    }
    public void setDewpoint_f(double dewpoint_f) {
        this.dewpoint_f = dewpoint_f;
    }
    public double getVis_km() {
        return vis_km;
    }
    public void setVis_km(double vis_km) {
        this.vis_km = vis_km;
    }
    public double getVis_miles() {
        return vis_miles;
    }
    public void setVis_miles(double vis_miles) {
        this.vis_miles = vis_miles;
    }
    public double getUv() {
        return uv;
    }
    public void setUv(double uv) {
        this.uv = uv;
    }
    public double getGust_mph() {
        return gust_mph;
    }
    public void setGust_mph(double gust_mph) {
        this.gust_mph = gust_mph;
    }
    public double getGust_kph() {
        return gust_kph;
    }
    public void setGust_kph(double gust_kph) {
        this.gust_kph = gust_kph;
    }

}


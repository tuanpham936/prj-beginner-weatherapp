package com.project.weatherapp.models;

public class APICondition {
    private String text;
    private String icon;
    private int code;
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
}

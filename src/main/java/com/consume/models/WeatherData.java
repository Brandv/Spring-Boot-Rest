package com.consume.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherData {

    private double temp;
    private int humidity;

    public WeatherData() {
    }

    public WeatherData(double temp, int humidity) {
        this.temp = temp;
        this.humidity = humidity;
    }

    public String getTemp() {
		return String.format("%.2f", this.temp * 9/5 - 459.67); // Why does this not cast?
    }

    public int getHumidity() {
        return humidity;
    }

    @Override
    public String toString(){
        return "temp: " + getTemp() + " Degrees" + ", humidity: " + humidity + "%";
    }
}



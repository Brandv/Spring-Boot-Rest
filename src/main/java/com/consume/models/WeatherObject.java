package com.consume.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherObject {

    //Field names must match JSON Keys
    private Long id;
    private String name;
    private WeatherData main;

    public WeatherObject() {
    }

    public WeatherObject(Long id, String name, WeatherData main) {
        this.id = id;
        this.name = name;
        this.main = main;
    }

    @Override
    public String toString(){
        return "{ id: " + id + ", name: " + name + ", weather{ " + main.toString() + " } }";
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public WeatherData getMain() {
        return main;
    }
}

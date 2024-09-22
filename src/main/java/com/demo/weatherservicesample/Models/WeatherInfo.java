package com.demo.weatherservicesample.Models;

import lombok.Data;

@Data
public class WeatherInfo {

    private double longs;
    private double lats;
    private double temp;
    private double mintemp;
    private double maxtemp;
    private double pressure;
    private double humidity;
    private double sea_level;
}

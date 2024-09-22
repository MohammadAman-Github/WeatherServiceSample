package com.demo.weatherservicesample.Service;

import com.demo.weatherservicesample.Models.WeatherInfo;

public interface WeatherService {
    public WeatherInfo getWeatherInfo(double longs, double lats);
}

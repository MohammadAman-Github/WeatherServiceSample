package com.demo.weatherservicesample.Controller;

import com.demo.weatherservicesample.Models.WeatherInfo;
import com.demo.weatherservicesample.Service.WeatherAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("weather/")
public class Controller {
    @Autowired
    public WeatherAppService WeatherAppService;
    @GetMapping("/now/longs/{longs}/lats/{lats}")
    public ResponseEntity<WeatherInfo> getWeatherInfo(@PathVariable double longs, @PathVariable double lats) {
        WeatherInfo weatherInfo = WeatherAppService.getWeatherInfo(longs , lats);

        return new ResponseEntity<>(weatherInfo, HttpStatusCode.valueOf(200));
    }
}


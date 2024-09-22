package com.demo.weatherservicesample.Service;

import com.demo.weatherservicesample.DTOs.WeatherServiceDTO;
import com.demo.weatherservicesample.Models.WeatherInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherAppService implements WeatherService {
    @Override
    public WeatherInfo getWeatherInfo(double longs, double lats) {
       String API_Key = "ee6664d9e7a872f17cd643c15f48ac2b";
       String API_URL = "https://api.openweathermap.org/data/2.5/weather";
        RestTemplate restTemplate = new RestTemplate();
        String url = API_URL + "?lat=" + lats + "&lon=" + longs + "&appid=" + API_Key;

        WeatherServiceDTO weatherServiceDTO = restTemplate.getForObject(url, WeatherServiceDTO.class);
         return convertDTOintoWeatherInfo(weatherServiceDTO);
    }

    private WeatherInfo convertDTOintoWeatherInfo(WeatherServiceDTO dto) {
        WeatherInfo weatherInfo = new WeatherInfo();

        // Set coordinates
        if (dto.getCoord() != null) {
            weatherInfo.setLongs(dto.getCoord().getLongitude());
            weatherInfo.setLats(dto.getCoord().getLatitude());
        }

        // Set weather information
        if (dto.getMain() != null) {
            weatherInfo.setTemp(dto.getMain().getTemperature());
            weatherInfo.setMintemp(dto.getMain().getMinTemperature());
            weatherInfo.setMaxtemp(dto.getMain().getMaxTemperature());
            weatherInfo.setPressure(dto.getMain().getPressure());
            weatherInfo.setHumidity(dto.getMain().getHumidity());
            weatherInfo.setSea_level(dto.getMain().getSeaLevel());
        }

        return weatherInfo;

    }

}

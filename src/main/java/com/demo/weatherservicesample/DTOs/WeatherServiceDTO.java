package com.demo.weatherservicesample.DTOs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeatherServiceDTO {

    @Data
    public static class Coord {
        @JsonProperty("lon")
        private double longitude;

        @JsonProperty("lat")
        private double latitude;
    }

    // Nested class for main weather details (main)
    @Data
    public static class Main {
        @JsonProperty("temp")
        private double temperature;

        @JsonProperty("temp_min")
        private double minTemperature;

        @JsonProperty("temp_max")
        private double maxTemperature;

        private double pressure;

        private double humidity;

        @JsonProperty("sea_level")
        private double seaLevel;
    }

    // Include the Coord and Main fields
    private Coord coord;

    private Main main;

}

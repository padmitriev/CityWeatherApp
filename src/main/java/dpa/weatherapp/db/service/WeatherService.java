package dpa.weatherapp.db.service;

import dpa.weatherapp.db.entity.WeatherRequest;

import java.util.List;

public interface WeatherService {
    List<WeatherRequest> getRecentRequests();

    void saveWeatherRequest(WeatherRequest request);
}

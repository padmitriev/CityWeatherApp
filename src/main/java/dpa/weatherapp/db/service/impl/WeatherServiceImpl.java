package dpa.weatherapp.db.service.impl;

import dpa.weatherapp.db.entity.WeatherRequest;
import dpa.weatherapp.db.repository.WeatherRequestRepository;
import dpa.weatherapp.db.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WeatherServiceImpl implements WeatherService {

    private final WeatherRequestRepository weatherRequestRepository;

    @Override
    public List<WeatherRequest> getRecentRequests() {
        return weatherRequestRepository.findTop10ByOrderByRequestTimeDesc();
    }

    @Override
    public void saveWeatherRequest(WeatherRequest request) {
        weatherRequestRepository.save(request);
    }
}

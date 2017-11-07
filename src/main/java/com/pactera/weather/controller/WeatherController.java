/**
 * 
 */
package com.pactera.weather.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pactera.weather.model.CityBean;
import com.pactera.weather.model.WeatherResult;
import com.pactera.weather.service.WeatherService;

/**
 * This controller is getting the selected city name and calls the respective
 * service class to get the weather data
 * 
 * @author Anand
 *
 */
@RestController
public class WeatherController {

	@Autowired
	WeatherService weatherService;

	/**
	 * This method gets the city name and gets the weather data
	 * 
	 * @param city
	 * @param error
	 * @return
	 */
	@PostMapping("/api/search")
	public ResponseEntity<?> fetchWeather(@Valid @RequestBody CityBean city, Errors error) {

		WeatherResult result = weatherService.fetchWeather(city.getCityName());
		return ResponseEntity.ok(result);
	}

	/**
	 * @param weatherService
	 *            the weatherService to set
	 */
	public void setWeatherService(WeatherService weatherService) {
		this.weatherService = weatherService;
	}

}

/**
 * 
 */
package com.pactera.weather.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pactera.weather.model.WeatherReport;
import com.pactera.weather.model.WeatherResult;
import com.pactera.weather.util.WeatherConstants;
import com.pactera.weather.util.WeatherUtil;

/**
 * This class implements the interface methods to get the weather report for the
 * given city
 * 
 * @author Anand
 *
 */
@Service
public class WeatherServiceImpl implements WeatherService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pactera.weather.service.WeatherService#fetchWeather(java.lang.String)
	 */
	@Override
	public WeatherResult fetchWeather(String city) {
		RestTemplate restTemplate = new RestTemplate();

		Map<String, String> params = new HashMap<String, String>();
		params.put("city", city);
		params.put("appKey", WeatherConstants.APP_KEY);

		WeatherReport rep = restTemplate.getForObject(WeatherConstants.WEATHER_API_URI, WeatherReport.class, params);

		WeatherResult result = new WeatherResult();
		result.setCityName(city);
		result.setWeather(rep.getWeather().get(0).getDescription());
		result.setTemperature(WeatherUtil.convertKelvinToCelsius(rep.getMain().getTemp()));
		result.setTime(WeatherUtil.getLocalTime());
		result.setWind(WeatherUtil.convertSpeedToKM(rep.getWind().getSpeed()));
		System.out.println(result);

		return result;
	}
}

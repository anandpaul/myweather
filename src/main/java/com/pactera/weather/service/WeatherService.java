/**
 * 
 */
package com.pactera.weather.service;

import com.pactera.weather.model.WeatherResult;

/**
 * This interface has method signature to call the respective API to get the
 * weather data
 * 
 * @author Anand
 *
 */

public interface WeatherService {

	WeatherResult fetchWeather(String city);
}

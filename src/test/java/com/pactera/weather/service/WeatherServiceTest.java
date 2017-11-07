/**
 * 
 */
package com.pactera.weather.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pactera.weather.MyWeatherApplicationTests;
import com.pactera.weather.model.WeatherResult;

/**
 * @author Anand
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class WeatherServiceTest extends MyWeatherApplicationTests{

	@Autowired
	private WeatherService weatherService;

	@Test
	public void testFetchWeather() {

		WeatherResult result = weatherService.fetchWeather("Melbourne");
		assertEquals("Melbourne", result.getCityName());
	}
}

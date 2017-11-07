/**
 * 
 */
package com.pactera.weather.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anand
 *
 */
public class WeatherReport {
	private List<Weather> weather = new ArrayList<Weather>();
	private Temperature main;
	private Wind wind;

	/**
	 * @return the weather
	 */
	public List<Weather> getWeather() {
		return weather;
	}

	/**
	 * @param weather
	 *            the weather to set
	 */
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	/**
	 * @return the main
	 */
	public Temperature getMain() {
		return main;
	}

	/**
	 * @param main
	 *            the main to set
	 */
	public void setMain(Temperature main) {
		this.main = main;
	}

	/**
	 * @return the wind
	 */
	public Wind getWind() {
		return wind;
	}

	/**
	 * @param wind
	 *            the wind to set
	 */
	public void setWind(Wind wind) {
		this.wind = wind;
	}

}

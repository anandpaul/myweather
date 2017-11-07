/**
 * 
 */
package com.pactera.weather.model;

/**
 * @author Anand
 *
 */
public class WeatherResult {

	private String cityName;
	private String weather;
	private String time;
	private String temperature;
	private String wind;

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName
	 *            the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the weather
	 */
	public String getWeather() {
		return weather;
	}

	/**
	 * @param weather
	 *            the weather to set
	 */
	public void setWeather(String weather) {
		this.weather = weather;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time
	 *            the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return the temperature
	 */
	public String getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature
	 *            the temperature to set
	 */
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the wind
	 */
	public String getWind() {
		return wind;
	}

	/**
	 * @param wind
	 *            the wind to set
	 */
	public void setWind(String wind) {
		this.wind = wind;
	}

}

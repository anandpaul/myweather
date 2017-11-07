/**
 * 
 */
package com.pactera.weather.util;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * This class some utility methods used for the application
 * 
 * @author Anand
 *
 */
public class WeatherUtil {

	/**
	 * This method converts the Kelvin value to Celsius
	 * 
	 * @param kelvin
	 * @return
	 */
	public static String convertKelvinToCelsius(float kelvin) {
		DecimalFormat df = new DecimalFormat("#.##");
		float celsius = kelvin - 273.15F;
		return String.valueOf(df.format(celsius)+' ');
	}

	/**
	 * This method converts the given speed in m/s to km/h
	 * 
	 * @param meterPerSec
	 * @return
	 */
	public static String convertSpeedToKM(float meterPerSec) {
		DecimalFormat df = new DecimalFormat("#.##");
		return String.valueOf(df.format(meterPerSec * 3.6)) + " km/h";
	}

	/**
	 * This method gets the local time, converts them into DAY HH:MM AM/PM
	 * format and send it to the service
	 * 
	 * @return
	 */
	public static String getLocalTime() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE HH:mm a");
		String formatDateTime = now.format(formatter);
		return formatDateTime;
	}
}

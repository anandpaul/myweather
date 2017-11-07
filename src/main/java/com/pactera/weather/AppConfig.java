/**
 * 
 */
package com.pactera.weather;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * This is the config file which loads the application properties and create the
 * city names list
 * 
 * @author Anand
 */
@Configuration
@PropertySource(value = "classpath:application.properties")
public class AppConfig {

	@Value("#{'${app.weather.cities}'.split(',')}")
	private List<String> cities;

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	/**
	 * @return the cities
	 */
	public List<String> getCities() {
		return cities;
	}

	/**
	 * @param cities
	 *            the cities to set
	 */
	public void setCities(List<String> cities) {
		this.cities = cities;
	}

}
package com.pactera.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main method run by spring boot to load the application
 * 
 * @author Anand
 *
 */
@SpringBootApplication
public class MyWeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyWeatherApplication.class, args);
	}
}

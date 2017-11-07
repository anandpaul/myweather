/**
 * 
 */
package com.pactera.weather.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pactera.weather.AppConfig;
import com.pactera.weather.model.CityBean;

/**
 * 
 * This is the front controller to load the home page with the cities loaded
 * 
 * @author Anand
 * 
 */
@Controller
public class HomeController {

	/**
	 * This method loads the home page with the cities derived from the property
	 * file
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/")
	public String home(Model model) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// Get the city names thru properties loader
		AppConfig appConfig = context.getBean(AppConfig.class);

		List<CityBean> citiesList = new ArrayList<CityBean>();
		for (String city : appConfig.getCities()) {
			CityBean c = new CityBean();
			c.setCityName(city);
			citiesList.add(c);
		}

		model.addAttribute("cityNames", citiesList);
		return "home";
	}
}

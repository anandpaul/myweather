/**
 * 
 */
package com.pactera.weather.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.pactera.weather.MyWeatherApplication;
import com.pactera.weather.MyWeatherApplicationTests;

/**
 * @author Anand
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyWeatherApplication.class)
@SpringBootTest
public class WeatherControllerTest extends MyWeatherApplicationTests{
	
	private MockMvc mockMvc;
	
	@Autowired
    private WebApplicationContext wac;

	@Before
	public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();

	}
	
	@Test
	public void homeTest() throws Exception{
		mockMvc.perform(post("/api/search")).andExpect(MockMvcResultMatchers.status().isOk());
//		.andExpect(content().contentType("application/json;charset=UTF-8"))
//		.andExpect(jsonPath("cityName").value("Melbourne"));
	}
}

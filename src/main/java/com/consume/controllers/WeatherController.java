package com.consume.controllers;

import com.consume.models.WeatherObject;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("weather")
public class WeatherController {

	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		System.out.println("In rest template");
		return builder.build();
	}

	@RequestMapping("")
	public String findWeather(HttpServletRequest request, RestTemplate restTemplate, Model model) {

		String city = request.getParameter("city");
		String weatherURL = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&APPID=a19c51e19ca8dd2c9123267eba9c1eee";

		try {
			System.out.println("step 0");
			restTemplate.getForObject(weatherURL, WeatherObject.class);
			System.out.println("step 1");
			WeatherObject weather = restTemplate.getForObject(weatherURL, WeatherObject.class);

			model.addAttribute("city", weather.getName());
			model.addAttribute("temp", weather.getMain().getTemp() + "*");
			model.addAttribute("humidity", weather.getMain().getHumidity() + "%");

			return "weather";
		}
		catch (HttpClientErrorException e) {
			System.out.println("caught");
			model.addAttribute("error", true);
			return "weather";
		}


	}
}

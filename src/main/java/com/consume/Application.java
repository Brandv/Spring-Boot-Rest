package com.consume;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		return builder.build();
//	}
//
//	@Bean
//	public CommandLineRunner go(RestTemplate restTemplate) throws Exception {
//		return args -> {
//
//			String weatherURL = "http://api.openweathermap.org/data/2.5/weather?q=Chicago&APPID=a19c51e19ca8dd2c9123267eba9c1eee";
//			WeatherObject weather = restTemplate.getForObject(weatherURL, WeatherObject.class);
//			log.info(weather.toString());
//
//			String quotesURL = "http://quotes.rest/qod.json";
//			QuoteObject quote = restTemplate.getForObject(quotesURL, QuoteObject.class);
//			log.info(quote.toString());


//		};
//	}
}

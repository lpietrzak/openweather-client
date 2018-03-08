package com.capsilon.recruitment.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capsilon.recruitment.model.CityReport;
import com.capsilon.recruitment.openweathermap.OpenWeatherMapClient;

@RestController
@CacheConfig(cacheNames = { "reports" })
public class WeatherService {

	private static final Logger LOGGER = LoggerFactory.getLogger(WeatherService.class);

	@Value("${openweathermap.appid}")
	private String apiKey;

	@Autowired
	private OpenWeatherMapClient openWeatherMapClient;

	@Cacheable
	@RequestMapping(method = RequestMethod.GET, path = "/report", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public CityReport report(@RequestParam("city") String city, @RequestParam("countryCode") String countryCode) {
		LOGGER.info("Start generate report for city {} and country code {}", city, countryCode);
		String result = openWeatherMapClient.getWeatherData(city, countryCode);
		// Calculate all necessary data

		// Build result
		CityReport cityReport = new CityReport();

		return cityReport.withCityName(city).withCountryCode(countryCode).withAverageTemperature("10d")
				.withAverageHumidity("10d").withAveragePressure("19");
	}

}

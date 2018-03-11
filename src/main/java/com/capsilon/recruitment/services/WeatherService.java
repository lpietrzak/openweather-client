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

import com.capsilon.recruitment.model.City;
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

	@Autowired
	private ReportService reportService;

	@Cacheable
	@RequestMapping(method = RequestMethod.GET, path = "/report", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public CityReport report(@RequestParam("city") String cityName, @RequestParam("countryCode") String countryCode) {
		LOGGER.info("Start generate report for city {} and country code {}", cityName, countryCode);
		City city = openWeatherMapClient.getWeatherData(cityName + "," + countryCode, apiKey);
		return reportService.report(city).withCityName(cityName).withCountryCode(countryCode);
	}

}

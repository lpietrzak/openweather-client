package com.capsilon.recruitment.openweathermap;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "openweathermap", url = "${openweathermap.url}")
public interface OpenWeatherMapClient {

	/**
	 * Retrive data from openweathermap service
	 * Sample url: data/2.5/forecast?q=Warsaw,PL&appid=b6907d289e10d714a6e88b30761fae22
	 * @param cityAndCountryCode
	 * @param apiKey
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/data/2.5/forecast")
	String getWeatherData(@RequestParam("q") String cityAndCountryCode, @RequestParam("appid") String apiKey);
}

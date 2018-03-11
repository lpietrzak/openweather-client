package com.capsilon.recruitment.services;

import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.capsilon.recruitment.model.City;
import com.capsilon.recruitment.model.CityReport;
import com.google.common.util.concurrent.AtomicDouble;

@Service
public class ReportService {

	private static final Logger LOGGER = LoggerFactory.getLogger(ReportService.class);

	public CityReport report(City city) {

		AtomicDouble aveTemp = new AtomicDouble(0d);
		AtomicDouble aveHumidity = new AtomicDouble(0d);
		AtomicDouble avePreasuer = new AtomicDouble(0d);

		AtomicInteger counter = new AtomicInteger(0);

		city.getList().stream().filter(item -> item.getMain() != null).forEach(item -> {
			LOGGER.info("Temperatur {}, humidity {}, preasuer {}", item.getMain().getTemp(),
					item.getMain().getHumidity(), item.getMain().getPressure());
			aveTemp.addAndGet(item.getMain().getTemp());
			LOGGER.debug("Temp -> {}", aveTemp.get());
			aveHumidity.addAndGet(item.getMain().getHumidity());
			LOGGER.debug("Humidity -> {}", aveHumidity.get());
			avePreasuer.addAndGet(item.getMain().getPressure());
			LOGGER.debug("Preasure -> {}", avePreasuer.get());
			counter.incrementAndGet();

		});

		return new CityReport().withAverageTemperature(String.valueOf(aveTemp.get() / counter.get()))
				.withAverageHumidity(String.valueOf(aveHumidity.get() / counter.get()))
				.withAveragePressure(String.valueOf(avePreasuer.get() / counter.get()));
	}
}

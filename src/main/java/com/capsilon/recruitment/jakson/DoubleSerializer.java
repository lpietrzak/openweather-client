package com.capsilon.recruitment.jakson;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class DoubleSerializer extends JsonSerializer<String> {

	private int precision = 2;

	@Override
	public void serialize(String value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException, JsonProcessingException {
		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(precision, RoundingMode.HALF_UP);
		gen.writeNumber(bd.doubleValue());
	}
}

package com.capsilon.recruitment.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.capsilon.recruitment.jakson.DoubleSerializer;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "cityName", "countryCode", "averageTemperature", "averagePressure", "averageHumidity" })
public class CityReport implements Serializable {

	@JsonProperty("cityName")
	private String cityName;
	@JsonProperty("countryCode")
	private String countryCode;
	@JsonProperty("averageTemperature")
	private String averageTemperature;
	@JsonProperty("averagePressure")
	private String averagePressure;
	@JsonProperty("averageHumidity")
	private String averageHumidity;
	@JsonIgnore
	@Valid
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 46020976979973009L;

	@JsonProperty("cityName")
	public String getCityName() {
		return cityName;
	}

	@JsonProperty("cityName")
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public CityReport withCityName(String cityName) {
		this.cityName = cityName;
		return this;
	}

	@JsonProperty("countryCode")
	public String getCountryCode() {
		return countryCode;
	}

	@JsonProperty("countryCode")
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public CityReport withCountryCode(String countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	@JsonProperty("averageTemperature")
	@JsonSerialize(using = DoubleSerializer.class)
	public String getAverageTemperature() {
		return averageTemperature;
	}

	@JsonProperty("averageTemperature")
	@JsonSerialize(using = DoubleSerializer.class)
	public void setAverageTemperature(String averageTemperature) {
		this.averageTemperature = averageTemperature;
	}

	public CityReport withAverageTemperature(String averageTemperature) {
		this.averageTemperature = averageTemperature;
		return this;
	}

	@JsonProperty("averagePressure")
	@JsonSerialize(using = DoubleSerializer.class)
	public String getAveragePressure() {
		return averagePressure;
	}

	@JsonProperty("averagePressure")
	@JsonSerialize(using = DoubleSerializer.class)
	public void setAveragePressure(String averagePressure) {
		this.averagePressure = averagePressure;
	}

	public CityReport withAveragePressure(String averagePressure) {
		this.averagePressure = averagePressure;
		return this;
	}

	@JsonProperty("averageHumidity")
	@JsonSerialize(using = DoubleSerializer.class)
	public String getAverageHumidity() {
		return averageHumidity;
	}

	@JsonProperty("averageHumidity")
	@JsonSerialize(using = DoubleSerializer.class)
	public void setAverageHumidity(String averageHumidity) {
		this.averageHumidity = averageHumidity;
	}

	public CityReport withAverageHumidity(String averageHumidity) {
		this.averageHumidity = averageHumidity;
		return this;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public CityReport withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(additionalProperties).append(averageTemperature).append(cityName)
				.append(countryCode).append(averagePressure).append(averageHumidity).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof CityReport) == false) {
			return false;
		}
		CityReport rhs = ((CityReport) other);
		return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties)
				.append(averageTemperature, rhs.averageTemperature).append(cityName, rhs.cityName)
				.append(countryCode, rhs.countryCode).append(averagePressure, rhs.averagePressure)
				.append(averageHumidity, rhs.averageHumidity).isEquals();
	}

}
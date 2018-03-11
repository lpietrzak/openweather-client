package com.capsilon.recruitment.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "temp", "temp_min", "temp_max", "pressure", "sea_level", "grnd_level", "humidity", "temp_kf" })
public class Main implements Serializable {

	@JsonProperty("temp")
	private Double temp;
	@JsonProperty("temp_min")
	private Double tempMin;
	@JsonProperty("temp_max")
	private Double tempMax;
	@JsonProperty("pressure")
	private Double pressure;
	@JsonProperty("sea_level")
	private Double seaLevel;
	@JsonProperty("grnd_level")
	private Double grndLevel;
	@JsonProperty("humidity")
	private Integer humidity;
	@JsonProperty("temp_kf")
	private Integer tempKf;
	@JsonIgnore
	@Valid
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 2760477376552801212L;

	@JsonProperty("temp")
	public Double getTemp() {
		return temp;
	}

	@JsonProperty("temp")
	public void setTemp(Double temp) {
		this.temp = temp;
	}

	public Main withTemp(Double temp) {
		this.temp = temp;
		return this;
	}

	@JsonProperty("temp_min")
	public Double getTempMin() {
		return tempMin;
	}

	@JsonProperty("temp_min")
	public void setTempMin(Double tempMin) {
		this.tempMin = tempMin;
	}

	public Main withTempMin(Double tempMin) {
		this.tempMin = tempMin;
		return this;
	}

	@JsonProperty("temp_max")
	public Double getTempMax() {
		return tempMax;
	}

	@JsonProperty("temp_max")
	public void setTempMax(Double tempMax) {
		this.tempMax = tempMax;
	}

	public Main withTempMax(Double tempMax) {
		this.tempMax = tempMax;
		return this;
	}

	@JsonProperty("pressure")
	public Double getPressure() {
		return pressure;
	}

	@JsonProperty("pressure")
	public void setPressure(Double pressure) {
		this.pressure = pressure;
	}

	public Main withPressure(Double pressure) {
		this.pressure = pressure;
		return this;
	}

	@JsonProperty("sea_level")
	public Double getSeaLevel() {
		return seaLevel;
	}

	@JsonProperty("sea_level")
	public void setSeaLevel(Double seaLevel) {
		this.seaLevel = seaLevel;
	}

	public Main withSeaLevel(Double seaLevel) {
		this.seaLevel = seaLevel;
		return this;
	}

	@JsonProperty("grnd_level")
	public Double getGrndLevel() {
		return grndLevel;
	}

	@JsonProperty("grnd_level")
	public void setGrndLevel(Double grndLevel) {
		this.grndLevel = grndLevel;
	}

	public Main withGrndLevel(Double grndLevel) {
		this.grndLevel = grndLevel;
		return this;
	}

	@JsonProperty("humidity")
	public Integer getHumidity() {
		return humidity;
	}

	@JsonProperty("humidity")
	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}

	public Main withHumidity(Integer humidity) {
		this.humidity = humidity;
		return this;
	}

	@JsonProperty("temp_kf")
	public Integer getTempKf() {
		return tempKf;
	}

	@JsonProperty("temp_kf")
	public void setTempKf(Integer tempKf) {
		this.tempKf = tempKf;
	}

	public Main withTempKf(Integer tempKf) {
		this.tempKf = tempKf;
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

	public Main withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(seaLevel).append(humidity).append(pressure).append(grndLevel)
				.append(tempMax).append(additionalProperties).append(temp).append(tempKf).append(tempMin).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Main) == false) {
			return false;
		}
		Main rhs = ((Main) other);
		return new EqualsBuilder().append(seaLevel, rhs.seaLevel).append(humidity, rhs.humidity)
				.append(pressure, rhs.pressure).append(grndLevel, rhs.grndLevel).append(tempMax, rhs.tempMax)
				.append(additionalProperties, rhs.additionalProperties).append(temp, rhs.temp)
				.append(tempKf, rhs.tempKf).append(tempMin, rhs.tempMin).isEquals();
	}
}
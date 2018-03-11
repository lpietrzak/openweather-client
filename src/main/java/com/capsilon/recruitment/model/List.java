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
@JsonPropertyOrder({ "dt", "main", "weather", "clouds", "wind", "sys", "dt_txt", "rain", "snow" })
public class List implements Serializable {

	@JsonProperty("dt")
	private Integer dt;
	@JsonProperty("main")
	@Valid
	private Main main;
	@JsonProperty("weather")
	@Valid
	private java.util.List<Weather> weather = null;
	@JsonProperty("clouds")
	@Valid
	private Clouds clouds;
	@JsonProperty("wind")
	@Valid
	private Wind wind;
	@JsonProperty("sys")
	@Valid
	private Sys sys;
	@JsonProperty("dt_txt")
	private String dtTxt;
	@JsonProperty("rain")
	@Valid
	private Rain rain;
	@JsonProperty("snow")
	@Valid
	private Snow snow;
	@JsonIgnore
	@Valid
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -1297521593367024473L;

	@JsonProperty("dt")
	public Integer getDt() {
		return dt;
	}

	@JsonProperty("dt")
	public void setDt(Integer dt) {
		this.dt = dt;
	}

	public List withDt(Integer dt) {
		this.dt = dt;
		return this;
	}

	@JsonProperty("main")
	public Main getMain() {
		return main;
	}

	@JsonProperty("main")
	public void setMain(Main main) {
		this.main = main;
	}

	public List withMain(Main main) {
		this.main = main;
		return this;
	}

	@JsonProperty("weather")
	public java.util.List<Weather> getWeather() {
		return weather;
	}

	@JsonProperty("weather")
	public void setWeather(java.util.List<Weather> weather) {
		this.weather = weather;
	}

	public List withWeather(java.util.List<Weather> weather) {
		this.weather = weather;
		return this;
	}

	@JsonProperty("clouds")
	public Clouds getClouds() {
		return clouds;
	}

	@JsonProperty("clouds")
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public List withClouds(Clouds clouds) {
		this.clouds = clouds;
		return this;
	}

	@JsonProperty("wind")
	public Wind getWind() {
		return wind;
	}

	@JsonProperty("wind")
	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public List withWind(Wind wind) {
		this.wind = wind;
		return this;
	}

	@JsonProperty("sys")
	public Sys getSys() {
		return sys;
	}

	@JsonProperty("sys")
	public void setSys(Sys sys) {
		this.sys = sys;
	}

	public List withSys(Sys sys) {
		this.sys = sys;
		return this;
	}

	@JsonProperty("dt_txt")
	public String getDtTxt() {
		return dtTxt;
	}

	@JsonProperty("dt_txt")
	public void setDtTxt(String dtTxt) {
		this.dtTxt = dtTxt;
	}

	public List withDtTxt(String dtTxt) {
		this.dtTxt = dtTxt;
		return this;
	}

	@JsonProperty("rain")
	public Rain getRain() {
		return rain;
	}

	@JsonProperty("rain")
	public void setRain(Rain rain) {
		this.rain = rain;
	}

	public List withRain(Rain rain) {
		this.rain = rain;
		return this;
	}

	@JsonProperty("snow")
	public Snow getSnow() {
		return snow;
	}

	@JsonProperty("snow")
	public void setSnow(Snow snow) {
		this.snow = snow;
	}

	public List withSnow(Snow snow) {
		this.snow = snow;
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

	public List withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(clouds).append(dt).append(wind).append(additionalProperties).append(sys)
				.append(snow).append(dtTxt).append(weather).append(rain).append(main).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof List) == false) {
			return false;
		}
		List rhs = ((List) other);
		return new EqualsBuilder().append(clouds, rhs.clouds).append(dt, rhs.dt).append(wind, rhs.wind)
				.append(additionalProperties, rhs.additionalProperties).append(sys, rhs.sys).append(snow, rhs.snow)
				.append(dtTxt, rhs.dtTxt).append(weather, rhs.weather).append(rain, rhs.rain).append(main, rhs.main)
				.isEquals();
	}

}
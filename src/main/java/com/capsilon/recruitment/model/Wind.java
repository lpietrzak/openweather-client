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
@JsonPropertyOrder({ "speed", "deg" })
public class Wind implements Serializable {

	@JsonProperty("speed")
	private Double speed;
	@JsonProperty("deg")
	private Double deg;
	@JsonIgnore
	@Valid
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -2696040277816145084L;

	@JsonProperty("speed")
	public Double getSpeed() {
		return speed;
	}

	@JsonProperty("speed")
	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public Wind withSpeed(Double speed) {
		this.speed = speed;
		return this;
	}

	@JsonProperty("deg")
	public Double getDeg() {
		return deg;
	}

	@JsonProperty("deg")
	public void setDeg(Double deg) {
		this.deg = deg;
	}

	public Wind withDeg(Double deg) {
		this.deg = deg;
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

	public Wind withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(speed).append(additionalProperties).append(deg).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Wind) == false) {
			return false;
		}
		Wind rhs = ((Wind) other);
		return new EqualsBuilder().append(speed, rhs.speed).append(additionalProperties, rhs.additionalProperties)
				.append(deg, rhs.deg).isEquals();
	}

}
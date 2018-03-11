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
@JsonPropertyOrder({ "cod", "message", "cnt", "list", "city" })
public class City implements Serializable {

	@JsonProperty("cod")
	private String cod;
	@JsonProperty("message")
	private Double message;
	@JsonProperty("cnt")
	private Integer cnt;
	@JsonProperty("list")
	@Valid
	private java.util.List<com.capsilon.recruitment.model.List> list = null;
	@JsonProperty("city")
	@Valid
	private City_ city;
	@JsonIgnore
	@Valid
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -6646192471800233692L;

	@JsonProperty("cod")
	public String getCod() {
		return cod;
	}

	@JsonProperty("cod")
	public void setCod(String cod) {
		this.cod = cod;
	}

	public City withCod(String cod) {
		this.cod = cod;
		return this;
	}

	@JsonProperty("message")
	public Double getMessage() {
		return message;
	}

	@JsonProperty("message")
	public void setMessage(Double message) {
		this.message = message;
	}

	public City withMessage(Double message) {
		this.message = message;
		return this;
	}

	@JsonProperty("cnt")
	public Integer getCnt() {
		return cnt;
	}

	@JsonProperty("cnt")
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}

	public City withCnt(Integer cnt) {
		this.cnt = cnt;
		return this;
	}

	@JsonProperty("list")
	public java.util.List<com.capsilon.recruitment.model.List> getList() {
		return list;
	}

	@JsonProperty("list")
	public void setList(java.util.List<com.capsilon.recruitment.model.List> list) {
		this.list = list;
	}

	public City withList(java.util.List<com.capsilon.recruitment.model.List> list) {
		this.list = list;
		return this;
	}

	@JsonProperty("city")
	public City_ getCity() {
		return city;
	}

	@JsonProperty("city")
	public void setCity(City_ city) {
		this.city = city;
	}

	public City withCity(City_ city) {
		this.city = city;
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

	public City withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(message).append(cnt).append(cod).append(additionalProperties).append(list)
				.append(city).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof City) == false) {
			return false;
		}
		City rhs = ((City) other);
		return new EqualsBuilder().append(message, rhs.message).append(cnt, rhs.cnt).append(cod, rhs.cod)
				.append(additionalProperties, rhs.additionalProperties).append(list, rhs.list).append(city, rhs.city)
				.isEquals();
	}

}
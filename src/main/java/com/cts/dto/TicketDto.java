package com.cts.dto;

import java.io.Serializable;

import org.joda.time.LocalDateTime;

import com.cts.serializable.LocalDateTimeJacksonDeSerializable;
import com.cts.serializable.LocalDateTimeJacksonSerializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TicketDto implements Serializable {

	private long id;
	@JsonDeserialize(using = LocalDateTimeJacksonDeSerializable.class)
	@JsonSerialize(using = LocalDateTimeJacksonSerializable.class)
	private LocalDateTime pickupDate;
	private int companyId;
	private String companyName;
	private int quantity;
	private int startNumber;
	private int endNumber;
	private String numberInterval; // format: startNumber - endNumber
	@JsonDeserialize(using = LocalDateTimeJacksonDeSerializable.class)
	@JsonSerialize(using = LocalDateTimeJacksonSerializable.class)
	private LocalDateTime deliveryDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNumberInterval(String numberInterval) {
		this.numberInterval = numberInterval;
	}

	public LocalDateTime getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(LocalDateTime pickupDate) {
		this.pickupDate = pickupDate;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getStartNumber() {
		return startNumber;
	}

	public void setStartNumber(int startNumber) {
		this.startNumber = startNumber;
	}

	public int getEndNumber() {
		return endNumber;
	}

	public void setEndNumber(int endNumber) {
		this.endNumber = endNumber;
	}

	public String getNumberInterval() {
		return new StringBuilder().append(startNumber).append(" - ").append(endNumber).toString();
	}

	public LocalDateTime getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDateTime deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
}

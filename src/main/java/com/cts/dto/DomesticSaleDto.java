package com.cts.dto;

import java.io.Serializable;

import org.joda.time.LocalDateTime;

import com.cts.serializable.LocalDateTimeJacksonDeSerializable;
import com.cts.serializable.LocalDateTimeJacksonSerializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DomesticSaleDto implements Serializable {

	private long id;
	@JsonDeserialize(using = LocalDateTimeJacksonDeSerializable.class)
	@JsonSerialize(using = LocalDateTimeJacksonSerializable.class)
	private LocalDateTime date;
	private String colliery;
	private String company;
	private String books;
	private int quantity;
	private int ton;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getColliery() {
		return colliery;
	}

	public void setColliery(String colliery) {
		this.colliery = colliery;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getBooks() {
		return books;
	}

	public void setBooks(String books) {
		this.books = books;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTon() {
		return ton;
	}

	public void setTon(int ton) {
		this.ton = ton;
	}
}

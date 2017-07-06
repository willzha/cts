package com.cts.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import org.joda.time.LocalDateTime;

import com.cts.serializable.LocalDateTimeJacksonDeSerializable;
import com.cts.serializable.LocalDateTimeJacksonSerializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BillDto implements Serializable {

	private long billId;
	private long ticketId;
	@JsonDeserialize(using = LocalDateTimeJacksonDeSerializable.class)
	@JsonSerialize(using = LocalDateTimeJacksonSerializable.class)
	private LocalDateTime deliveryDate;
	private int useTicketCompanyId;
	private String useTicketCompanyName;
	private String books;
	private int usedQuantity;
	private int ton;
	private BigDecimal unitPrice;
	private BigDecimal totalPrice;
	private String state;
	@JsonDeserialize(using = LocalDateTimeJacksonDeSerializable.class)
	@JsonSerialize(using = LocalDateTimeJacksonSerializable.class)
	private LocalDateTime paymentDate;
	private BigDecimal paymentAmount;
	private String paymentMethod;
	private BigDecimal balance;

	public long getBillId() {
		return billId;
	}

	public void setBillId(long billId) {
		this.billId = billId;
	}

	public long getTicketId() {
		return ticketId;
	}

	public void setTicketId(long ticketId) {
		this.ticketId = ticketId;
	}

	public LocalDateTime getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDateTime deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public int getUseTicketCompanyId() {
		return useTicketCompanyId;
	}

	public void setUseTicketCompanyId(int useTicketCompanyId) {
		this.useTicketCompanyId = useTicketCompanyId;
	}

	public String getUseTicketCompanyName() {
		return useTicketCompanyName;
	}

	public void setUseTicketCompanyName(String useTicketCompanyName) {
		this.useTicketCompanyName = useTicketCompanyName;
	}

	public String getBooks() {
		return books;
	}

	public void setBooks(String books) {
		this.books = books;
	}

	public int getUsedQuantity() {
		return usedQuantity;
	}

	public void setUsedQuantity(int usedQuantity) {
		this.usedQuantity = usedQuantity;
	}

	public int getTon() {
		return ton;
	}

	public void setTon(int ton) {
		this.ton = ton;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

	public BigDecimal getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(BigDecimal paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
}

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

	private int billId;
	private int ticketId;
	@JsonDeserialize(using = LocalDateTimeJacksonDeSerializable.class)
	@JsonSerialize(using = LocalDateTimeJacksonSerializable.class)
	private LocalDateTime pickupDate;
	private String provideTicketCompanyName;
	private int quantity;
	private int startNumber;
	private int endNumber;
	private String numberInterval; // format: startNumber - endNumber
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

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public LocalDateTime getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(LocalDateTime pickupDate) {
		this.pickupDate = pickupDate;
	}

	public String getProvideTicketCompanyName() {
		return provideTicketCompanyName;
	}

	public void setProvideTicketCompanyName(String provideTicketCompanyName) {
		this.provideTicketCompanyName = provideTicketCompanyName;
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

	public void setNumberInterval(String numberInterval) {
		this.numberInterval = numberInterval;
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

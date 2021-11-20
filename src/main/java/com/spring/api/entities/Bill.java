package com.spring.api.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bill {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int billNumber;
private String billTo;
private LocalDate date;
private int price;
private int tax;
private int totalAmount;
public int getBillNumber() {
	return billNumber;
}
public void setBillNumber(int billNumber) {
	this.billNumber = billNumber;
}
public String getBillTo() {
	return billTo;
}
public void setBillTo(String billTo) {
	this.billTo = billTo;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getTax() {
	return tax;
}
public void setTax(int tax) {
	this.tax = tax;
}
public int getTotalAmount() {
	return totalAmount;
}
public void setTotalAmount(int totalAmount) {
	this.totalAmount = totalAmount;
}
public Bill(String billTo, LocalDate date, int price, int tax, int totalAmount) {
	super();
	this.billTo = billTo;
	this.date = date;
	this.price = price;
	this.tax = tax;
	this.totalAmount = totalAmount;
}
@Override
public String toString() {
	return "Bill [billNumber=" + billNumber + ", billTo=" + billTo + ", date=" + date + ", price=" + price + ", tax="
			+ tax + ", totalAmount=" + totalAmount + "]";
}
public Bill() {
	super();
	// TODO Auto-generated constructor stub
}
 

}

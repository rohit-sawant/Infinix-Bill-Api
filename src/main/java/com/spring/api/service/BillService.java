package com.spring.api.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.api.Repository.BillRepository;
import com.spring.api.entities.Bill;

@Service
public class BillService {
@Autowired
private BillRepository billRepository;

public List<Bill> findAll(){
	return (List<Bill>) this.billRepository.findAll();
}
public Bill findById(int id) {
	return this.billRepository.findByBillNumber(id);
}
public Bill save(Bill bill) {
	return this.billRepository.save(bill);
}
public List<Bill> findByDates(LocalDate date){
	return (List<Bill>) this.billRepository.findByDate(date);
}

//for initialization
public BillRepository getBillRepository() {
	return billRepository;
}

public void setBillRepository(BillRepository billRepository) {
	this.billRepository = billRepository;
}

public BillService(BillRepository billRepository) {
	super();
	this.billRepository = billRepository;
}

public BillService() {
	super();
	// TODO Auto-generated constructor stub
}
	
}

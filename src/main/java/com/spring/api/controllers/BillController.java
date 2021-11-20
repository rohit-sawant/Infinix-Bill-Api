package com.spring.api.controllers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.api.entities.Bill;
import com.spring.api.service.BillService;

@RestController
public class BillController {

	@Autowired
	BillService billService;
	
	
	public BillController(BillService billService) {
		super();
		this.billService = billService;
	}


	public BillService getBillService() {
		return billService;
	}


	public void setBillService(BillService billService) {
		this.billService = billService;
	}


//	@GetMapping("/")
//	public ResponseEntity<Bill> index() {
//		Bill bill = new Bill("rohit",LocalDate.now(),200,10,220);
//		return ResponseEntity.ok(this.billService.save(bill));
//	}
	
	@GetMapping({"/bills","/"})
	public ResponseEntity<Object> findAll(){
		return ResponseEntity.status(HttpStatus
				.OK).body(this.billService.findAll());
	}
	
	@PostMapping("/bills")
	public ResponseEntity<Bill> add(@RequestBody Bill bill) {
		return ResponseEntity.ok(this.billService.save(bill));
	}
	
	@GetMapping("/bills/{id}")
	public ResponseEntity<Bill> findById(@PathVariable("id") int id){
		return ResponseEntity.status(HttpStatus
				.OK).body(this.billService.findById(id));
	}
	@GetMapping("/bills/due/{date}")
	public ResponseEntity<Object> findbyDate(@PathVariable("date") String date){
		
		 DateFormat srcDf = new SimpleDateFormat("dd-MM-yyyy");
		 DateFormat destDf = new SimpleDateFormat("yyyy-MM-dd");
		 
         
         // parse the date string into Date object
         Date local;
		try {
			local = srcDf.parse(date);
			date = destDf.format(local);
			LocalDate localDate = LocalDate.parse(date);

				return ResponseEntity.ok(this.billService.findByDates(localDate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       return ResponseEntity.badRequest().build();
		 
	}
	
}

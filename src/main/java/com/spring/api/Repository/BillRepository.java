package com.spring.api.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.api.entities.Bill;
@Repository
public interface BillRepository extends CrudRepository<Bill, Integer>{
public Bill findByBillNumber(int id);
public List<Bill> findByDate(LocalDate date);
}

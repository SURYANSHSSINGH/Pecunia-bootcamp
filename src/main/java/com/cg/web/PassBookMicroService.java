package com.cg.web;

/**
*
* @author Suryansh
* 
* Controller class of  Passbook module.
* handles requests coming from the client specific to passbook methods
* Contains :Mapping to getTransactionById and getTransactions methods
* 
* 
* 
* 
*/

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.AccTransaction;
import com.cg.exceptions.AccountException;
import com.cg.exceptions.TransactionException;
import com.cg.service.IPassBookService;


@RestController
@CrossOrigin(origins= {"http://localhost:4200"})
public class PassBookMicroService {
	Logger logger = LoggerFactory.getLogger(PassBookMicroService.class);
	@Autowired
	private IPassBookService passBookService;
	
	@GetMapping("viewpassbook/{startdt}/{enddt}/{aid}")
	public List<AccTransaction> getPassBookService(@PathVariable("startdt") @DateTimeFormat(pattern="yyyy-M-d") LocalDate startDt,
			@PathVariable("enddt") @DateTimeFormat(pattern="yyyy-M-d")LocalDate endDt,@PathVariable("aid") String accountId) throws TransactionException, AccountException{
		
		return passBookService.getTransactions(startDt, endDt, accountId);
	}
	
	@GetMapping("viewpassbook/{aid}")
	public List<AccTransaction> getPassBookService(@PathVariable("aid") String accountId) throws TransactionException, AccountException {
		
		return passBookService.getTransactionById(accountId);
	}
	
	@GetMapping("viewall/{aid}")
	public List<AccTransaction> viewall(@PathVariable("aid") String accountId) throws TransactionException, AccountException{
        List<AccTransaction> elist = passBookService.getTransactionById(accountId);
		return elist;
		
	}
	
	

}
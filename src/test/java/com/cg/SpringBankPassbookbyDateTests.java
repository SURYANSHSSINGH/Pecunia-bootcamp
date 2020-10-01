package com.cg;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.entity.AccTransaction;
import com.cg.exceptions.AccountException;
import com.cg.exceptions.InvalidInputException;
import com.cg.exceptions.TransactionException;
import com.cg.service.IPassBookService;

@SpringBootTest
public class SpringBankPassbookbyDateTests {
	@Autowired
	private IPassBookService passbookservice;

	// Test With Valid Input
	@Test
	public void testtransactionbyDatefound() throws AccountException, TransactionException {
		List<AccTransaction> acc = passbookservice.getTransactions(LocalDate.of(2000, 01, 01),
				LocalDate.of(2020, 9, 29), "RAVIRAJ202092915823");
		assertNotNull(acc);
	}

	// Test With Valid Date Input but Invalid ID Input
	@Test
	public void testtransactionbyDateTwo() throws AccountException, TransactionException {
		assertThrows(AccountException.class, () -> passbookservice.getTransactions(LocalDate.of(2000, 01, 01),
				LocalDate.of(2020, 9, 29), "RAVIRAJ2020993682000"));

	}

	// Test With Valid ID Input but Invalid Date Input
	@Test
	public void testtransactionbyDateThree() throws AccountException, TransactionException {
		assertThrows(TransactionException.class, () -> passbookservice.getTransactions(LocalDate.of(2022, 02, 21),
				LocalDate.of(2023, 03, 22), "RAVIRAJ202092915823"));

	}
	
	// Test With Invalid Inputs

	@Test
	public void testtransactionbyDateFour() throws AccountException, TransactionException ,InvalidInputException {
		assertThrows(TransactionException.class, () -> passbookservice.getTransactions(LocalDate.of(2022, 02, 21),
				LocalDate.of(2023, 03, 22), "RAVIRAJ2020993682000s"));

	}

}

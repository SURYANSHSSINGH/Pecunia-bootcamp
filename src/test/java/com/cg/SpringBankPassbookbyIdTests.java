package com.cg;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.entity.AccTransaction;
import com.cg.exceptions.AccountException;
import com.cg.exceptions.TransactionException;
import com.cg.service.IPassBookService;

@SpringBootTest
class SpringBankPassbookbyIdTests {
	@Autowired
	private IPassBookService passbookservice;

	// Test with valid Account ID Input
	@Test
	public void testtransactionbyIDfound() throws AccountException, TransactionException {
		List<AccTransaction> acc = passbookservice.getTransactionById("RAVIRAJ202092915823");
		assertNotNull(acc);

	}

	// Test with Invalid Account ID Input
	@Test
	public void testbytransactionbyIDNotfound() throws AccountException, TransactionException {
		assertThrows(AccountException.class, () -> passbookservice.getTransactionById("RAVIRAJ202099368200"));

	}

}

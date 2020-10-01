package com.cg;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.entity.Account;
import com.cg.exceptions.AccountException;
import com.cg.exceptions.CustomerException;
import com.cg.service.AccountService;

@SpringBootTest
class SpringBankAccountbyaidTests {
	@Autowired
	private AccountService accountservice;

	// Test method with valid Account Id
	@Test
	public void testdetailsbyIDfound() throws AccountException {
		List<Account> acc = accountservice.viewAccount("RAMESH20209291585");
		assertNotNull(acc);

	}

	// Test method with invalid Account Id
	@Test
	public void testdetailsbyIDNotfound() throws AccountException {
		assertThrows(AccountException.class, () -> accountservice.viewAccount("RAMESH95392374039"));
	}

	/*
	 * }
	 * 
	 * @Test public void testCustdetailsbyIDfound() throws CustomerException{
	 * List<Account> acc = accountservice.viewAccounts("11734"); assertNotNull(acc);
	 * 
	 * }
	 * 
	 * @Test public void testCustdetailsbyIDNotfound() throws CustomerException{
	 * assertThrows(CustomerException.class,
	 * ()->accountservice.viewAccounts("108735"));
	 * 
	 * 
	 * }
	 */
}

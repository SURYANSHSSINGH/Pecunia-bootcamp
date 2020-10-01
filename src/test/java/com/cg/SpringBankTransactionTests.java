package com.cg;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.dto.TransferFundForm;
import com.cg.exceptions.AccountException;
import com.cg.exceptions.BalanceException;
import com.cg.exceptions.TransactionException;
import com.cg.service.AccountService;

/**
 * @author raviraj
 *
 */
@SpringBootTest
class SpringBankTransactionTests {

	@Autowired
	private AccountService service;

	/**
	 * @throws AccountException
	 * @throws BalanceException
	 * @throws TransactionException
	 */

	// Test With Valid Inputs
	@Test
	public void testValidFundTransfer() throws AccountException, BalanceException, TransactionException {
		TransferFundForm transfer = new TransferFundForm();
		transfer.setFromAccountId("RAVIRAJ202092915823");
		transfer.setToAccountId("RAMESH20209291585");
		transfer.setAmt(4500);
		String result = service.transferFund(transfer);
		Assertions.assertEquals("Amount Transfered Successfully", result);
	}

	// Test With InValid FromAccountId
	@Test
	public void testInValidFundTransfer() throws AccountException, BalanceException, TransactionException {
		TransferFundForm transfer = new TransferFundForm();
		transfer.setFromAccountId("XYZ5823684301");
		transfer.setToAccountId("RAMESH20209291585");
		transfer.setAmt(4500);
		assertThrows(AccountException.class, () -> service.transferFund(transfer));
	}

	// Test With InValid ToAccountId
	@Test
	public void testInValidFundTransferTwo() throws AccountException, BalanceException, TransactionException {
		TransferFundForm transfer = new TransferFundForm();
		transfer.setFromAccountId("RAMESH20209291585");
		transfer.setToAccountId("XYZ5823684301");
		transfer.setAmt(4500);
		assertThrows(AccountException.class, () -> service.transferFund(transfer));
	}

	// Test With Negative Amt
	@Test
	public void testInValidFundTransferThree() throws AccountException, BalanceException, TransactionException {
		TransferFundForm transfer = new TransferFundForm();
		transfer.setFromAccountId("RAVIRAJ202092915823");
		transfer.setToAccountId("RAMESH20209291585");
		transfer.setAmt(-4500);
		assertThrows(TransactionException.class, () -> service.transferFund(transfer));
	}

	// Test With Amt >account_balance
	@Test
	public void testInValidFundTransferFour() throws AccountException, BalanceException, TransactionException {
		TransferFundForm transfer = new TransferFundForm();
		transfer.setFromAccountId("RAVIRAJ202092915823");
		transfer.setToAccountId("RAMESH20209291585");
		transfer.setAmt(455000);
		assertThrows(BalanceException.class, () -> service.transferFund(transfer));
	}

	// Test With Invalid Inputs
	@Test
	public void testInValidFundTransferFive() throws AccountException, TransactionException {
		TransferFundForm transfer = new TransferFundForm();
		transfer.setFromAccountId("RAVIRAJ2020987523693");
		transfer.setToAccountId("RAMESH20205878268584");
		transfer.setAmt(455000);
		assertThrows(AccountException.class, () -> service.transferFund(transfer));
	}

}

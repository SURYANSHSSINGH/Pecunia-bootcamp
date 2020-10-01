package com.cg;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.entity.LoanRequest;
import com.cg.exceptions.AccountException;
import com.cg.exceptions.LoanProcessingException;
import com.cg.exceptions.NoRequestsFoundException;
import com.cg.service.ILoanService;

@SpringBootTest
class SpringBankViewAndProcessLoanRequestsTests {
	@Autowired
	ILoanService loanService;

	// success test case
	@Test
	void approvedLoanRequestsFoundTest() throws LoanProcessingException, NoRequestsFoundException {
		List<LoanRequest> list = loanService.viewAcceptedLoans();
		assertTrue(!list.isEmpty());
	}

	// success test case
	@Test
	void rejectedLoanRequestsFoundTest() throws NoRequestsFoundException,LoanProcessingException {
		List<LoanRequest> list = loanService.viewRejectedLoans();
		assertTrue(!list.isEmpty());
		;
	}

	// failure test case
	@Test
	void getLoanRequestsFailTest() throws NoRequestsFoundException {
		assertThrows(NoRequestsFoundException.class, () -> loanService.viewAllLoanRequests());
	}

	// failure test case
	@Test
	public void testProcessByIdFound() throws NoRequestsFoundException, AccountException,LoanProcessingException {
		assertThrows(AccountException.class, () -> loanService.processLoanRequest("LN202092925156"));
	}
}

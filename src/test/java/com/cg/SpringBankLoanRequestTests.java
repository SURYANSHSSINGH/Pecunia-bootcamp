package com.cg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDate;
import com.cg.dto.LoanRequestDto;
import com.cg.entity.LoanRequest;
import com.cg.exceptions.LoanProcessingException;
import com.cg.service.ILoanService;
import com.cg.service.*;

@SpringBootTest
public class SpringBankLoanRequestTests {
	@Autowired
	ILoanService loanService;

//Test case with Valid Input
	@Test
	public void createloanRequestTest() {
		LoanRequestDto loan = new LoanRequestDto();
		loan.setAnnualIncome(2500000);
		loan.setCustomerId("202092915823");
		loan.setDateOfRequest(LocalDate.of(2020, 9, 28));
		loan.setLoanAmount(700000);
		loan.setLoanTenure(3);
		loan.setLoanType("CAR");
		loan.setReqStatus("PENDING");
		String actual = loanService.createLoanRequest(loan);
		Assertions.assertNotNull(actual);
	}
	//Test with Invalid Inputs
	@Test
	public void createloanRequestTestTwo() {
		LoanRequestDto loan = new LoanRequestDto();
		loan.setAnnualIncome(2500000);
		loan.setCustomerId("20209291563434545");
		loan.setDateOfRequest(LocalDate.of(2020, 9, 28));
		loan.setLoanAmount(700000);
		loan.setLoanTenure(3);
		loan.setLoanType("CAR");
		loan.setReqStatus("PENDING");
		String actual = loanService.createLoanRequest(loan);
		Assertions.assertThrows(LoanProcessingException.class, ()->loanService.createLoanRequest(loan));
	}

}

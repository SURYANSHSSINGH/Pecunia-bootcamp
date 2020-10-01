package com.cg;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.dto.AccountForm;
import com.cg.dto.CustomerForm;
import com.cg.service.AccountService;

@SpringBootTest
public class SpringBankCustomerTests {
	@Autowired
	AccountService customerform;
	
	
	//Test With Valid Inputs
	@Test
	public void addCustomerTest() {
		CustomerForm cust = new CustomerForm();
		cust.setCustomerAadhar("3351025034561");
		cust.setCustomerAddress("DELHI");
		cust.setCustomerContact("9876543210");
		cust.setCustomerDob(LocalDate.of(1998, 8, 06));
		cust.setCustomerGender("MALE");
		cust.setCustomerName("VAIBHAV");
		cust.setCustomerPan("IRPPS3525C");
		cust.setPassword("PASSWORD");
		cust.setRole("CUSTOMER");
		String actual = customerform.addCustomer(cust);
		Assertions.assertNotNull(actual);
	}
}

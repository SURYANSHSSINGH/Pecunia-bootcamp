package com.cg.dto;

import java.time.LocalDate;

/**
 * @author raviraj
 *
 */
public class LoanRequestDto {

	
	private double loanAmount;
	private String loanType;
	private Integer loanTenure;
	private String reqStatus;
	private LocalDate dateOfRequest;
	private double annualIncome;
	private String customerId;

	public LoanRequestDto() {
		super();
	}
	public LoanRequestDto( double loanAmount, String loanType, Integer loanTenure,
			String reqStatus, LocalDate dateOfRequest, double annualIncome, String customerId) {
		super();
		this.loanAmount = loanAmount;
		this.loanType = loanType;
		this.loanTenure = loanTenure;
		this.reqStatus = reqStatus;
		this.dateOfRequest = dateOfRequest;
		this.annualIncome = annualIncome;
		this.customerId = customerId;
	}
	
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public Integer getLoanTenure() {
		return loanTenure;
	}
	public void setLoanTenure(Integer loanTenure) {
		this.loanTenure = loanTenure;
	}
	public String getReqStatus() {
		return reqStatus;
	}
	public void setReqStatus(String reqStatus) {
		this.reqStatus = reqStatus;
	}
	public LocalDate getDateOfRequest() {
		return dateOfRequest;
	}
	public void setDateOfRequest(LocalDate dateOfRequest) {
		this.dateOfRequest = dateOfRequest;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	

	
}

package com.cg.util;


public class AccountConstants {

	public static final String CREDIT = "CREDIT";
	public static final String DEBIT = "DEBIT";
	public static final String TRANSFER_FROM_DESC ="Amount transfer to Account Id:";
	public static final String TRANSFER_TO_DESC ="Amount transfered from Account Id:";
	public static final String TRANSFER_FROM = "Transfered From ";
	public static final String TRANSFER_TO = "Transfered To ";
	public static final String INVALID_ACCOUNT = "Invalid Account ID:";
	public static final String ACTIVE = "ACTIVE";
	public static final String IN_ACTIVE = "INACTIVE";
	public static final String IN_ACTIVE_MSG = "Account Not In Use ";
	public static final String INVALID_CUSTOMER = "Invalid Customer";
	public static final String ACCOUNT_EDITED="Account Edited Successfully";
	public static final String INSUFFICIENT_BALANCE = "Insufficient Balance";
	public static final String TRANSFERED = "Amount Transfered Successfully";
	public static final String TRANSFER_URL = "/transfer";
	public static final String PASS_NOT_VALID = "password is Wrong, Check your Password";
	public static final String USER_NOT_VALID = "Check your credentials";

	public static final String USER_NOT_AUTHORIZED = "user not authorized";
	public static final String USER_NOT_AUTHENTICATED = "user not authenticated";
	public static final String emailConstraint="SYSTEM.EMAILCONSTRAINT";
	public static final String aadharConstraint="SYSTEM.AADHARCONSTRAINT";
	public static final String panConstraint="SYSTEM.PANCONSTRAINT";
	public static final String contactConstraint="SYSTEM.CONTACTCONSTRAINT";
	public static final String ROLE_USER="customer";
	public static final String ACCOUNT_CREATED="Account Created Successfully.";
	public static final String ACCOUNT_REMOVED="Account REMOVED Successfully";
	public static final String CUSTOMER_CREATED="Customer Created Successfully.";
	public static final String CUSTOMER_EDITED="Customer Edited Successfully.";
	public static final String LOAN_REQ_CREATED="Loan Request Created Successfully.";
	public static final String ID_ALREADY_EXISTS= "ID Already Exists";
	public static final String EMPTY="";
	public static final String CUSTOMER_NOT_FOUND = "Customer Not Found";
	public static final String OPEN_DESC = "Account Opened with Amount Credited";
	public static final String LOAN_DESC = "Loan Amount Credited ";
	public static final String GENERATED_ACCOUNT=" Your Account ID: ";
	public static final String GENERATED_CUSTOMER=" Your Customer ID: ";
	public static final String GENERATED_LOAN_REQ=" Your Loan Request ID: ";
	public static final String NO_TRANSACTION="No Transaction Found";
	public static final String LOAN_REQUEST="Request";
	public static final String LOAN_APPROVED="Approved";
	public static final String LOAN_REJECTED="Rejected";
	public static final String LOAN="LOAN";
	public static final String NO_LOAN="NO LOAN Requested";
	public static final int LOAN_EXISTS=0;
	public static final double LOAN_RATE=0.1;
	public static final int ONE=1;
	public static final int TWELVE_MONTHS=12;
	public static final double FIFTY_PERCENT=0.5;
	public static final String LOAN_PROCESSED="Loan Processed";
	
	public static final String NO_LOAN_REQUESTS="there are no loan requests to view";
	public static final String PENDING_REQUESTS= "PENDING";
	public static final String LOAN_UNDERGOING="already loan is undergoing";
    public static final String EMI="emi";
    public static final String FIFTY_PERCENT_OF_SALARY="fifty percent of salary";
    public static final String NOT_ENOUGH_INCOME="no enough income to apply for loan";
    public static final String PERSONAL_LOAN="Personal Loan";
    public static final String APPROVED="Approved";
    public static final String ROLE="role";
    public static final String USE_NOT_AUTHENTICATED="you are not authenticated user";
    public static final String TOKEN_ID="token ID";
    public static final String VIEW_ALL_PENDING_REQUESTS="viewallloanrequests";
    public static final String PROCESS_REQUESTS_BY_ID="processrequests/{reqID}";
    public static final String LOGIN_MAIN_URL="http://localhost:7082/adminlogin/verifylogin";
    
  
    public static final String UPDATED_ACCOUNT_LIST_URL="viewupdatedaccountlist";
    public static final String NO_ACCEPTED_LOAN_REQUESTS =  "There are no accepted loan requests";
	public static final String NO_REJECTED_LOAN_REQUESTS =  "There are no  rejected   loan requests";
	public static final String APPROVED_REQUESTS = "Approved";
	public static final String REJECTED_REQUESTS = "Rejected";
	public static final String APPROVED_LOAN_REQUESTS_URL="viewapprovedloanrequests";
	public static final String REJECTED_LOAN_REQUESTS_URL="viewrejectedloanrequests";
	public static final String ADMIN ="admin";
	public static final String ONLY_ADMIN_IS_ALLOWED="you are not authorized user, only admin can use this feature";
	
	public static final String IN_ACTIVE_ACCOUNT= "Your Account is not active or Your account doesnot exsit";
	public static final String TXN_NOT_AVAILABLE="No Transcations available";
    public static final String START_AFTER_DATE = "Start date cannot be future date";
    public static final String BEFORE_START_DATE = "End date should not be before of start date";
    public static final String NO_ACCOUNT_FOUND = "Account doesnot exist";
    public static final String LOAN_ID  = "LN";

	
}

package com.cg.exceptions;

@SuppressWarnings("serial")
public class BankAccountNotFound extends RuntimeException 
{
    public BankAccountNotFound(String exception) {
        super(exception);
    }
}

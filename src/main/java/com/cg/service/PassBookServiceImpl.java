package com.cg.service;

/**
*
* @author Suryansh
* 
* Service class for logic implementation of Passbook module.
* Contains methods to implement logic using different input fields.
* Contains : getTransactionById and getTransactions method
* 
* 
* 
* 
*/

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Service;
import com.cg.dao.AccountDao;
import com.cg.entity.AccTransaction;
import com.cg.entity.Account;
import com.cg.exceptions.AccountException;
import com.cg.exceptions.TransactionException;
import com.cg.util.AccountConstants;

@Service
@EnableDiscoveryClient
public class PassBookServiceImpl implements IPassBookService {

	/**
	 * Tries to fetch transaction records of an account
	 * 
	 * @param {account ID , Date} to fetch records
	 * @return {@code true = Transaction records as List} Else
	 *         {@code false= throw exception}
	 */
	@Autowired
	private AccountDao accDao;

	@Override
	public List<AccTransaction> getTransactions(LocalDate startDt, LocalDate endDt, String accountId)
			throws TransactionException, AccountException {

		if (validateDate(startDt, endDt)) {
			Optional<Account> optaccount = accDao.findById(accountId);
			if (!optaccount.isPresent())
				throw new AccountException(AccountConstants.IN_ACTIVE_ACCOUNT);

			List<AccTransaction> txlist = accDao.getTransactions(startDt, endDt, accountId);
			if (txlist.isEmpty())
				throw new TransactionException(AccountConstants.TXN_NOT_AVAILABLE);
			txlist.sort((txn1, txn2) -> txn1.getTransDate().compareTo(txn2.getTransDate()));

			return txlist;
		}
		return null;
	}

	public boolean validateDate(LocalDate startDt, LocalDate endDt) throws TransactionException {

		if (startDt.isAfter(LocalDate.now()))
			throw new TransactionException(AccountConstants.START_AFTER_DATE);
		if (endDt.isBefore(startDt))
			throw new TransactionException(AccountConstants.BEFORE_START_DATE);
		return true;
	}

	@Override
	public List<AccTransaction> getTransactionById(String accountId) throws TransactionException, AccountException {

		if (validateDate(accountId)) {
			Optional<Account> optaccount = accDao.findById(accountId);
			if (!optaccount.isPresent())
				throw new AccountException(AccountConstants.NO_ACCOUNT_FOUND);

			List<AccTransaction> txlist = accDao.getTransactionById(accountId);
			if (txlist.isEmpty())
				throw new TransactionException(AccountConstants.TXN_NOT_AVAILABLE);
			txlist.sort((txn1, txn2) -> txn1.getTransDate().compareTo(txn2.getTransDate()));

			return txlist;
		}
		return null;
	}

	private boolean validateDate(String accountId) throws TransactionException {
		if (accountId.isEmpty())
			throw new TransactionException(AccountConstants.START_AFTER_DATE);

		return true;
	}

}

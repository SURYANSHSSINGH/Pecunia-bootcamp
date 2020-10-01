package com.cg.dao;
/**
*
* @author Suryansh
* 
* Dao class of  Passbook module.
* 
* Contains : getTransactionById and getTransactions method declaration
* 
* 
* 
* 
*/

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.entity.AccTransaction;
import com.cg.entity.Account;
import com.cg.entity.Customer;



@Repository
public interface AccountDao extends JpaRepository<Account,String> {

	/**
	 * Tries to fetch transaction records of an account
	 * 
	 * @param account ID , date to fetch records
	 * @return {@code true = Transaction records as List} Else
	 *         {@code false= throw exception}
	 */
	
	@Query("from AccTransaction tx  where tx.transDate >= :startDt and tx.transDate <= :endDt and tx.account.accountId=:accId")
	public List<AccTransaction> getTransactions(@Param("startDt")LocalDate startDt, @Param("endDt") LocalDate endDt, @Param("accId")String accountId);

	@Query("from AccTransaction tx where tx.account.accountId=:accId")
	public List<AccTransaction> getTransactionById(@Param("accId") String accountId);
}

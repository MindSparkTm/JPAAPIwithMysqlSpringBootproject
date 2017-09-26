package com.javasampleapproach.mysql.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.model.Balance;
import com.javasampleapproach.mysql.model.Token;

public interface BalanceRepository extends CrudRepository<Token, Long> {
	
	@Modifying
	@Transactional
	  @Query("SELECT t FROM Balance t WHERE t.account_number= ?1")
      public List<Balance> findBytelegramid(String account_number);

}

package com.javasampleapproach.mysql.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.model.Balance;
import com.javasampleapproach.mysql.model.Customer;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.javasampleapproach.mysql.model.MiniStatement;

public interface MiniStatementRepository extends CrudRepository<MiniStatement, Long>{
	@Modifying
	@Transactional
	  @Query("SELECT t FROM MiniStatement t WHERE t.account_number= ?1")
      public List<MiniStatement> findBytelegramid(String account_number);
      
	
}

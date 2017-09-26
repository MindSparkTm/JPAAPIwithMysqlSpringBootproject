package com.javasampleapproach.mysql.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.model.Token;

public interface Tokenrepository extends CrudRepository<Token, Long>{
	
	
	@Modifying
	@Transactional
	  @Query("SELECT t FROM Token t WHERE t.telegram_id= ?1")
      public List<Token> findBytelegramid(String senderid);
}

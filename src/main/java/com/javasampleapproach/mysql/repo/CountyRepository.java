package com.javasampleapproach.mysql.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.model.County;
import com.javasampleapproach.mysql.model.Customer;

public interface CountyRepository extends CrudRepository<County, Long> {
	List<County> findByName(String Name);
	List<Customer>findBytype(String Type);
	
	@Modifying
	@Transactional
	@Query(value="delete from Customer c where c.firstName = ?1")
	void deleteByFirstName(String firstName);
}

package com.javasampleapproach.mysql.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.model.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Long>{
	List<Customer> findByLastName(String lastName);
	List<Customer>findByFirstName(String firstName);
	@Modifying
	@Transactional
	@Query(value="delete from Customer c where c.firstName = ?1")
	void deleteByFirstName(String firstName);
}

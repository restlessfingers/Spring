package com.exemple.shopExemple.boot.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.exemple.shopExemple.boot.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);

	Customer findById(long id);
}
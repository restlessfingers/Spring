package com.exemple.shopExemple.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.shopExemple.boot.model.Customer;
import com.exemple.shopExemple.boot.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository repository;

	public Iterable<Customer> findAll() {

		return repository.findAll();
	}
}
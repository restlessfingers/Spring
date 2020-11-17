package com.exemple.shopExemple.boot.repository;

import org.springframework.data.repository.CrudRepository;
import com.exemple.shopExemple.boot.model.CreditCard;


public interface CreditCardRepository extends CrudRepository<CreditCard, Long> {

	CreditCard findById(long id);
}
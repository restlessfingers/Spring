package com.example.SpringBootInsertChangePort;

import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book,String> {

}

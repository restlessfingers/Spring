package com.example.TestUF2405;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.repository.QuoteRepository;
import com.example.repository.BookRepository;*/

@SpringBootApplication
public class TestUf2405Application {

	public static void main(String[] args) {
		SpringApplication.run(TestUf2405Application.class, args);
		
		/**		// Create our entity manager..
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// Create our repositories ...
		AuthorRepository authorRepository = new AuthorRepository(entityManager);
		BookRepository bookRepository = new BookRepository(entityManager);*/
	}

}

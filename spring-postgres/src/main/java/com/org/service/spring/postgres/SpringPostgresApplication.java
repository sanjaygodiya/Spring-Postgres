package com.org.service.spring.postgres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.org.service.spring.postgres.model.Book;
import com.org.service.spring.postgres.repo.BookRepository;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringPostgresApplication  implements CommandLineRunner{

	@Autowired
	private BookRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringPostgresApplication.class, args);
	}
	
	@Override
	public void run(String... args) {

		log.info("StartApplication...");

		repository.save(new Book("Java"));
		repository.save(new Book("Node"));
		repository.save(new Book("Python"));

		System.out.println("\nfindAll()");
		repository.findAll().forEach(x -> System.out.println(x));

		System.out.println("\nfindById(3L)");
		repository.findById(3l).ifPresent(x -> System.out.println(x));

		System.out.println("\nfindByName('Java')");
		repository.findByName("Java").forEach(x -> System.out.println(x));

	}
}

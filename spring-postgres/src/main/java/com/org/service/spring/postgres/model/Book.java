package com.org.service.spring.postgres.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;

	public Book() {
	}

	public Book(String name) {
		this.name = name;
	}

	 @Override
	    public String toString() {
	        return "Book{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                '}';
	    }
}
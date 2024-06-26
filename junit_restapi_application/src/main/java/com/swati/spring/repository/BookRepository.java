package com.swati.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swati.spring.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}

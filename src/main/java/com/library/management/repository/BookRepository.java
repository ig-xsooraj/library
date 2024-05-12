package com.library.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.management.entities.Books;

@Repository
public interface BookRepository extends JpaRepository<Books,Long> {

}

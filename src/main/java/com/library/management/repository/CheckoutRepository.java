package com.library.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.management.entities.CheckOut;

@Repository
public interface CheckoutRepository extends JpaRepository<CheckOut,Long>{

}

package com.library.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.management.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	
	 User findByUsername(String userName);

}

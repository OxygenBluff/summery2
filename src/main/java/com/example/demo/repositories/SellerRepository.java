package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {
	Optional<Seller> findByUserId(Long userId);
	
	//more 
	List<Seller> findByActiveTrue(); // get all active branches!
    Optional<Seller> findByEmail(String email);
}

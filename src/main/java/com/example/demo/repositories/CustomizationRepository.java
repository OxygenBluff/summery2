package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Customization;
import com.example.demo.entities.Product;

public interface CustomizationRepository extends JpaRepository<Customization, Long> {
    List<Customization> findByProduct(Product product);

}

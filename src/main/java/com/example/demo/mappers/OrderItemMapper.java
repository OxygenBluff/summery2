package com.example.demo.mappers;

import org.springframework.stereotype.Component;

import com.example.demo.dtos.OrderItemResponseDTO;
import com.example.demo.entities.OrderItem;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor

public class OrderItemMapper {
	private final CustomizationMapper customizationMapper;
	
	//entity OrderItem -> OrderItemResponce
	  public OrderItemResponseDTO toResponseDTO(OrderItem item) {
	        if (item == null) return null;
	        return OrderItemResponseDTO.builder()
	                .id(item.getId())
	                
	                .productName(item.getProduct().getNom())
	                
	                .variantName(item.getVariant() != null ? 
	                    item.getVariant().getValeur() : null)
	                
	                .unitPrice(item.getPrixUnitaire())
	                
	                .customizationsCost(item.getCustomizationsCost())
	                
	                .quantite(item.getQuantite())
	                
	                .subTotal(item.getPrixUnitaire() + item.getCustomizationsCost() 
	                    * item.getQuantite())
	                
	                .customizations(item.getCustomizations().stream()
	                    .map(customizationMapper::toResponseDTO)
	                    .toList())
	                
	                .build();
	    }
	

}

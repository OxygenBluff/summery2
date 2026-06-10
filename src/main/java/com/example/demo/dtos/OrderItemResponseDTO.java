package com.example.demo.dtos;

import java.util.List;

import lombok.Builder;

@Builder
public class OrderItemResponseDTO {

	private Long id;
    private String productName;
    private String variantName;      // no variant = NULL
    private Double unitPrice;
    private Double customizationsCost;
    private Integer quantite;
    private Double subTotal;         // (unitPrice + customizationsCost) * quantite
    private String imageUrl;         // nice to have!
    private List<CustomizationResponseDTO> customizations;
}

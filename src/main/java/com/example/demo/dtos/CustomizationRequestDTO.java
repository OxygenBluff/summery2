package com.example.demo.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data @Builder @Setter @Getter 
@NoArgsConstructor 
@AllArgsConstructor
public class CustomizationRequestDTO {
	@NotBlank 
	private String name;
	private Double extraPrice; 
	private boolean available; 
}

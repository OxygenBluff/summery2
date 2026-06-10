package com.example.demo.dtos;

import java.time.LocalDateTime;

import com.example.demo.entities.OrderType;

import lombok.Data;

@Data
public class OrderRequestDTO {
	private Long addressId; // if pickup type -> NULL!
    private String couponCode; //coupon stuff right ?
    
    //LEMONAAADEEE
    private Long branchId;
    private OrderType orderType; 
    private LocalDateTime pickupTime;
    
}

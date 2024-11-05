package com.example.Product.Model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class UpdateProduct {
	
    private Long id;
    
	private String name;

    private String description;
    
    private Double price;
    private Integer stockQuantity;


}

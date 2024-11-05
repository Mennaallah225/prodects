package com.example.Product.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Product.Model.DTO.CreateProduct;
import com.example.Product.Model.DTO.GetProduct;
import com.example.Product.Model.DTO.UpdateProduct;

@Service
public interface ProductService {
	
	List<GetProduct> GetAll();
	GetProduct Get(Long id);
	
	CreateProduct Send(CreateProduct Dto);
	
	UpdateProduct update(UpdateProduct Dto);
	
	String Delete(Long id);
	
	
	
	

}

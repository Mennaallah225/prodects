package com.example.Product.Model.Mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.Product.Model.DTO.CreateProduct;
import com.example.Product.Model.DTO.GetProduct;
import com.example.Product.Model.DTO.UpdateProduct;
import com.example.Product.Model.Entity.ProductEntity;

@Mapper(componentModel = "spring")

public interface ProductMapper {
	List<GetProduct> AllDto(List<ProductEntity> ALLentity);
	List<ProductEntity> ALLentity(List<GetProduct> AllDto);
	
	ProductEntity entity(GetProduct dto);
	GetProduct dto(ProductEntity entity);
	
	ProductEntity Sendentity(CreateProduct sendDto); 
	CreateProduct sendDto(ProductEntity Sendentity);
	
	ProductEntity updateentity(UpdateProduct updateDto);
	UpdateProduct updateDto(ProductEntity updateentity);
	
	
}

package com.example.Product.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Product.Model.DTO.CreateProduct;
import com.example.Product.Model.DTO.GetProduct;
import com.example.Product.Model.DTO.UpdateProduct;
import com.example.Product.Model.Entity.ProductEntity;
import com.example.Product.Model.Mapper.ProductMapper;
import com.example.Product.Repository.ProductRepo;
import com.example.Product.Service.ProductService;
import com.example.Product.component.Componentcalss;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
	private final ProductMapper map;
	private final ProductRepo repo;
	private final Componentcalss com;
	

	@Override
	public List<GetProduct> GetAll() {
		
	List<ProductEntity> GetAll=this.repo.findAll();
	List<GetProduct> respons=this.map.AllDto(GetAll);
		return respons;
	}

	@Override
	public GetProduct Get(Long id) {
		com.logproductAction("GET", id);

		ProductEntity Get=this.repo.getById(id);
		GetProduct respons=this.map.dto(Get);
		return respons;
	}

	@Override
	public CreateProduct Send(CreateProduct Dto) {
		com.validateproductData(Dto.getName(), Dto.getDescription());
		ProductEntity send=this.map.Sendentity(Dto);
		ProductEntity send1=this.repo.save(send);
		CreateProduct save=this.map.sendDto(send1);
		return save;
	}

	@Override
	public UpdateProduct update(UpdateProduct Dto) {
		com.validateproductData(Dto.getName(), Dto.getDescription());
		ProductEntity update=this.map.updateentity(Dto);
		ProductEntity update1=this.repo.save(update);
		UpdateProduct save =this.map.updateDto(update1);
		return save;
	}

	@Override
	public String Delete(Long id) {
		com.logproductAction("DELETE", id);

	
		this.repo.deleteById(id);
		return "";
	}

}

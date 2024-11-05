package com.example.Product.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Product.Model.DTO.CreateProduct;
import com.example.Product.Model.DTO.GetProduct;
import com.example.Product.Model.DTO.UpdateProduct;
import com.example.Product.Service.ProductService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")


public class ProductController {
	private final ProductService ser;
	
	
       @GetMapping("/")
	    public List<GetProduct> GetAll() {
		return this.ser.GetAll();
		
	
	}
    @GetMapping("/{id}")
    public GetProduct Get(@PathVariable Long id) {
	return this.ser.Get(id);
	
}
      @PostMapping("/")
      public CreateProduct Send( @Valid @RequestBody CreateProduct Dto) {
    	 
	  return   this.ser.Send(Dto);
			 
			

}
     @PutMapping("/")
     public UpdateProduct update (@Valid  @RequestBody UpdateProduct Dto   ) {
	return this.ser.update(Dto);

}
   @DeleteMapping("/{id}")
   public ResponseEntity<String> Delete( @ Valid @PathVariable  Long id) {
	
	
	 this.ser.Delete(id);
	 return  ResponseEntity.ok("Product with ID " + id + " has been deleted successfully.");
}
	
	
}

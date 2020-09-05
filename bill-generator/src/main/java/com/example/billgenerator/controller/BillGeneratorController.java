package com.example.billgenerator.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.billgenerator.dto.ProductDetails;
import com.example.billgenerator.dto.ProductDto;
import com.example.billgenerator.entity.Image;
import com.example.billgenerator.entity.Product;
import com.example.billgenerator.service.BillGeneratorService;

@RestController
@RequestMapping("/billGenerator")
public class BillGeneratorController {
	
	public static HashMap<Integer , ProductDetails> productDetailsList= new  HashMap<Integer , ProductDetails>();
	
	@Autowired
	private BillGeneratorService billGeneratorService;
	
	
	/*
	 * when code is sacnned scan the image 
	 * check if the image exists 
	 * if yes > add product to list 
	 * if no > show error message
	 */
	@GetMapping(path = { "/scanImage/{imageName}" })
	public void getImage(@PathVariable("imageName") String imageName) throws IOException {
		
		/*
		 * final Optional<Image> retrievedImage = imageRepository.findByName(imageName);
		 * Image img = new Image(retrievedImage.get().getName(),
		 * retrievedImage.get().getType(),
		 * decompressBytes(retrievedImage.get().getBytes())); return img;
		 */

	}
	
	@RequestMapping("/addProduct")
    public boolean addProduct() {
		
		return billGeneratorService.addProduct();
    }
	
	/*
	 * send the generated list 
	 */
	@RequestMapping("/generateBill")
	public HashMap<Integer , ProductDetails> generateBill() {
        return null;
    }

	@RequestMapping("/getProductDeatils")
	public Optional<Product> getProduct() {
        return billGeneratorService.getProduct();
    }

}

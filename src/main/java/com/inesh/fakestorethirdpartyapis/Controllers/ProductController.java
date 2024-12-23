package com.inesh.fakestorethirdpartyapis.Controllers;

import com.inesh.fakestorethirdpartyapis.Models.Product;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @GetMapping(value = "/fakeStore/products")
    public String createProduct(){
        return "Created Product with the given request body";
    }

    @GetMapping(value = "/fakeStore/products/{id}")
    public Product getProduct(@PathVariable String id){
        return null;
    }

    @PutMapping(value = "/fakeStore/products")
    public Product updateProduct(){
        return null;
    }

    @DeleteMapping(value = "/fakeStore/products")
    public Void deleteProduct(){
        return null;
    }

}

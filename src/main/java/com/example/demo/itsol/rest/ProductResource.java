package com.example.demo.itsol.rest;

import com.example.demo.itsol.model.Product;
import com.example.demo.itsol.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class ProductResource {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> findAll(){
        return productService.findAll();
    }

    @PostMapping("/product")
    public ResponseEntity<?> cerateProduct(@RequestBody Product product ){
        productService.save(product);
        return new ResponseEntity<>(product,HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<Void> update(@RequestBody Product product){
        productService.update(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> findOne(@PathVariable Long id){
        return productService.findOne(id).map(product -> new ResponseEntity<>(product,HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        productService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

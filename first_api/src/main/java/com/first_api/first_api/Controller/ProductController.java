package com.first_api.first_api.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.first_api.first_api.Model.Product;
import com.first_api.first_api.Services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
  
  @Autowired
  private ProductService productService;
  
  @GetMapping
  public List<Product> getAll() {
    return productService.getAll();
  }

  @GetMapping("/{id}")
  public Optional<Product> getById(@PathVariable int id) {
    return productService.getById(id);
  }

  @PostMapping
  public Product add(@RequestBody Product product) {
    return productService.add(product);
  }

  @DeleteMapping("/{id}")
  public String delete(@PathVariable int id) {
    productService.delete(id);
    return "Product with id: " + id + " deleted succefully";
  }

  @PutMapping("/{id}")
  public Product update(@PathVariable int id, @RequestBody Product product) {
    return productService.update(id, product);
  }
}

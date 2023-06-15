package com.first_api.first_api.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first_api.first_api.Model.Product;
import com.first_api.first_api.Repository.ProductRepository_OLD;

@Service
public class ProductService {

  @Autowired
  private ProductRepository_OLD productRepository;

  /**
   * Method to return an Products List
   * @return Products List
   */
  public List<Product> getAll() {
    return productRepository.getAll();
  }

  /**
   * Method to return a single product looking by ID
   * @param id productID to looking for
   * @return Product by ID or null 
   */
  public Optional<Product> getById(int id) {
    //"Optional" will return the choosed product by ID or Null
    return productRepository.getById(id);
  }

  /**
   * Method to add a new product in the List
   * @param product The product who will be add
   * @return Product added in the List
   */
  public Product add(Product product) {
    return productRepository.add(product);
  }

  //Worst way to do:
  /**
   * Method to delete the product by ID
   * @param id Product id to remove
   */
  public void delete(int id) {
    productRepository.delete(id);
  }

  /**
   * Method to update an product
   * @param product product to update
   * @param id product Id to update
   * @return the product updated
   */
  public Product update(Integer id, Product product) {
    product.setId(id);
    return productRepository.update(product);
  }
}

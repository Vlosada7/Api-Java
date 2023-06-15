//METHOD TO NOT USE DB CONNECTION 

package com.first_api.first_api.Repository;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.first_api.first_api.Model.Product;

@Repository
public class ProductRepository_OLD {
  private List<Product> products = new ArrayList<Product>(); 
  private Integer lastId = 0;

  /**
   * Method to return an Products List
   * @return Products List
   */
  public List<Product> getAll() {
    return products;
  }

  /**
   * Method to return a single product looking by ID
   * @param id productID to looking for
   * @return Product by ID or null 
   */
  public Optional<Product> getById(int id) {
    //"Optional" will return the choosed product by ID or Null
    return products
        .stream()
        .filter(product -> product.getId() == id)
        .findFirst();
  }

  /**
   * Method to add a new product in the List
   * @param product The product who will be add
   * @return Product added in the List
   */
  public Product add(Product product) {
    lastId++;
    product.setId(lastId);
    products.add(product);
    return product;
  }

  //Worst way to do:
  /**
   * Method to delete the product by ID
   * @param id Product id to remove
   */
  public void delete(int id) {
    products.removeIf(product -> product.getId() == id);
  }

  /**
   * Method to update an product
   * @param product
   * @return the product updated
   */
  public Product update(Product product) {
    //Find the product:
    Optional<Product> choosedProduct = getById(product.getId());

    if (choosedProduct.isEmpty()) {
      throw new InputMismatchException("Product not found");
    }

    delete(product.getId());
    products.add(product); 
    
    return product;
  }
}

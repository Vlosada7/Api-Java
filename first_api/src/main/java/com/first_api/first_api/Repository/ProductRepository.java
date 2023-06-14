package com.first_api.first_api.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.first_api.first_api.Model.Product;

@Repository
public class ProductRepository {
  private List<Product> products = new ArrayList<Product>(); 
  private Integer lastId = 0;

  public List<Product> getAll() {
    return products;
  }
}

//METHOD WITH DB CONNECTION

package com.first_api.first_api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.first_api.first_api.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
  
}

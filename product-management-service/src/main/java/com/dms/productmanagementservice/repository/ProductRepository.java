package com.dms.productmanagementservice.repository;

import com.dms.productmanagementservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}

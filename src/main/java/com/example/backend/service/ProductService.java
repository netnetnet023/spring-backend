package com.example.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.backend.model.Product;
import com.example.backend.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository repo;
    

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> findAll() {
    return repo.findAll();
    }

    public Product save(Product p) {
    return repo.save(p);
    }

    public Product update(Long id, Product p) {
    p.setId(id);
    return repo.save(p);
    }

    public void delete(Long id) {
    repo.deleteById(id);
    }
}


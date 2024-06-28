package com.chinu.Service;


import com.chinu.Entity.Product;
import com.chinu.Repo.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public Product save(Product product) {
        long start = System.currentTimeMillis();

        Product save = productRepository.save(product);

        long end = System.currentTimeMillis();
        return save;
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}

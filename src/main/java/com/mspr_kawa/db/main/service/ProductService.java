package com.mspr_kawa.db.main.service;

import com.mspr_kawa.db.main.model.Product;
import com.mspr_kawa.db.main.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Méthode pour récupérer une liste de clients
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    public Product getProductById(UUID id) {
        Optional<Product> optionalProducts = productRepository.findById(id);
        return optionalProducts.orElse(null);
    }
    public Product createProduct(Product product) {
        product.setId(null);
        return productRepository.save(product);
    }
    public Product updateProduct(UUID id, Product product) {
        Optional<Product> optionalProducts = productRepository.findById(id);
        if (optionalProducts.isPresent()) {
            Product existingProduct = optionalProducts.get();
            if (existingProduct.getId().equals(product.getId())){
                return productRepository.save(product);
            }
        }
        return null;
    }
    public boolean deleteProduct(UUID id) {
        Optional<Product> optionalProduct= productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            productRepository.deleteById(id);
            return true;
        }
        return false;
    }

}

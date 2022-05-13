package com.letscode.produtosAPI.service;

import com.letscode.produtosAPI.model.Product;
import com.letscode.produtosAPI.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product create(Product request) {
        Product product =
                Product
                        .builder()
                        .name(request.getName())
                        .price(request.getPrice())
                        .build();

        product = productRepository.save(product);

        return product;
    }

    public List<Product> getAll() {
        List<Product> productList = productRepository.findAll();
        return productList;
    }

}

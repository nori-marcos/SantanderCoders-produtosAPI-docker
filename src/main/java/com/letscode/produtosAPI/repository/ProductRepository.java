package com.letscode.produtosAPI.repository;

import com.letscode.produtosAPI.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Integer> {
}

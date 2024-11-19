package com.projetoSpring.projetoSpring.Service;

import com.projetoSpring.projetoSpring.Entidades.Product;
import com.projetoSpring.projetoSpring.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {


    private ProductRepository Repository;

    public ProductService(ProductRepository Repository) {

        this.Repository = Repository;
    }


    public List<Product> findAll() {
        return Repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> product = Repository.findById(id);
        return product.get();
    }
}

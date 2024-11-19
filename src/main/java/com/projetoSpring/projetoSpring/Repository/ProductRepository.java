package com.projetoSpring.projetoSpring.Repository;

import com.projetoSpring.projetoSpring.Entidades.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

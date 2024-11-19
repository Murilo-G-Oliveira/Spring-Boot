package com.projetoSpring.projetoSpring.Repository;

import com.projetoSpring.projetoSpring.Entidades.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}

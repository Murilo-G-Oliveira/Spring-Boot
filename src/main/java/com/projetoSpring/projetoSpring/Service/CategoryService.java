package com.projetoSpring.projetoSpring.Service;

import com.projetoSpring.projetoSpring.Entidades.Category;
import com.projetoSpring.projetoSpring.Repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;


    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }



    public List<Category> findAll() {
        return categoryRepository.findAll();
    }


    public Category findById(Long id){
        Optional<Category> category = categoryRepository.findById(id);
        return category.get();
    }

}

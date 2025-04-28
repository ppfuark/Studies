package com.phfuark.ecommerce.service.category;

import com.phfuark.ecommerce.exception.AlreadyExistsException;
import com.phfuark.ecommerce.exception.CategoryNotFoundException;
import com.phfuark.ecommerce.exception.ProductNotFoundException;
import com.phfuark.ecommerce.model.Category;
import com.phfuark.ecommerce.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService implements CategoryServiceInterface{
    private final CategoryRepository categoryRepository;

    @Override
    public Category addCategory(Category category) {
        return Optional.of(category).filter(newCategory -> !categoryRepository.existsByName(newCategory.getName()))
                .map(categoryRepository :: save)
                .orElseThrow(()-> {throw new AlreadyExistsException("Category " + category.getName() + " already exists!");});
    }

    @Override
    public Category updateCategory(Category category, Long id) {
        Category oldCategory = getCategoryById(id);
        oldCategory.setName(category.getName());
        return categoryRepository.save(oldCategory);
    }


    @Override
    public void deleteCategoryById(Long id) {
        categoryRepository.findById(id)
                .ifPresentOrElse(categoryRepository::delete,
                        ()-> {throw new CategoryNotFoundException("Category not found!");});
    }
    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id)
                .orElseThrow(()-> new CategoryNotFoundException("Category not found!"));
    }

    @Override
    public Category getCategoryByName(String name) {
        return Optional.ofNullable(categoryRepository.findByName(name))
                .orElseThrow(() -> new CategoryNotFoundException("Category with name " + name + " not found!"));
    }


    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

}

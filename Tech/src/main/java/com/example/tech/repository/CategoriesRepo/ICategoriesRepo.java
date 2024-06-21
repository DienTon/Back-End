package com.example.tech.repository.CategoriesRepo;

import com.example.tech.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ICategoriesRepo extends JpaRepository<Categories, Long> {
}

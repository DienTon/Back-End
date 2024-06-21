package com.example.tech.repository.CategoriesOfRepo;

import com.example.tech.model.CategoriesOf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ICategoriesOfRepo extends JpaRepository<CategoriesOf, Long> {
}

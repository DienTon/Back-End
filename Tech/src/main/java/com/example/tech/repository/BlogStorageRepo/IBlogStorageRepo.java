package com.example.tech.repository.BlogStorageRepo;

import com.example.tech.model.BlogStorage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IBlogStorageRepo extends JpaRepository<BlogStorage, Long> {
}

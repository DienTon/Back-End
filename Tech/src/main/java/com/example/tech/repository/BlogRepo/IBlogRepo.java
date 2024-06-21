package com.example.tech.repository.BlogRepo;

import com.example.tech.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IBlogRepo extends JpaRepository<Blog, Long> {
}

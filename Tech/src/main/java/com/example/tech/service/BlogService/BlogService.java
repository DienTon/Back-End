package com.example.tech.service.BlogService;

import com.example.tech.repository.BlogRepo.IBlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepo iBlogRepo;
}

package com.example.tech.service.BlogStorageService;

import com.example.tech.repository.BlogStorageRepo.IBlogStorageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogStorageService implements IBlogStorage{
    @Autowired
    private IBlogStorageRepo iBlogStorageRepo;
}

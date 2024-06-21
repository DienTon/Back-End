package com.example.tech.service.CategoriesService;

import com.example.tech.repository.CategoriesRepo.ICategoriesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriesService implements ICategoriesService{
    @Autowired
    private ICategoriesRepo iCategoriesRepo;
}

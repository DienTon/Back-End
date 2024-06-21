package com.example.tech.service.CategoriesOfService;

import com.example.tech.repository.CategoriesOfRepo.ICategoriesOfRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriesOfService implements ICategoriesOfService {
    @Autowired
    private ICategoriesOfRepo iCategoriesOfRepo;
}

package com.example.tech.service.RoleService;

import com.example.tech.repository.RoleRepo.IRoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService implements IRoleService {
    @Autowired
    private IRoleRepo iRoleRepo;
}

package com.example.tech.service.UserInforService;

import com.example.tech.repository.UserInforRepo.IUserInforRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInforService implements IUserInforService {
    @Autowired
    private IUserInforRepo iUserInforRepo;
}

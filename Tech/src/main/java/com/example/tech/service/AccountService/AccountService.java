package com.example.tech.service.AccountService;

import com.example.tech.repository.AccountRepo.IAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements IAccountService{
    @Autowired
    private IAccountRepo iAccountRepo;

}

package com.example.tech.repository.AccountRepo;

import com.example.tech.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IAccountRepo extends JpaRepository<Account, Long> {
}

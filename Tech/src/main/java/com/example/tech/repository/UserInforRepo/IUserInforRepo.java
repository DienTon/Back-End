package com.example.tech.repository.UserInforRepo;

import com.example.tech.model.UserInfor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IUserInforRepo extends JpaRepository<UserInfor, Long> {
}

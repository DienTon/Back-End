package com.example.tech.repository.RoleRepo;

import com.example.tech.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IRoleRepo extends JpaRepository<Role, Long> {
}

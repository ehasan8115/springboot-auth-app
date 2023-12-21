package net.ehasan.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.ehasan.springboot.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}

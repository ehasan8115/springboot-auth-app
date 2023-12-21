package net.ehasan.springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import net.ehasan.springboot.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

	User findUserByEmail(String email);
}

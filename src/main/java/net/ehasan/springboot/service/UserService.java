package net.ehasan.springboot.service;



import java.util.List;

import net.ehasan.springboot.dto.UserDto;
import net.ehasan.springboot.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();

	User findUserByEmail(String email);
}

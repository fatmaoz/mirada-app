package com.mirada.service.impl;

import com.mirada.dto.UserDTO;
import com.mirada.entity.User;
import com.mirada.mapper.MapperUtil;
import com.mirada.repository.UserRepository;
import com.mirada.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl<UserMapper> implements UserService {

    private final UserRepository userRepository;
    private final MapperUtil mapperUtil;

    public UserServiceImpl(UserRepository userRepository, MapperUtil mapperUtil) {
        this.userRepository = userRepository;
        this.mapperUtil = mapperUtil;
    }
    @Override
    public void save(UserDTO dto) {
        mapperUtil.convert(userRepository.save(new User()),dto);
    }
}

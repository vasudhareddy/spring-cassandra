package com.vasudha.springcassandra.service;

import com.fasterxml.jackson.databind.*;
import com.vasudha.springcassandra.entity.*;
import com.vasudha.springcassandra.model.*;
import com.vasudha.springcassandra.repo.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDataRepository userDataRepository;
    @Autowired
    ObjectMapper objectMapper;

    @Override
    @Transactional
    public void saveUser(UserDataRequest userDataRequest) {
        UserData userData = objectMapper.convertValue(userDataRequest, UserData.class);
        userDataRepository.save(userData);
    }
}

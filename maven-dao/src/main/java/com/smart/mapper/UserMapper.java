package com.smart.mapper;

import com.smart.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserMapper {
    
    List<User> queryAllUser();
}

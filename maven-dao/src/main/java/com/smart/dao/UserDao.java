package com.smart.dao;

import com.smart.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {

    List<User> queryAllUser();
}

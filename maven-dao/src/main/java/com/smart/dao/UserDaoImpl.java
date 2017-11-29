package com.smart.dao;

import com.smart.domain.User;
import com.smart.mapper.UserMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    @Override
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public List<User> queryAllUser() {
        UserMapper mapper = this.getSqlSession().getMapper(UserMapper.class);
        List<User> users = mapper.queryAllUser();
        return users;
    }
}

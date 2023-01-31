package com.ln.service.impl;

import com.ln.mapper.UserMapper;
import com.ln.pojo.UserView;
import com.ln.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




import java.util.List;
import java.util.Map;

@Service
public class UserServicImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserView loginUser(UserView userView) {
        return userMapper.loginUser(userView);
    }

    @Override
    public List<UserView> findAll() {
        return  userMapper.findAll();
    }

    @Override
    public void delUserById(int id) {
        userMapper.delUserById(id);
    }



    @Override
    public void addUser(UserView userView) {
        userMapper.addUser(userView);
    }

    @Override
    public UserView findUserById(Integer id) {
        return userMapper.findUserById(id);
    }

    @Override
    public void updateUserById(UserView userView) {
        userMapper.updateUserById(userView);
    }

    @Override
    public List<UserView> findAll_page(Map map) {
        return userMapper.findAll_page(map);
    }
}

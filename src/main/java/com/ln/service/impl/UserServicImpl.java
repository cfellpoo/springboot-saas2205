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

    /**
     * 用户登录
     *
     * @param userView 用户登录信息
     * @return 根据用户登录信息查询到的用户实体类
     */
    @Override
    public UserView loginUser(UserView userView) {
        return userMapper.loginUser(userView);
    }

    /**
     * 查询全部用户数据
     *
     * @return 全部用户数据
     */
    @Override
    public List<UserView> findAll() {
        return userMapper.findAll();
    }

    /**
     * 查询全部用户数据_分页
     *
     * @param map 分页的参数
     * @return 分页后的用户数据
     */
    @Override
    public List<UserView> findAll_page(Map map) {
        return userMapper.findAll_page(map);
    }

    /**
     * 根据id删除用户
     *
     * @param id 要删除的用户id
     */
    @Override
    public void delUserById(int id) {
        userMapper.delUserById(id);
    }


    /**
     * 添加用户
     *
     * @param userView 要添加的用户实体类
     */
    @Override
    public void addUser(UserView userView) {
        userMapper.addUser(userView);
    }

    /**
     * 根据id查找用户
     *
     * @param id 要查找的用户信息
     * @return 查找到的用户信息
     */
    @Override
    public UserView findUserById(String id) {
        return userMapper.findUserById(id);
    }

    /**
     * 根据id修改用户信息
     *
     * @param userView 要修改的用户信息
     */
    @Override
    public void updateUserById(UserView userView) {
        userMapper.updateUserById(userView);
    }

    /**
     * 用户的数量
     *
     * @return 用户的数量
     */
    @Override
    public Integer UserCount(String likeName) {
        return userMapper.UserCount(likeName);
    }

    /**
     * 根据id批量删除用户
     *
     * @param ids 要删除的用户id数组
     */
    @Override
    public void deluserss(String[] ids) {
        userMapper.deluserss(ids);
    }

    /**
     * 添加用户角色
     *
     * @param userid   用户id
     * @param roleList 角色id数组
     */
    @Override
    public void addUserRole(String userid, String[] roleList) {
        userMapper.addUserRole(userid, roleList);
    }

    /**
     * 删除用户角色
     *
     * @param userid   用户id
     * @param roleList 删除角色id数组
     */
    @Override
    public void delUserRole(String userid, String[] roleList) {
        userMapper.delUserRole(userid, roleList);
    }
}

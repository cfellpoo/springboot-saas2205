package com.ln.mapper;

import com.ln.pojo.UserView;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     * 用户登录
     * @param userView 用户登录信息
     * @return 根据用户登录信息查询到的用户实体类
     */
    UserView loginUser(UserView userView);

    /**
     * 查询全部用户数据
     * @return 全部用户数据
     */
    List<UserView> findAll();

    /**
     * 查询全部用户数据_分页
     * @param map 分页的参数
     * @return 分页后的用户数据
     */
    List<UserView> findAll_page(Map map);

    /**
     * 根据id删除用户
     * @param id 要删除的用户id
     */
    void delUserById(int id);

    /**
     * 添加用户
     * @param userView 要添加的用户实体类
     */
    void addUser(UserView userView);

    /**
     * 根据id查找用户
     * @param id 要查找的用户信息
     * @return 查找到的用户信息
     */
    UserView findUserById(String id);

    /**
     * 根据id修改用户信息
     * @param userView 要修改的用户信息
     */
    void updateUserById(UserView userView);

    /**
     * 用户的数量
     * @return 用户的数量
     */
    Integer UserCount(String likeName);



    /**
     * 根据id批量删除用户
     * @param ids 要删除的用户id数组
     */
    void deluserss(@Param("ids") String[] ids);


    /**
     * 添加用户角色
     * @param userid 用户id
     * @param roleList  角色id数组
     */
    void addUserRole(@Param("userid")String userid,@Param("roleList") String[] roleList);

    /**
     * 删除用户角色
     * @param userid 用户id
     * @param roleList  删除角色id数组
     */
    void delUserRole(@Param("userid")String userid,@Param("delRoleList") String[] roleList);



}

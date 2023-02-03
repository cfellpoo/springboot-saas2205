package com.ln.service.impl;

import com.ln.mapper.RoleMapper;
import com.ln.mapper.UserMapper;
import com.ln.pojo.UserView;
import com.ln.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    /**
     * 查询全部角色数据
     *
     * @return 全部角色数据
     */
    @Override
    public List<UserView> findAllRole() {
        return roleMapper.findAllRole();
    }

    /**
     * 根据id查询角色
     *
     * @param id 用户id
     * @return 根据id查询角色
     */
    @Override
    public List<UserView> findRoleById(String id) {
        return roleMapper.findRoleById(id);
    }

    /**
     * 根据id查询角色_反
     *
     * @param id 用户id
     * @return 根据id查询角色
     */
    @Override
    public List<UserView> findRoleById_un(String id) {
        return roleMapper.findRoleById_un(id);
    }


    /**
     * 查询全部角色数据_分页
     *
     * @param map 分页的参数
     * @return 分页后的角色数据
     */
    @Override
    public List<UserView> findAllRole_page(Map map) {
        return roleMapper.findAllRole_page(map);
    }

    /**
     * 用户的数量
     *
     * @return 用户的数量
     */
    @Override
    public Integer roleCount(String likeName) {
        return roleMapper.roleCount(likeName);
    }
}

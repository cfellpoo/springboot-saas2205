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

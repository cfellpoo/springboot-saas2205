package com.ln.service;

import com.ln.pojo.UserView;

import java.util.List;
import java.util.Map;

public interface RoleService {

    /**
     * 查询全部角色数据
     * @return 全部角色数据
     */
    List<UserView> findAllRole();

    /**
     * 查询全部角色数据_分页
     * @param map 分页的参数
     * @return 分页后的角色数据
     */
    List<UserView> findAllRole_page(Map map);

    /**
     * 用户的数量
     * @return 用户的数量
     */
    Integer roleCount(String likeName);
}

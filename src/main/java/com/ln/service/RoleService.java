package com.ln.service;

import com.ln.pojo.UserView;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RoleService {

    /**
     * 查询全部角色数据
     * @return 全部角色数据
     */
    List<UserView> findAllRole();

    /**
     * 根据id查询角色
     *
     * @return 根据id查询角色
     */
    List<UserView> findRoleById(String id);

    /**
     * 根据id查询角色_反
     *
     * @return 根据id查询角色
     */
    List<UserView> findRoleById_un (String id);

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

package com.ln.mapper;

import com.ln.pojo.PermisssionView;

import java.util.List;

public interface PermisssionMapper {
    /**
     * ztree全部树数据
     * @return
     */
    List<PermisssionView> findAllPermission();
}

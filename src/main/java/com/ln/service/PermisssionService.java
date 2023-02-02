package com.ln.service;

import com.ln.pojo.PermisssionView;

import java.util.List;

public interface PermisssionService {
    /**
     * ztree全部树数据
     * @return
     */
    List<PermisssionView> findAllPermission();
}

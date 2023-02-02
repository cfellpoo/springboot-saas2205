package com.ln.service.impl;

import com.ln.mapper.PermisssionMapper;
import com.ln.pojo.PermisssionView;
import com.ln.service.PermisssionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermisssionServiceImpl implements PermisssionService {

    @Autowired
    private PermisssionMapper permisssionMapper;


    /**
     * ztree全部树数据
     *
     * @return
     */
    @Override
    public List<PermisssionView> findAllPermission() {
        return permisssionMapper.findAllPermission();
    }
}

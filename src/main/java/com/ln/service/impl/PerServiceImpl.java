package com.ln.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ln.mapper.PerMapper;
import com.ln.pojo.PermissionView;
import com.ln.service.PerService;

import java.util.List;

@Service
public class PerServiceImpl implements PerService {
	@Autowired
	private PerMapper perMapper;
	@Override
	public List<PermissionView> findPer() {
		return perMapper.findPer();
	}

}

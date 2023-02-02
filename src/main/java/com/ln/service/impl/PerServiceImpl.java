package com.ln.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ln.mapper.PerMapper;
import com.ln.pojo.Permission;
import com.ln.service.PerService;
@Service
public class PerServiceImpl implements PerService {
	@Autowired
	private PerMapper perMapper;
	@Override
	public Permission findPer() {
		return perMapper.findPer();
	}

}

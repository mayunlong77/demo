package com.order.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.dao.TestMapper;
import com.order.service.TestService;


@Service
public class TestServiceImpl implements TestService {
    
    @Autowired
    private TestMapper testMapper;
    
    @Override
    public Object getData() {
        return testMapper.selectByPrimaryKey(1);
    }
    
}

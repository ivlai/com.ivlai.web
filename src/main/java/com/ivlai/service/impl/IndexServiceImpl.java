package com.ivlai.service.impl;

import com.ivlai.entity.TheTest;
import com.ivlai.mapper.TheDBTestMapper;
import com.ivlai.service.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class IndexServiceImpl implements IndexService {

    @Resource
    private TheDBTestMapper theDBTestMapper;

    @Override
    public boolean index() {
        return false;
    }

    @Override
    public TheTest dbTest() {
        return theDBTestMapper.dbTest();
    }
}

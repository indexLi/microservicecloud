package com.lisong.springcloud.service.impl;

import com.lisong.springcloud.dao.DeptDao;
import com.lisong.springcloud.entities.Dept;
import com.lisong.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lisong
 * @create 2021-04-07 22:26
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao dao ;

    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }
}

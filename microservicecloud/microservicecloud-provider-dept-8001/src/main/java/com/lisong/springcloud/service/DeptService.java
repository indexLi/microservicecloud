package com.lisong.springcloud.service;

import com.lisong.springcloud.entities.Dept;

import java.util.List;

/**
 * @author lisong
 * @create 2021-04-07 22:24
 */
public interface DeptService {

    public boolean add(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();
}

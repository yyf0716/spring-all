package com.yyf.springcloud.services;

import java.util.List;

import com.yyf.springcloud.entities.Dept;

public interface DeptService {
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}

package com.yyf.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yyf.springcloud.entities.Dept;
import com.yyf.springcloud.service.DeptClientService;

@RestController
public class DeptController_Consumer {

	@Autowired
	private DeptClientService deptClientService;

	@RequestMapping(value = "/consumer/dept/add")
	public boolean add(Dept dept) {

		return true;
	}

	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {

		Dept dept = deptClientService.get(id);

		return dept;
	}

	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list() {

		List<Dept> list = deptClientService.list();

		return list;
	}
}

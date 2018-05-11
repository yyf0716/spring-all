package com.yyf.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.yyf.springcloud.entities.Dept;

@RestController
public class DeptController_Consumer {

	private static final String rest_url_prefix = "http://MICROSERVICECLOUD-DEPT";

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/consumer/dept/add")
	public boolean add(Dept dept) {

		restTemplate.postForObject(rest_url_prefix + "/dept/add", dept, Boolean.class);

		return true;
	}

	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {

		Dept dept = restTemplate.getForObject(rest_url_prefix + "/dept/get/" + id, Dept.class);

		return dept;
	}

	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list() {

		List<Dept> list = restTemplate.getForObject(rest_url_prefix + "/dept/list", List.class);

		return list;
	}
}

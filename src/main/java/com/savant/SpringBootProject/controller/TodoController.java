package com.savant.SpringBootProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.savant.SpringBootProject.model.Todo;
import com.savant.SpringBootProject.service.TodoService;

@RestController
public class TodoController {
	@Autowired
	private TodoService todoService;
	
	@GetMapping("/user/{name}/todos")
	public List<Todo> retrieveTodos(@PathVariable String name) {
		return todoService.retrieveTodos(name);
	}

}

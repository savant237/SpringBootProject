package com.savant.SpringBootProject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.savant.SpringBootProject.controller.TodoController;
import com.savant.SpringBootProject.model.Todo;
import com.savant.SpringBootProject.service.TodoService;

@RunWith(SpringRunner.class)
@WebMvcTest(TodoController.class)
public class TodoControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private TodoService service;
	
	@Test
	public void retrieveTodos() throws Exception {
		List<Todo> mockList = new ArrayList<Todo>();
		mockList.add(new Todo(1,"Jack","Learn Spring MVC", new Date(), false));
		mockList.add(new Todo(2,"Jack","Learn Struts", new Date(),false));
		
		//when(service.retrieveTodos(anyString())).
	}

}

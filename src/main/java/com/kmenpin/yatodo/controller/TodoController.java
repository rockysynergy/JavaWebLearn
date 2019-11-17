package com.kmenpin.yatodo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import com.kmenpin.yatodo.domain.model.Todo;
import com.kmenpin.yatodo.domain.repository.TodoMapper;

@Controller
@RequestMapping("todo")
public class TodoController {
	
	@RequestMapping("index")
	public String index(ModelMap map) throws IOException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		TodoMapper todoMapper = ctx.getBean(TodoMapper.class);
		List<Todo> todos = todoMapper.getAllTodo();
		map.addAttribute("todos", todos);
		return ("index");
	}

	@RequestMapping(value="save", method=RequestMethod.POST)
	@ResponseBody
	public RedirectView save(@ModelAttribute("SpringWeb")Todo todo) throws IOException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		TodoMapper todoMapper = ctx.getBean(TodoMapper.class);
		todoMapper.insertTodo(todo);
		return new RedirectView("/yatodo/ytd/todo/index");
	}
}
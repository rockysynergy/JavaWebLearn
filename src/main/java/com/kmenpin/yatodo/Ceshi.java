package com.kmenpin.yatodo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kmenpin.yatodo.domain.model.Todo;
import com.kmenpin.yatodo.domain.repository.TodoMapper;

public class Ceshi {
	public static void main(String args[]) {
		System.out.println("Hey Ceshi is called!");
		testTodoMapper();
	}
	
	public static void testTodoMapper() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		TodoMapper todoMapper = ctx.getBean(TodoMapper.class);
		Todo todo = new Todo();
		todo.setTitle("Buy the milk!");
		todo.setDeadline("2019-11-29 20:15:30");
		// todoMapper.insertTodo(todo);
		
		Todo aTodo = todoMapper.getTodo(1L);
		System.out.println("The todo is: " + aTodo.getTitle() + aTodo.getDeadline()+">>aaa");
	}
}

package com.kmenpin.yatodo.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.kmenpin.yatodo.domain.model.Todo;

@Repository
public interface TodoMapper {
	public int insertTodo(Todo todo);
	public Todo getTodo(@Param("id") Long id);
	public List<Todo> getAllTodo();
}

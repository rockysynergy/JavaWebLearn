package yatodo.domain.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import yatodo.domain.model.Todo;

@Repository
public interface TodoMapper {
	public int insertTodo(Todo todo);
	public Todo getTodo(@Param("id") Long id);
}

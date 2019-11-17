<!DOCTYPE html>
<html>
<meta charset="utf-8" />
<title>The todo index</title>
<body>
	<h1>The Todo Index</h1>
	
	<form method="post" action="/yatodo/ytd/todo/save">
		<input name="title" placeholder="title" />
		<input name="deadline" placeholder="deadline" />
		
		<button type="submit" value="submit">Ã·Ωª</button>
	</form>
	
	<hr />
	<ul>
	<#list todos as todo>
		<li>${todo.id}. ${todo.title}:${todo.deadline}</li>
	</#list>
	</ul>
</body>
</html>
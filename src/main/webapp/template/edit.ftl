<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<title>The todo index</title>
</head>
<body>
	<h1>The Todo edit</h1>
	<form method="post" action="/yatodo/ytd/todo/update">
		<input type="hidden" name="id" value="${todo.id}" />
		
		<input name="title" value="${todo.title}" placeholder="title" />
		<input name="deadline" value="${todo.deadline}" placeholder="deadline" />
		
		<button type="submit" value="submit">Ã·Ωª</button>
	</form>
</body>
</html>
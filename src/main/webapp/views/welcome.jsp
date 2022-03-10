<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IT16304</title>
</head>
<body>
	<form method="GET"
		action="/SP22B2_SOF3011_IT16304/HelloServlet">
		<label>Họ tên</label>
		<input type="text" name="ho_ten" />
		<button>Gửi</button>
	</form>
	<h2>Hello ${ name }</h2>
</body>
</html>

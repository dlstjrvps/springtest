<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>movie list</h2>
	${list.size()}
	<div>
		<c:forEach var="m" items="${list}">
			<div>${m.movieName}</div>
		</c:forEach>
	</div>
</body>
</html>
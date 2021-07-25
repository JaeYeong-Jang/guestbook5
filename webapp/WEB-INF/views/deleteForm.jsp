<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/delete" method="get">
비밀번호<input type="text" name="pw" value="">
<input type="hidden" name="no" value="${guestBookVo.no }">
<button type="submit">[확인]</button> <br>
</form>
<a href="${pageContext.request.contextPath }/list">메인으로 돌아가기</a>

</body>
</html>
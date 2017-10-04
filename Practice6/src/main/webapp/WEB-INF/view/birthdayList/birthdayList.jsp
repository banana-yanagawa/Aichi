<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>☆あなたの誕生日の半年分の占い結果☆</h2>

	<c:forEach var="bir" items="${birthdayList}">
		<table border="1" cellpadding="5">
		<th>占い日</th>
			<td width="120"><c:out value="${bir.updateDay}" /></td>

			<th>運勢</th>
			<td width="120"><c:out value="${bir.unseiName}" /></td>

			<th>願い事</th>
			<td width="120"><c:out value="${bir.negaigoto}" /></td>

			<th>商い</th>
			<td width="120"><c:out value="${bir.akinai}" /></td>

			<th>学問</th>
			<td width="120"><c:out value="${bir.gakumon}" /></td>

		</table>
	</c:forEach>

	<br>

	<p>
		<a href="/Practice6/">占い画面に戻る</a>
	</p>

	<br>

</body>
</html>
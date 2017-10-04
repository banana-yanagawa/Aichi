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

	<h2><c:out value="${day}" />の占い結果の割合</h2>

	<p>
		総おみくじ回数：
		<c:out value="${todaySum}" />
		回
	</p>


	<p>
		<c:forEach var="result" items="${today}">
			<table border="1" cellpadding="15">
				<th width="50" align="center" valign="middle"><c:out
						value="${result.unseiName}" /></th>
				<td width="80" align="center" valign="middle"><c:out
						value="${result.persent}" /></td>
			</table>
		</c:forEach>

	</p>

	<br>

	<h2>半年分の占い結果の割合</h2>

	<p>
		総おみくじ回数：
		<c:out value="${hantoshiSum}" />
		回
	</p>


	<p>
		<c:forEach var="result" items="${hantoshi}">
			<table border="1" cellpadding="15">
				<th width="50" align="center" valign="middle"><c:out
						value="${result.unseiName}" /></th>
				<td width="80" align="center" valign="middle"><c:out
						value="${result.persent}" /></td>
			</table>
		</c:forEach>

	</p>

	<br>

	<p>
		<a href="/Practice6/">占い画面に戻る</a>
	</p>

</body>
</html>
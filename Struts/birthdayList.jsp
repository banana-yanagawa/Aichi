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

<h2>あなたの誕生日の半年分の占い結果</h2>

<c:forEach var = "bir" items = "${birthdayList}">
<table border = "1" cellpadding="10">
<td width = "180">占い日：<c:out value = "${bir.fortuneDay}" /></td>
<td width = "90">運勢：<c:out value = "${bir.unseiname}" /></<td>
<td width = "150">願い事：<c:out value = "${bir.negaigoto}" /></<td>
<td width = "150">商い：<c:out value = "${bir.akinai}" /></<td>
<td width = "150">学問：<c:out value = "${bir.gakumon}" /></<td>
</table>
</c:forEach>

<p><a href="/Struts/Welcome.do">占い画面に戻る</a></p>

<br>

</body>
</html>
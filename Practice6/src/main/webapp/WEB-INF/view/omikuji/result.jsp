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



	<h2>占い結果は・・・</h2>
	<br>

	<h3>

		<p>
			運勢：
			<c:out value="${result.unsei}" />
		</p>
		<p>
			願い事：
			<c:out value="${result.negaigoto}" />
		</p>
		<p>
			商い：
			<c:out value="${result.akinai}" />
		</p>
		<p>
			学問：
			<c:out value="${result.gakumon}" />
		</p>

	</h3>

	<br>

	<p>↓過去半年の結果を見てみる↓</p>
	<s:form action="/birthdayList">
		<input type="hidden" name="birthday" value="${birthday}">
		<s:submit property="result" value="半年分の結果" />
	</s:form>

	<br>

	<p>↓本日と半年分の結果の割合↓</p>
	<s:form action="/wariai">
		<input type="hidden" name="birthday" value="${birthday}">
		<s:submit property="result" value="割合" />
	</s:form>

	<br>

	<p>↓占い結果を送信↓</p>
	<s:form action="/test">
		<s:submit property="send" value="占い結果を送信する" />
	</s:form>

	<br>

	<p>
		<a href="/Practice6/">占い画面に戻る</a>
	</p>





</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>占い結果の送信</h2>

<s:form action = "/send" method = "post">
<s:submit property="re" value="送信画面に進む" />
<html:errors property = "postalCode"/>
</s:form>

</body>
</html>
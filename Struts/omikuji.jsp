<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>

<body>


<h2>生年月日を入力してね！（例：1995-03-25）</h2>

<form action = "/Struts/omikuji.do" method = "post">
<input type = "text" name = "birthday"/>
<input type = "submit" value = "占う"/>
</form>

<html:errors></html:errors>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">



function change(postelCode,address){

	f.postelCode.value = postelCode;
	f.address.value = address;

}

function copy(){


	window.opener.document.form_name.postelCode.value = f.postelCode.value;
	window.opener.document.form_name.address.value = f.address.value;
	window.close();
}


</script>
</head>
<body>

<form action = "/Practice6/send" method = "post" name = "f">
<c:forEach var="se" items="${test}">

<input type="radio" value="${se.address}" onclick="change('${se.postelCode}','${se.address}')"/>
<!--  <input type="radio" name="postelCode" value="${se.postelCode}" checked = checked style="display:none;" />-->


<c:out value="${se.postelCode}" />：<c:out value="${se.address}" />
<p>

</c:forEach>

<input type = "hidden" name="address" value=""/>
<input type = "hidden" name="postelCode" value=""/>

<s:submit property="jusho" value="送信する" onclick="copy()"/>

</form>

</body>
</html>
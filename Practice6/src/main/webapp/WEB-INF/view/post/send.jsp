<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function check(param) {

		param = form_name.submit.value;

		if (param == 'A') {

			var request = new XMLHttpRequest();



			request.open("POST","http://localhost:8080/Practice6/post.do",true);

			request.setRequestHeader("Content-Type","application/x-www-form-urlencoded; charset=UTF-8");

			var encName = encodeURIComponent("postelCode");
			var encValue = encodeURIComponent(document.form_name.postelCode.value);
			var data = '?' + encName + '=' + encValue;

			request.send("?postelCode=4660003");

			request.onload = function() {

				var res = request.responseText;
				alert(res);

			}

		} else if (param == 'B') {

			var ad = document.form_name.address.value;

			window.open("/Practice6/window.do?address=" + ad, "new",
					"width=500,height=500");

		} else if (param == 'C') {

			var form2 = document.getElementById("form");
			for (i = 0; i < form2.length; i++) {
				if ((form2.elements[i].type == "text")
						&& (form2.elements[i].value == "")) {
					alert("全ての欄に入力してください");
					return false;

				}

			}

		}

	}

	function moji() {

		var a = document.form_name.postelCode.value.length;
		if (a > 7) {
			alert("郵便番号は7文字で入力してください");
		}

	}
</script>
<script src="https://code.jquery.com/jquery-3.2.1.min.js">


function aj(){



}

</script>
</head>
<body>

	<h2>占い結果の送信</h2>



	<form name="form_name" id="form" method="post"
		onsubmit="return check(form_name.submit.value)">

		<INPUT TYPE=HIDDEN NAME="submit" value="${param.name}"> 名前 ：
		<html:text property="name" name="name" value="${param.name}" />
		<html:errors property="name" />
		<p>



			郵便番号：
			<html:text property="postelCode" name="postelCode"
				value="${send.postelCode}" onkeyup="moji()" />

			<s:submit property="send" value="郵便番号から検索"
				onclick="form_name.submit.value='A'" />


			<html:errors property="postalCode" />
		<p>

			住所 ：
			<html:text size="30" name="add" property="address"
				value="${send.address}" />
			<html:errors property="address" />

			<s:submit property="jusho" value="住所から検索"
				onclick="form_name.submit.value='B'" />
		<p>

			<br />

			<s:submit property="finish" value="送信する"
				onclick="form_name.submit.value='C'" />
	</form>

</body>
</html>
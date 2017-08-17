<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>JINSEIROKU/TOP</title>
</head>
<body>
<h1><strong>JINSEIROKU</strong></h1>
<form:form>
	<table border="1">
		<tr>
			<th><strong>人生記録を開始する</strong></th>
		</tr>
		<tr>
			<td>EMAIL:<input type="text"/></td>
		</tr>
		<tr>
			<td>PASSWORD:<input type="text"/></td>
		</tr>
	</table>
	<form:form action="${pageContext.request.contextPath }/">
		<input type="submit" value="開始">
	</form:form>
</form:form>
<a href="${pageContext.request.contextPath }/">新規登録</a>
</body>
</html>
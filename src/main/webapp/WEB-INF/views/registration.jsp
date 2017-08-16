<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>新規登録</title>
</head>
<body>
<h1>新規登録フォーム</h1>
name:<form:input path="name"/><br>
mailAddress:<form:input path="mailAddress"/><br>
password:<form:input path="password"/><br>
checkPassword:<form:input path="checkPassword"/><br>
<p>
<form:form action="${pageContext.request.contextPath }">
	<input type="submit" value="戻る">
</form:form>
<form:form action="${pageContext.request.contextPath }">
	<input type="submit" value="登録">
</form:form>
</body>
</html>
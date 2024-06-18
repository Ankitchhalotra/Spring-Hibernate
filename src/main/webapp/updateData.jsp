<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Data here</title>
</head>
<body>
<h1>Update Data</h1>
<hr>
<sf:form action="updatedata" modelAttribute="info">
Roll NO. <sf:input path="rno"/><br>
Name <sf:input path="name"/><br>
Branch <sf:input path="branch"/><br><br>
<input type="submit" value="UPDATE"> 
</sf:form>
</body>
</html>
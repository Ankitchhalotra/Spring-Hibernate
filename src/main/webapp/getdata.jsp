<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1>Student Data</h1>
<hr>
Roll :  ${info.rno } <br>
Name : ${info.name } <br>
Branch : ${info.branch }<br>
<hr>
<a href="update?rno=${info.rno}">Update-Data</a><br><br>
<a href="index.jsp">GO-Home</a>
</body>
</html>
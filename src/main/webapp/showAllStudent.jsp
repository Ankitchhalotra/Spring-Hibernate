<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>


<html>
<head>
<title>Show Data Page</title>
</head>
<body>
<h1>All Student Data</h1>
<hr>
<table border="1">
		<tr><th>Roll NO.</th><th>Name</th><th>Bramch</th></tr>
<jstl:forEach var="product" items="${ info }">
      <tr>
         <td>  ${product.rno }</td> 
         <td>  ${product.name } </td>
         <td>  ${product.branch } </td>
      </tr>
</jstl:forEach>
</table>
<hr>
<a href="index.jsp">Go-Home</a>
</body>
</html>
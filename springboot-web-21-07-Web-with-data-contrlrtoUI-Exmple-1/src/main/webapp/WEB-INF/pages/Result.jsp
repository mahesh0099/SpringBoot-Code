<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>WELCOME TO RESULT PAGE</h2>
Data is::: ${ob.empId} - ${ob.empName} - ${ob.empSal}
List data is::: ${list}
map data is::: ${map}

<table border="1"> 
<tr>
	<th>ID</th>
	<th>NAME</th>
	<th>SALARY</th>
</tr>
<c:forEach items="${emps}" var="ob">
	<tr>
		<td>${ob.empId }</td>
		<td>${ob.empName }</td>
		<td>${ob.empSal }</td>
	</tr>	
</c:forEach>
</table>



</body>
</html>
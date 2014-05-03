<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User Page</title>
</head>
<body>
<br/>


Calculator <BR><BR>
<form name= calculator method="GET" action="/com.sd.service1/api/query/calculator">
Enter operand1 :<input type="text" name="temp1" id="temp1" ><br>
Enter operator :<input type="text" name="temp2" id="temp2" ><br>
Enter operand2 :<input type="text" name="temp3" id="temp3" ><br>


<input type="submit" value="submit">
</form>

</body>
</html>
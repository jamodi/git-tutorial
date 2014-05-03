<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Temperature Conversion</title>
</head>
<body>
<br/>

Calculate your BMI <BR><BR>
<form name= BMI method="GET" action="/com.sd.service1/api/query/bmi">
Enter the Weight :<input type="text" name="temp1"><br>
Enter the Height :<input type="text" name="temp2"><br>
<input type="submit" value="submit">
</form>

</body>
</html>
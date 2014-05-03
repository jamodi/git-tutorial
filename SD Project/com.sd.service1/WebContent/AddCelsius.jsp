<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Temperature Conversion</title>
</head>
<body>
<br/>

Temperature Conversion from to Celsius to Fahernheit <BR><BR>
<form name= TemperatureConversion method="GET" action="/com.sd.service1/api/query/degreec">
Enter Temperature in Celsius :<input type="text" name="temp"><br>

<input type="submit" value="submit"><br>
</form>

</body>
</html>
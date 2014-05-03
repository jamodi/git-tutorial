<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Date & Time</title>
</head>
<body>
<br/>

Choose your preference <BR><BR>
<form name= TemperatureConversion method="GET" action="/com.sd.service1/api/query/time">
Type the way you want the time and date should be displayed :<br>
1) Only Time : time <br>
2) Only Date : date	<br>
3) Time and Date : time&date <br>
4) Date and Time : date&time <br>
<input type="text" name="temp"><br>
<input type="submit" value="submit">
</form>

</body>
</html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>show page</title>
</head>
<body>
<h2>Course information:</h2>
<ul><c:forEach var="course" items="${AL}">
<li><h1>${course}</h1></li>
</c:forEach>
</ul>
</body>
</html>
<%@ page import="ru.nde.polyglotpersistence.MongoDB" %>

<html>
<body>

<h1>Hello!</h1>

<%
    MongoDB mongoDB = new MongoDB();

    mongoDB.start();
%>

</body>
</html>
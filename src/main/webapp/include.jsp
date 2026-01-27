<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<body>

<h1>Main Page</h1>

<%
  boolean showHello = Math.random() > 0.5;
%>

<% if (showHello) { %>
<jsp:include page="hello_page.jsp" />
<% } else { %>
<p>Hello page was NOT included.</p>
<% } %>

<p>Page continues after include.</p>

</body>
</html>


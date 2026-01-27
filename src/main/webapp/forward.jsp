<%@ page contentType="text/html; charset=UTF-8" %>

<%
  String destination;

  // Randomly choose a page
  if (Math.random() > 0.5) {
    destination = "hello_page.jsp";
  } else {
    destination = "index.jsp";
  }
%>

<jsp:forward page="<%= destination %>" />
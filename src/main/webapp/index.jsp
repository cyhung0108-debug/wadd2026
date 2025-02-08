<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Index page</title>
</head>
<body>
<jsp:useBean id="visit" scope="application"
             class="hkmu.wadd.VisitCounter"/>
<jsp:setProperty name="visit" property="count"
                 value='<%= visit.getCount() + 1 %>'/>
<h1>Example</h1>
The site was visited for
<jsp:getProperty name="visit" property="count"/>
times.

<%!
    public void jspInit() {
        System.out.println("JSP servlet " + this.getServletName() + " has started.");
    }

    public void jspDestroy() {
        System.out.println("JSP servlet " + this.getServletName() + " has stopped.");
    }
%>
</body>
</html>

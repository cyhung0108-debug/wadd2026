package hkmu.wadd;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.Date;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        Date today = new Date();
        request.setAttribute("today", today);

        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/jsp/hello_page.jsp");
        view.forward(request, response);
    }

    @Override
    public void init() {
        System.out.println("Servlet " + this.getServletName() + " has started.");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet " + this.getServletName() + " has stopped.");
    }
}

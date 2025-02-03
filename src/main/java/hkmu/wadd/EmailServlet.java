package hkmu.wadd;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(name = "emailServlet", value = "/echoEmail")
public class EmailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        RequestDispatcher view
                = request.getRequestDispatcher("/WEB-INF/jsp/email_form.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        RequestDispatcher view
                = request.getRequestDispatcher("/WEB-INF/jsp/email_echo.jsp");
        view.forward(request, response);
    }
}
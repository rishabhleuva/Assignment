// RegistrationServlet.java
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String username = req.getParameter("username");
        req.setAttribute("uname", username);
        RequestDispatcher rd = req.getRequestDispatcher("registrationSuccess.jsp");
        rd.forward(req, res);
    }
}

// LoginServlet.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String user = req.getParameter("user");
        RequestDispatcher rd;
        if (user != null && !user.isEmpty()) {
            req.setAttribute("username", user);
            rd = req.getRequestDispatcher("welcome.jsp");
            rd.forward(req, res);
        } else {
            rd = req.getRequestDispatcher("login.jsp");
            rd.include(req, res);
            res.getWriter().println("<br><b>Please enter a username.</b>");
        }
    }
}

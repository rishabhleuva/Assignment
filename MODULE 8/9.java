import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SimpleCGIServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        
        out.println("<html><body>");
        out.println("<h3>User Information:</h3>");
        out.println("Name: " + name + "<br>");
        out.println("Email: " + email + "<br>");
        out.println("</body></html>");
    }
}

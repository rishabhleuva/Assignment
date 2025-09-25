import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HttpMethodServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("Handled GET request");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("Handled POST request");
    }
}

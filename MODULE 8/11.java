import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// GenericServlet example
public class MyGenericServlet extends GenericServlet {
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h3>This is from GenericServlet</h3>");
        out.println("</body></html>");
    }
}

// HttpServlet example
public class MyHttpServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h3>This is from HttpServlet</h3>");
        out.println("</body></html>");
    }
}

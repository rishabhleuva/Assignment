import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ServletContextExample extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        ServletContext context = getServletContext();
        context.setAttribute("appName", "MyWebApp");
        
        String appName = (String) context.getAttribute("appName");
        res.getWriter().write("Application Name: " + appName);
    }
}

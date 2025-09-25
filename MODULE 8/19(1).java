import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SharedDataServlet2 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        ServletContext context = getServletContext();
        String sharedData = (String) context.getAttribute("sharedData");
        res.getWriter().write("Servlet2: Shared Data = " + sharedData);
    }
}

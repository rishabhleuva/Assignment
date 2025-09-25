import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LifecycleServlet extends HttpServlet {
    public void init() throws ServletException {
        System.out.println("Servlet Initialization");
    }
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Service method called");
        super.service((HttpServletRequest) req, (HttpServletResponse) res);
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.getWriter().write("Hello from doGet");
    }
    public void destroy() {
        System.out.println("Servlet Destroyed");
    }
}

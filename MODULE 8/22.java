import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class EmptyFieldFilter implements Filter {
    public void init(FilterConfig config) {}

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        String field = req.getParameter("field");
        if (field == null || field.trim().isEmpty()) {
            req.getRequestDispatcher("form.jsp").forward(req, res);
        } else {
            chain.doFilter(req, res);
        }
    }

    public void destroy() {}
}

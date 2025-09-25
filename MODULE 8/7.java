import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HeaderDisplayServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        response.setHeader("Custom-Header", "MyCustomValue");

        PrintWriter out = response.getWriter();
        out.println("<html><body><h2>HTTP Request Headers</h2>");
        
        java.util.Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            out.println("<b>" + headerName + "</b>: " + request.getHeader(headerName) + "<br>");
        }
        out.println("</body></html>");
    }
}

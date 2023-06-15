import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomePageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Home Page</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Welcome to the Home Page!</h1>");
        out.println("<p>This is a simple home page created using Java Servlet.</p>");
        out.println("</body>");
        out.println("</html>");
    }
}

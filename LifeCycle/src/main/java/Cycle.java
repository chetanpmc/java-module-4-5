import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = {"/ServletLifeCycleDemo"})
public class Cycle extends HttpServlet 
{

    @Override
    public void init() throws ServletException 
    {
        System.out.println("Servlet has been Initialized...");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
    {
        PrintWriter out = res.getWriter();
        out.println("Servlet Life Cycle Has three stages n1. Initializationn2. Servicen3. Destroy");
        System.out.println("Servlet started servicing...");
    }

    @Override
    public void destroy() 
    {
        System.out.println("Servlet has been Destroyed...");
    }
}
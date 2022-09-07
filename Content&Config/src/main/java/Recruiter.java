
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Recruiter extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String email = getServletConfig().getInitParameter("Email");
		String website = getServletContext().getInitParameter("Website-name");
		PrintWriter out = response.getWriter();
		out.println("<center><h1>" + website + "</h1></center><br><p>Contact us:" + email);
	}
}
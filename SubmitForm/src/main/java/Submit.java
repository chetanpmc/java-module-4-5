import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	public class Submit extends HttpServlet 
	{
	
		private static final long serialVersionUID = 4852891490110059658L;

		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException 
		{
			// TODO Auto-generated method stub
			String name = request.getParameter("pname");
			int age = Integer.parseInt(request.getParameter("page"));

			 response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			out.print("Name: "+name+" Age: "+age );
		}
	}

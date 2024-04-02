package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class first
 */
@WebServlet("/first")
public class first extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public first() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("uname");
		 String pass=request.getParameter("pass");
		 
		 out.print("<h1> WELCOME  " + name + "  </h1> <br>");
		 out.print("<h1><a href='Second?val=" + name + "'>  LINK </a>  </h1>");
        
		 out.print("<hr>");
			
			out.print("<form action='Second' method='get'>");

			out.print("<input type='hidden' name='val' value='" + name + "'>");

			out.print("<input type='submit' value='NEXT'>");

			out.print("</form>");

		 

	}

}

package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Profile
 */
@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Profile() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<hr>");
		
		out.print("<h1>  <a href='Profile' >  PROFILE  </a>  </h1> <br>");
		out.print("<h1>  <a href='LogOut' >  LOGOUT  </a>  </h1> <br>");

		out.print("<hr>");
		boolean flag=true;
		Cookie ck[]=request.getCookies();
		
		for(int i=0;i<ck.length;i++)
		{
			if (ck[i].getName().equals("ckid") && ck[i].getValue().equals("123")) {
				out.print("<h1> WELCOME TO PROFIE  " + ck[i].getName());
				flag = false;
	      		break;

			}
			
			if(flag)
				out.print("<h1> RELOGIN AGAIN !!! </h1>");
			request.getRequestDispatcher("/index.html").include(request, response);

		}
		
		
		



	}

}

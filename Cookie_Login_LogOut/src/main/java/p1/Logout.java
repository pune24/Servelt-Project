package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Logout() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 response.setContentType("text/html");
	 PrintWriter out=response.getWriter();
	 
	 out.print("<hr>");
		out.print("<h1>  <a href='index.html'>  LOGIN  </a>  </h1> <br>");
		out.print("<h1>  <a href='Profile'>  PROFILE  </a>  </h1> <br>");
		out.print("<h1>  <a href='Logout'>  LOGOUT  </a>  </h1> <br>");
		
		out.print("<hr>");
		Cookie ck=new Cookie("ckid","");
		response.addCookie(ck);
		ck.setMaxAge(0);
		out.print("<h1> SUCCES LOGOUT !!! </h1>");


		
		
	}

}

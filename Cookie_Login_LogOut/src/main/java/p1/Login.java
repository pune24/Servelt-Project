	package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 
			
		response.setContentType("text/html");
		  PrintWriter out=response.getWriter();
		  out.print("<hr>");
			out.print("<h1>  <a href='index.html' >  LOGIN  </a>  </h1> <br>");
			out.print("<h1>  <a href='Profile' >  PROFILE  </a>  </h1> <br>");
			out.print("<h1>  <a href='Logout' >  LOGOUT  </a>  </h1> <br>");
			
			out.print("<hr>");
			
		String name=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
        if(name.equals("hello")&& pass.equals("123")) {
			out.print("<h1> WELCOME  "+name +"  </h1> <br>");
			Cookie ck=new Cookie("ckid", pass);
			response.addCookie(ck);
		}
		else {
			out.print("<h1> INVALID  CREDIENTILS   </h1>");
			out.print("<h1> RELOGIN AGAIN !!! </h1>");
			request.getRequestDispatcher("/index.html").include(request, response);
			
		}

		
		
		
		
	  
		
	}
	}



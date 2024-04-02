package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
   		PrintWriter out=response.getWriter();
   		out.print("<a href='index.html'>"+"LOGIN"+"</a>");
   		out.print("<br>");
   		out.print("<a href='ProfileServlet'>"+"PROFILE"+"</a>");
   		out.print("<br>");
   		out.print("<a href='LogOutServlet'>"+"LOGOUT"+"</a>");
   		out.print("<br>");
   		String name=request.getParameter("uname");
   		if(name.equals("")){
   		HttpSession session=request.getSession();
   		session.setAttribute("seesionValue", name);
   		out.print("Welcome To Login <h1>"+name+"</h1>");
             }    else{
            	 request.getRequestDispatcher("index.html").include(request, response);

               //Write Code To Go To Relogin   
            }		
	}


	}



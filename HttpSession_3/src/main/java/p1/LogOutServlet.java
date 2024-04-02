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
 * Servlet implementation class LogOutServlet
 */
@WebServlet("/LogOutServlet")
public class LogOutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogOutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<a href='index.html'>" + "LOGIN" + "</a>");
		out.print("<br>");
		out.print("<a href='ProfileServlet'>" + "PROFILE" + "</a>");
		out.print("<br>");
		out.print("<a href='LogOutServlet'>" + "LOGOUT" + "</a>");
		out.print("<br>");

		HttpSession session = request.getSession();
		session.setAttribute("seesionValue", "");
		
		session.invalidate();
			
	out.print("<h2> YOU ARE SUCESSFULLY LOGOUT  </h2> <br>");	
	}



	}



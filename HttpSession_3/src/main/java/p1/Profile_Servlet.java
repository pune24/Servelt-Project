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
 * Servlet implementation class Profile_Servlet
 */
@WebServlet("/Profile_Servlet")
public class Profile_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Profile_Servlet() {
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
		out.print("<a href='Profile_Servlet'>" + "PROFILE" + "</a>");

		out.print("<br>");
		out.print("<a href='LogOutServlet'>" + "LOGOUT" + "</a>");
		out.print("<br>");

		



HttpSession session = request.getSession(false);

if (session != null) {

String name = (String) session.getAttribute("seesionValue");
out.print("<h1>Welcome To Profiler " + name + "</h1>");

} else {
	out.print("<h1>Your Session InValidate</h1>");
request.getRequestDispatcher("index.html").include(request, response);
      }

	}




	

}

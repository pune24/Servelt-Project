package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/First")
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public First() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session =request.getSession();
out.print("<h1>  Session Id" + session.getId() + "  </h1> <br>");
out.print("<h1>  Session Creation Time" + session.getCreationTime() + "  </h1> <br>");
out.print("<h1>  Session Creation Time" + new Date(session.getCreationTime()) + "  </h1> <br>");
out.print("<h1>  Session Creation Time" + new Date(session.getLastAccessedTime()) + "  </h1> <br>");
out.print("<h1>  Session Creation Time" + session.getMaxInactiveInterval() + "  </h1> <br>");


	}

}

package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class App2 extends HttpServlet{

	private static final long serialVersionUID = 1L;
    
	public App2 () {
        super();
    }
	
	   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			
	    	response.setContentType("text/html");
	    	PrintWriter out=response.getWriter();
	    	
	    	String id=request.getParameter("id");
	    	String name=request.getParameter("uname");
	    	String salary=request.getParameter("salary");
	    	
	    	
	    	out.print("<html>");
	    	out.print("<body>");
	    	out.print("<h1>");
	    	out.print(id +"<br>") ;
	    	out.print(name +" <br>");
	    	out.print(salary +" <br>");
	    	out.print("<h1>");
	    	out.print("</body>");
	    	out.print("</html>");



}
}

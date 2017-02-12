import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  
			{  
			res.setContentType("text/html");  
			PrintWriter out=res.getWriter();  
			  
			//creating ServletContext object  
			ServletContext context=getServletContext();  
			context.setAttribute("Test", "Tester");
			out.println("<HTML>");
			out.println("<HEAD>");
			out.println("<TITLE>Test Servlet</TITLE>");
			out.println("</HEAD>");
			out.println("<BODY>");
			out.println("Servlet web.xml parameters <br></br>");  
			out.println(getServletConfig().getInitParameter("name")+"<br></br>");
			out.println(getServletConfig().getInitParameter("weekday")+"<br></br>");
			out.println(getServletConfig().getInitParameter("age")+"<br></br>");
			out.println(getServletConfig().getInitParameter("test"));
			out.println("</BODY>");
			out.println("</HTML>");
			out.close();  
			  
			}
	public Servlet()  {
		// TODO Auto-generated constructor stub
	}

}

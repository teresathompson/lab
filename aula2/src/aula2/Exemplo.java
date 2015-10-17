package aula2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/exemplo", urlPatterns="{e1, e2}")
@Anotacao(valor = "", value = "")
public class Exemplo extends HttpServlet {

	protected void service(HttpServletRequest request, 
	        HttpServletResponse response) 
	        throws ServletException, IOException {
	    
	    PrintWriter out = response.getWriter();

	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>" + request.getMethod() + "</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<h1>Oi mundo Servlet!</h1>");
	    out.println("</body>");
	    out.println("</html>");
	}
	
}

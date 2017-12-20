package demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ContadorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int count = 0;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/plain");
		PrintWriter out = res.getWriter();
		count++;
		if (count == 1)
			out.println("Se ha accedido una vez a este servlet.");
		else
		out.println("Se ha accedido " + count + " veces a este servlet.");
	}
}

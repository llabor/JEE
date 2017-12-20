package demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException {

		try {
			String user = request.getParameter("un");
			String pass = request.getParameter("pw");

			if (user.equalsIgnoreCase("Foo") && pass.equals("Bar"))
				response.sendRedirect("logged.jsp"); // logged-in page
			else				
				response.sendRedirect("ulogged.jsp"); // error page
		}

		catch (Throwable theException) {
			System.out.println(theException);
		}
	}
}
package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ResourceBundle;
import util.CookieFilter;
import util.HTMLFilter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CookieServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final ResourceBundle RB = ResourceBundle.getBundle("LocalStrings");

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String cookieName = request.getParameter("cookiename");
		String cookieValue = request.getParameter("cookievalue");
		Cookie aCookie = null;
		if (cookieName != null && cookieValue != null) {
				aCookie = new Cookie(cookieName, cookieValue);
				aCookie.setPath(request.getContextPath() + "/");
				response.addCookie(aCookie);
		}

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html><html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\" />");

		String title = RB.getString("cookies.title");
		out.println("<title>" + title + "</title>");
		out.println("</head>");
		out.println("<body bgcolor=\"white\">");

		Cookie[] cookies = request.getCookies();
		if ((cookies != null) && (cookies.length > 0)) {
			HttpSession session = request.getSession(false);
			String sessionId = null;
			if (session != null) {
				sessionId = session.getId();
			}
			out.println(RB.getString("cookies.cookies") + "<br>");
			for (int i = 0; i < cookies.length; i++) {
				Cookie cookie = cookies[i];
				String cName = cookie.getName();
				String cValue = cookie.getValue();
				out.print("Cookie Name: " + HTMLFilter.filter(cName) + "<br>");
				out.println("  Cookie Value: " + HTMLFilter.filter(CookieFilter.filter(cName, cValue, sessionId))
						+ "<br><br>");
			}
		} else {
			out.println(RB.getString("cookies.no-cookies"));
		}

		if (aCookie != null) {
			out.println("<P>");
			out.println(RB.getString("cookies.set") + "<br>");
			out.print(RB.getString("cookies.name") + "  " + HTMLFilter.filter(cookieName) + "<br>");
			out.print(RB.getString("cookies.value") + "  " + HTMLFilter.filter(cookieValue));
		}

		out.println("<P>");
		out.println(RB.getString("cookies.make-cookie") + "<br>");
		out.print("<form action=\"");
		out.println("CookieServlet\" method=POST>");
		out.print(RB.getString("cookies.name") + "  ");
		out.println("<input type=text length=20 name=cookiename><br>");
		out.print(RB.getString("cookies.value") + "  ");
		out.println("<input type=text length=20 name=cookievalue><br>");
		out.println("<input type=submit></form>");

		out.println("</body>");
		out.println("</html>");
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		doGet(request, response);
	}
}

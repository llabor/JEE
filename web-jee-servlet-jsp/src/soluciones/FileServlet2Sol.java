package soluciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FileServlet2
 */
@WebServlet("/FileServlet2Sol")
public class FileServlet2Sol extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileServlet2Sol() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

		String f = "/temp/Demo.txt";
		String f2 = "/temp/Demo2.txt";
		
		BufferedReader br = null;
		PrintWriter ow = response.getWriter();
		PrintWriter pw = null;
		String sCurrentLine;

		try {
			br = new BufferedReader(new FileReader(f));
			pw = new PrintWriter(new FileOutputStream(f2), true);
			while ((sCurrentLine = br.readLine()) != null) {
				pw.println(sCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
					pw.close();
					ow.write("Archivo copiado con éxito...");
			} catch (IOException ex) {
				ow.write("Ha habido un problema...");
				ex.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

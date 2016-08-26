package tutorial.serverlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class PageNotFound
 */
@WebServlet(urlPatterns = { "/" })
public class PageNotFound extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PageNotFound() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletOutputStream notfound = response.getOutputStream();
		
		notfound.println("<html>");
		notfound.println("<head><title>Page not found</title></head>");
		notfound.println("<body>");
		notfound.println("<h3>Sorri! Page not found</h3>");
		notfound.println("<h1>404</h1>");
		notfound.println("<p style=color:red> Mesage from servlet ");
		notfound.println("</body>");
		notfound.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

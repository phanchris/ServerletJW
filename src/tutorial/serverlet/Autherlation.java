package tutorial.serverlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tutorial.model.CheckLogin;

/**
 * Servlet implementation class Autherlation
 */
@WebServlet("/Autherlation")
public class Autherlation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Autherlation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String userpassword=request.getParameter("userpassword");
		CheckLogin check= new CheckLogin();
		if(check.Check(username, userpassword)){			
			RequestDispatcher dispatch = request.getRequestDispatcher("tutorial.views/show.jsp");
			dispatch.forward(request, response);
		}else{			
			response.sendRedirect("login");
		}
	}

}

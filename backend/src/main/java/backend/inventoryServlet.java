package backend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet
public class inventoryServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8861793451913072586L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		System.out.println("Inventory");
		super.doGet(request,response);
		

		
	}
}

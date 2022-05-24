package controllers;

import java.io.IOException;
import beans.RandomBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Randomservlet")
public class RandomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public RandomServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	RandomBean rb =new RandomBean();
	double input = rb.CalculRandom(Double.parseDouble(request.getParameter("t1")));
	request.setAttribute("input", input);
	String page="random.jsp";
	RequestDispatcher dispInf= request.getRequestDispatcher(page);
	dispInf.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}

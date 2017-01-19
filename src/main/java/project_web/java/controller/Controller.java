package project_web.java.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project_web.java.model.Calcularor;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	Calcularor calcularor = new Calcularor();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int a = Integer.parseInt( request.getParameter("first") );
		int b = Integer.parseInt( request.getParameter("second") );
		int res= calcularor.add(a, b);
		String query = a+"+"+b+"="+res;
		List<String> history;
		if(  (history = (List<String>)request.getSession().getAttribute("history")) == null ){
			history = new LinkedList<>();
			request.getSession().setAttribute("history", history);
		}
		history.add(query);
		history = history.stream().filter(String::isEmpty).collect(Collectors.toList());
		request.setAttribute("result", res);
		request.getRequestDispatcher("WEB-INF/result.jspx").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

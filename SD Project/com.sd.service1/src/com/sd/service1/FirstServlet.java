package com.sd.service1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class First
 */
@WebServlet("/First")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String DomainName=(String)request.getParameter("domain");
    	String ServiceName=(String)request.getParameter("servicename");
    	String Description=(String)request.getParameter("desc");
    	
    	//ContentBasedRecommendation.run();
    	String status=ContentBasedRecommendation.BuildInvertedIndex(DomainName, ServiceName,Description);
    	request.setAttribute("Submission",status );
    	if(status=="Successfull submission of the service.")
    	{
    		RequestDispatcher rd = request.getRequestDispatcher("confirmation.jsp");
    		rd.forward(request, response);
    	}
    	
    	else
    	{
    		RequestDispatcher rd = request.getRequestDispatcher("Service.jsp");
    		rd.forward(request, response);
    	}
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
	}

}

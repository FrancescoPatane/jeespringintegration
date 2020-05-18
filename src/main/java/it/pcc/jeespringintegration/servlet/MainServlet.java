package it.pcc.jeespringintegration.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.pcc.jeespringintegration.context.SpringApplicationContext;
import it.pcc.jeespringintegration.service.TestService;



//@WebServlet("/test")
public class MainServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5849983027897469039L;

	private TestService testService;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		this.testService = (TestService) SpringApplicationContext.getBean("testService");
		System.out.println(this.testService.toString());
		resp.setContentType("text/plain");
		resp.getWriter().write(this.testService.getText());
	}




}

package com.ajo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DemoServlet extends HttpServlet {

	private static final long serialVersionUID = -8531930990926384607L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException
	{
		resp.getWriter().write("Hello from DemoServlet");
	}
}

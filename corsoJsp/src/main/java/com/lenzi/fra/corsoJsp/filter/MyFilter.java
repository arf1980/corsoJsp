package com.lenzi.fra.corsoJsp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.lenzi.fra.corsoJsp.beans.Utente;

public class MyFilter implements Filter {
	
	private final static String INDEX_PAGE = "/index.jsp";
	private final static String USER_PAGE = "/myServlet";

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		String messaggio = null;
		
		HttpServletRequest req = (HttpServletRequest) request;
		String basePath = req.getContextPath();
		if (req.getRequestURI().equals(basePath + USER_PAGE)){
			chain.doFilter(request, response);
			return;
		}
		Utente utente =  (Utente) req.getSession().getAttribute("utente");
		if (utente == null){
			RequestDispatcher dispatcher = req.getRequestDispatcher(INDEX_PAGE);
			messaggio = "Utente non loggato";
			req.getSession().setAttribute("messaggio", messaggio);
			dispatcher.forward(request, response);
			chain.doFilter(request, response);
			return;
		}
		
		req.getSession().setAttribute("messaggio", messaggio);
		chain.doFilter(request, response);

		
	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

}

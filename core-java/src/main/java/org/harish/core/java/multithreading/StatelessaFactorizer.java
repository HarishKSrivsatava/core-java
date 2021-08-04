package org.harish.core.java.multithreading;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.math.BigInteger;

public class StatelessaFactorizer implements Servlet{
	public void service(ServletRequest req, ServletResponse resp) {
		BigInteger i = extractFromReq(req);
		BigInteger[] factors = factor(i);
		encodeIntoResponse(resp, factors);
	}

	public void init(ServletConfig config) throws ServletException {
	}

	public ServletConfig getServletConfig() {
		return null;
	}

	public String getServletInfo() {
		return null;
	}

	public void destroy() {
	}
}

package filter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UTF8EncodingFilter implements Filter {

	String encoding = null;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		encoding = filterConfig.getInitParameter("encoding");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		try {
			request.setCharacterEncoding(encoding);
		} catch (UnsupportedEncodingException use) {
			use.printStackTrace();
		} finally {
			try {
				chain.doFilter(request, response);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

}

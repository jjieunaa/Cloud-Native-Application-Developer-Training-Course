package filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter1 implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		Enumeration enumeration = filterConfig.getInitParameterNames();
		while(enumeration.hasMoreElements()) {
			Object nextElement = enumeration.nextElement();
			System.out.println(filterConfig.getInitParameter((String)nextElement));
		}
	}
	
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {				
				System.out.println("MyFilter1-doFilter()");
				arg2.doFilter(arg0, arg1);				
			}

}

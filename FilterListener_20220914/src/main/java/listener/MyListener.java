package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

public class MyListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		String ctxValue = sce.getServletContext().getInitParameter("ctx");
		System.out.println("contextInitialized 호출됨!!! ctx="+ctxValue);
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("contextDestroyed 호출됨!!!");
	}
	
}

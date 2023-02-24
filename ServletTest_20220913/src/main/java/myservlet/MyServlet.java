package myservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/myServlet",
			initParams = {
					@WebInitParam(name="name", value="홍길동"),
					@WebInitParam(name="age", value="30")
			},
			loadOnStartup = 1
)

public class MyServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
	}
	
/*
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println(this.getClass().getName() + "서블릿이 초기화되었습니다~!");
	}
*/
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		System.out.println(this.getClass().getName() + "서블릿의 doGet 메소드가 호출되었습니다~!");
		String paramName = getInitParameter("name");
		String paramAge = getInitParameter("age");
		System.out.println("name 변수값: " + paramName + ", age 변수값: " + paramAge);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(this.getClass().getName() + "서블릿의 doPost 메소드가 호출되었습니다~!");
		req.setCharacterEncoding("utf-8");
		String paramName = req.getParameter("name");
		String paramAge = req.getParameter("age");
		System.out.println("name 변수값: " + paramName + ", age 변수값: " + paramAge);
	}
	
	@Override
	public void destroy() {
		System.out.println(this.getClass().getName() + "서블릿이 소멸되었습니다~!");
	}
}

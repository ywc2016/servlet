package com.buaa.servlet;

//导入必要的包
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//自定义Servlet，继承于HttpServlet
public class UserInfoServlet extends HttpServlet {
	// 重写父类的doGet方法，收到客户端的请求（get方式）时，执行此方法
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/page/userInfo.jsp").forward(
				request, response);
	}
}

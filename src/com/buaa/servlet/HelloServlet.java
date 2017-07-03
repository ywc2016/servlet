package com.buaa.servlet;

//导入必要的包
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//自定义Servlet，继承于HttpServlet
public class HelloServlet extends HttpServlet {
	// 重写父类的doGet方法，收到客户端的请求（get方式）时，执行此方法
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获得输出流，以便向客户端输出内容
		PrintWriter out = response.getWriter();
		// 向客户端输出页面内容
		out.println("<html>");
		out.println("<head>");
		out.println("<title> HelloServlet </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("Hello world!<br>");
		out.println("</body>");
		out.println("</html>");
		out.close(); // 关闭流
	}
}

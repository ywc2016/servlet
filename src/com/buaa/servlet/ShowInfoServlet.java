package com.buaa.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowInfoServlet extends HttpServlet {
	// 重写父类的doPost方法，收到客户端的请求（post方式）时执行此方法
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 设置请求和响应的字符集编码
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter(); // 获得输出流
		// 从请求对象中获得指定参数的值
		String strName = request.getParameter("txtName");
		int age = Integer.parseInt(request.getParameter("txtAge"));
		age++;

		// 向客户端输出页面内容
		out.println("<html><head><title> 显示用户信息 </title></head>");
		out.println("<body>");
		out.println("<h2>您的基本信息如下：</h2>");
		out.println("您好！" + strName + "<br>");
		out.println("明年您是" + age + "岁<br>");
		out.println("</body></html>");

		out.close();
	}
}

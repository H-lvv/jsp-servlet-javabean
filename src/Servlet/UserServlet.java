package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Userdao;

public class UserServlet extends HttpServlet{
	protected void service(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		req.setCharacterEncoding("UTF-8");
		String method=req.getParameter("method");
		if(method.equals("login")){
			login(req,resp);
		}
		
	}

protected void login(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
	req.setCharacterEncoding("UTF-8");
	String username=req.getParameter("username1");
	String password=req.getParameter("password1");
	Userdao userdao=new Userdao();
	int flag=userdao.login(username, password);
	if(flag==1){
		System.out.println("µÇÂ½³É¹¦");
		resp.sendRedirect(req.getContextPath()+"/index.jsp");
	}else{
		System.out.println("µÇÂ¼Ê§°Ü");
		resp.sendRedirect(req.getContextPath()+"/Login.jsp");
	}
}	

}

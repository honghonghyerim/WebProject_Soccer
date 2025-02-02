package com.test.soccer.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/member/logout.do")
public class Logout extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//1. 인증 티켓 제거
		//2. 시작 페이지로 이동
		
		//1.
		HttpSession session = req.getSession();
		
//		session.removeAttribute("id"); //로그아웃
//		session.removeAttribute("name");
		
		session.invalidate();
		
		//2.
		resp.sendRedirect("/soccer/main.do");
		
	}
	
}

package servlet;

import entity.Captcha;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TestServlet")
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Captcha captcha = (Captcha) getServletContext().getAttribute("captcha");

        PrintWriter w = response.getWriter();
        w.println("<html>");
        w.println("<img src=\"" + captcha.getFileWay() + "\" width=\"200\" height=\"50\" alt=\"sho\">");
        w.println("<html>");
    }
}

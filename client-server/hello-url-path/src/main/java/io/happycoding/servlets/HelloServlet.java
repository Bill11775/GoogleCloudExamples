package io.happycoding.servlets;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello/*")
public class HelloServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // name is whatever comes after /hello/
    String name = request.getRequestURI().substring("/hello/".length());

    response.setContentType("text/html;");
    response.getWriter().println("<h1>Hello " + name + "!</h1>");
  }
}


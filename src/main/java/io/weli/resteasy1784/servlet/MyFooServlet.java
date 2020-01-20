package io.weli.resteasy1784.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// https://dzone.com/articles/getting-started-servlet-3
@WebServlet("/hello")
public class MyFooServlet extends HttpServlet {

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
      PrintWriter writer = resp.getWriter();
      writer.println("<!DOCTYPE html>");
      writer.println("<html>");
      writer.println("<body>");
      writer.println("<p>Hello World!</p>");
      writer.println("</body>");
      writer.println("</html>");
   }

}

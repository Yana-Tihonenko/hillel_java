package servlets;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static service.FindWordFromFile.findWordToURL;

//@WebServlet("/view/findword.jsp")
public class FindWordEnteredByUser extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletContext servletContext = req.getServletContext();
        String path = (servletContext.getRealPath("/file.txt"));
        int count = findWordToURL(path, req.getParameter("findword"));
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<h1>Result find: " + count + "</h1>");
        out.close();
    }
}

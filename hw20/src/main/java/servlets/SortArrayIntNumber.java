package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import static service.SortIntNumber.sortArrayIntNumber;
@WebServlet("/SortArrayIntNumber")

public class SortArrayIntNumber extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String resultsort = sortArrayIntNumber(req.getParameter("sortnumber"));
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<h1>Result sort: " + resultsort + "</h1>");
        out.close();
    }

}





package servlet;

import model.Actor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import static service.DBManager.actorMoreCountNToFilms;
import static service.DBManager.deleteFilmToYear;

@WebServlet("/DeleteFilmToYear")
public class DeleteFilmToYear extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer year = Integer.parseInt(request.getParameter("year"));
        boolean resultdelete = deleteFilmToYear(year);
        if (resultdelete == true) {
            request.setAttribute("resultdelete", "Operation was successful");
        } else
            request.setAttribute("resultdelete", "Not find films for delete");

        request.getRequestDispatcher("/view/deleteFilmResult.jsp").forward(request, response);
    }
}



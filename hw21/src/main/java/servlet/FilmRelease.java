package servlet;

import model.Film;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static service.DBManager.filmOneTwoReleaseLate;

@WebServlet("/FilmRelease")
public class FilmRelease extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Film> filmOneTwoReleaseLate = filmOneTwoReleaseLate();
        request.setAttribute("listfilm", filmOneTwoReleaseLate);
        request.getRequestDispatcher("/view/filmRelease.jsp").forward(request, response);
    }
}

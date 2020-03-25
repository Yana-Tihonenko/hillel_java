package servlet;

import model.Actor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static service.DBManager.actorMoreCountNToFilms;
import static service.DBManager.actorToFilm;

@WebServlet("/ActorToCountFilm")
public class ActorToCountFilm extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer countFilms = Integer.parseInt(request.getParameter("countFilms"));
        List<Actor> actorsList = actorMoreCountNToFilms(countFilms);
        request.setAttribute("actorsList", actorsList);
        request.getRequestDispatcher("/view/actorToFilmResult.jsp").forward(request, response);
    }


}

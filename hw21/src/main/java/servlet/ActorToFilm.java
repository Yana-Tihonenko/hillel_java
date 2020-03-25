package servlet;

import model.Actor;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static service.DBManager.actorToFilm;

@WebServlet("/ActorToFilm")
public class ActorToFilm extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer idFilm = Integer.parseInt(request.getParameter("actorToFilm"));
        List<Actor> actorsList = actorToFilm(idFilm);
        request.setAttribute("actorsList", actorsList);
        request.getRequestDispatcher("/view/actorToFilmResult.jsp").forward(request, response);
    }
}

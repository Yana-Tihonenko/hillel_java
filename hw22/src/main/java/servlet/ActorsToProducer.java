package servlet;

import model.Actor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static service.DBManager.actorToBeProducer;
import static service.DBManager.actorToFilm;

@WebServlet("/ActorsToProducer")
public class ActorsToProducer extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Actor> actorsToProducer = actorToBeProducer();
        request.setAttribute("actorsList", actorsToProducer);
        request.getRequestDispatcher("/view/actorToFilmResult.jsp").forward(request, response);
    }
}

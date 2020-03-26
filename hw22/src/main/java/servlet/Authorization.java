package servlet;

import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import static service.DBManager.finduser;

@WebServlet("/Authorization")
public class Authorization extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        User user = finduser(name);
        if (user != null && user.getPassword().equals(password)) {
            request.getSession().setAttribute("user", user);
            request.setAttribute("message","Authorization is successfully");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } else {
            request.setAttribute("error", "Authorization is unsuccessfully");
            request.getRequestDispatcher("/view/authorization.jsp").forward(request, response);
        }
    }


}

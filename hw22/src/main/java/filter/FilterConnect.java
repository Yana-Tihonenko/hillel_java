package filter;

import model.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/DeleteFilmToYear")
public class FilterConnect implements Filter {

    public void destroy() {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        if (req.getMethod().equals("POST")) {
            HttpSession session = req.getSession();
            User user = (User) session.getAttribute("user");
            if (user != null) {
                chain.doFilter(request, response);
            } else {
                request.setAttribute("message", "You are not authorized");
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }
        } else {
            chain.doFilter(request, response);
        }
    }

    public void init(FilterConfig config) throws ServletException {
    }

}

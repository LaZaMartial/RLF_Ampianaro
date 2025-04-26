package class_diagram_orm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Invalider la session
        HttpSession session = request.getSession(false); // Prend la session SANS en créer une nouvelle
        if (session != null) {
            session.invalidate();
        }

        // Rediriger vers login.jsp
        response.sendRedirect("Login.jsp");
    }
}
package class_diagram_orm;

import class_diagram_orm.Utilisateur;
import org.orm.PersistentException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String motDePasse = request.getParameter("motdepasse");

        try {
            List<Utilisateur> utilisateurs = Utilisateur.queryUtilisateur(null, null);
            boolean authenticated = false;
            Utilisateur currentUser = null;

            for (Utilisateur u : utilisateurs) {
                if (u.getEmail().equals(email) && u.getMotDePasse().equals(motDePasse)) {
                    authenticated = true;
                    currentUser = u;
                    break;
                }
            }

            if (authenticated) {
                HttpSession session = request.getSession();
                session.setAttribute("user", currentUser);

                if (currentUser instanceof Administrateur) {
                    response.sendRedirect("ProjetEducatifApprovalList.jsp");  // page pour l'admin
                } else if (currentUser instanceof Donateur) {
                    response.sendRedirect("DonList.jsp");  // page pour le donateur
                } else if (currentUser instanceof Eleve) {
                    response.sendRedirect("ProjetEducatifList.jsp");  // page pour l'élève
                } else {
                    // Au cas où c'est un utilisateur inconnu (très rare)
                    response.sendRedirect("Login.jsp");
                }
            } else {
                // Retourner sur la page de login avec un message
                request.setAttribute("errorMessage", "Email ou mot de passe incorrect");
                request.getRequestDispatcher("Login.jsp").forward(request, response);
            }

        } catch (PersistentException e) {
            e.printStackTrace();
            throw new ServletException("Erreur d'accès à la base de données");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // On redirige vers le formulaire login si quelqu'un fait GET
        request.getRequestDispatcher("Login.jsp").forward(request, response);
    }
}

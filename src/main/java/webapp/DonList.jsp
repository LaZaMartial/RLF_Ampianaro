<%@ page import="class_diagram_orm.Don, class_diagram_orm.Donateur, class_diagram_orm.ProjetEducatif" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Don List</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-50 min-h-screen py-6">

    <div class="flex justify-end mb-6 mr-3">
        <a href="logout" class="text-red-500 hover:underline font-semibold">Deconnexion</a>
      </div>

    <div class="max-w-2xl mx-auto p-6 bg-white rounded-2xl shadow-md">

        <h1 class="text-2xl font-bold text-center mb-6">Liste des Dons</h1>

        <%
            int projetID = -1;
            String projetIDParam = request.getParameter("ID");
            if (projetIDParam != null && !projetIDParam.isEmpty()) {
                try {
                    projetID = Integer.parseInt(projetIDParam);
                } catch (NumberFormatException e) {
                    out.println("<p class='text-red-500'>ID de projet invalide.</p>");
                }
            }
        %>

        <table class="min-w-full table-auto border border-gray-300 mb-6">
            <thead>
                <tr class="bg-gray-100">
                    <th class="px-4 py-2 border">ID</th>
                    <th class="px-4 py-2 border">Montant</th>
                    <th class="px-4 py-2 border">Date d'envoi</th>
                    <th class="px-4 py-2 border">Donateur</th>
                </tr>
            </thead>
            <tbody>
                <%
                    Don[] dons = Don.listDonByQuery(null, null);
                    for (int i = 0; i < dons.length; i++) {
                        ProjetEducatif projet = dons[i].getProjetEducatif();
                        if (projet == null || projet.getORMID() != projetID) {
                            continue;
                        }

                        Donateur donateur = dons[i].getDonateur();
                %>
                <tr class="hover:bg-gray-50">
                    <td class="px-4 py-2 border"><%= dons[i].getORMID() %></td>
                    <td class="px-4 py-2 border"><%= dons[i].getMontant() %></td>
                    <td class="px-4 py-2 border"><%= dons[i].getDateEnvoi() %></td>
                    <td class="px-4 py-2 border">
                        <% if (donateur != null) { %>
                            <a href="DonateurView.jsp?action=search&ID=<%= donateur.getORMID() %>" class="text-blue-600 hover:underline">
                                <%= donateur.getNom() %>
                            </a>
                        <% } else { %>
                            -
                        <% } %>
                    </td>
                </tr>
                <% } %>
            </tbody>
        </table>

        <div class="flex justify-center">
        </div>
    </div>
</body>
</html>

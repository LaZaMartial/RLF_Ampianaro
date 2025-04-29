<%@ page import="class_diagram_orm.Utilisateur" %>
<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <title>Liste des Projets Educatifs</title>
  <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100 min-h-screen p-6">

<%
  Utilisateur user = (Utilisateur) session.getAttribute("user");
%>

<div class="flex justify-end mb-6">
  <a href="logout" class="text-red-500 hover:underline font-semibold">Deconnexion</a>
</div>

<div class="max-w-7xl mx-auto bg-white shadow-md rounded-lg p-8">
  <h1 class="text-2xl font-bold text-center mb-8 text-gray-800">Liste des Projets Educatifs</h1>

  <div class="overflow-x-auto">
    <table class="w-full table-auto border-collapse border border-gray-300">
      <thead class="bg-gray-200">
        <tr>
          <th class="border border-gray-300 px-4 py-2">ID</th>
          <th class="border border-gray-300 px-4 py-2">Titre</th>
          <th class="border border-gray-300 px-4 py-2">Description</th>
          <th class="border border-gray-300 px-4 py-2">Montant Objectif</th>
          <th class="border border-gray-300 px-4 py-2">Montant Collecte</th>
          <th class="border border-gray-300 px-4 py-2">Status</th>
          <th class="border border-gray-300 px-4 py-2">Date de Creation</th>
          <th class="border border-gray-300 px-4 py-2">Voir Don</th>
          <th class="border border-gray-300 px-4 py-2">Actions</th>
        </tr>
      </thead>
      <tbody>
<%
  class_diagram_orm.ProjetEducatif[] projetEducatifs = class_diagram_orm.ProjetEducatif.listProjetEducatifByQuery(null, null);
  for (int i = 0; i < projetEducatifs.length; i++) {
      if (projetEducatifs[i].getEleve() == null || projetEducatifs[i].getEleve().getORMID() != user.getORMID()) {
          continue;
      }
%>
        <tr class="text-center">
          <td class="border border-gray-300 px-4 py-2"><%= projetEducatifs[i].getORMID() %></td>
          <td class="border border-gray-300 px-4 py-2"><%= projetEducatifs[i].getTitre() %></td>
          <td class="border border-gray-300 px-4 py-2"><%= projetEducatifs[i].getDescription() %></td>
          <td class="border border-gray-300 px-4 py-2"><%= projetEducatifs[i].getMontantObjectif() %></td>
          <td class="border border-gray-300 px-4 py-2"><%= projetEducatifs[i].getMontantCollecte() %></td>
          <td class="border border-gray-300 px-4 py-2"><%= projetEducatifs[i].getStatus() %></td>
          <td class="border border-gray-300 px-4 py-2"><%= projetEducatifs[i].getDateCreation() %></td>
          <td class="border border-gray-300 px-4 py-2">
            <a href="DonList.jsp?ID=<%= projetEducatifs[i].getORMID() %>"
               class="text-blue-500 hover:underline font-semibold">
              Voir Don
            </a>
          </td>
          <td class="border border-gray-300 px-4 py-2">
            <a href="ProjetEducatifEdit.jsp?action=search&ID=<%= projetEducatifs[i].getORMID() %>"
               class="text-blue-500 hover:underline font-semibold">
              Modifier
            </a>
          </td>
        </tr>
<%
  }
%>
      </tbody>
    </table>
  </div>

  <div class="flex justify-center mt-8">
    <a href="ProjetEducatif.jsp" class="bg-green-500 hover:bg-green-600 text-white font-semibold py-2 px-6 rounded-lg">
      Ajouter un Projet
    </a>
  </div>
</div>

</body>
</html>

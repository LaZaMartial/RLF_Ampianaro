<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>ProjetEducatif List</title>
  <!-- Intégration de Tailwind CSS -->
  <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100 min-h-screen p-6">

  <div class="flex justify-end mb-6">
    <a href="logout" class="text-red-500 hover:underline font-semibold">Deconnexion</a>
  </div>

  <div class="max-w-7xl mx-auto bg-white shadow-md rounded-lg p-8">
    <h1 class="text-3xl font-bold text-center text-gray-800 mb-8">Liste des Projets Educatifs En Cours</h1>

    <div class="overflow-x-auto">
      <table class="min-w-full table-auto border-collapse">
        <thead>
          <tr class="bg-gray-200">
            <th class="border px-4 py-2">ID</th>
            <th class="border px-4 py-2">Titre</th>
            <th class="border px-4 py-2">Description</th>
            <th class="border px-4 py-2">Montant Objectif</th>
            <th class="border px-4 py-2">Montant Collecte</th>
            <th class="border px-4 py-2">Date de Creation</th>
            <th class="border px-4 py-2">Eleve</th>
            <th class="border px-4 py-2">Action</th>
          </tr>
        </thead>
        <tbody class="bg-gray-50 text-center">
          <%
          class_diagram_orm.ProjetEducatif[] projetEducatifs = class_diagram_orm.ProjetEducatif.listProjetEducatifByQuery(null, null);
          for(int i = 0; i < projetEducatifs.length; i++) {
              if (!"En cours".equalsIgnoreCase(projetEducatifs[i].getStatus())) {
                  continue; // Sauter les projets non "En cours"
              }
          %>
            <tr class="hover:bg-gray-100">
              <td class="border px-4 py-2"><%= projetEducatifs[i].getORMID() %></td>
              <td class="border px-4 py-2"><%= projetEducatifs[i].getTitre() %></td>
              <td class="border px-4 py-2"><%= projetEducatifs[i].getDescription() %></td>
              <td class="border px-4 py-2"><%= projetEducatifs[i].getMontantObjectif() %></td>
              <td class="border px-4 py-2"><%= projetEducatifs[i].getMontantCollecte() %></td>
              <td class="border px-4 py-2"><%= projetEducatifs[i].getDateCreation() %></td>
              <td class="border px-4 py-2">
                <%
                  class_diagram_orm.Eleve eleve = projetEducatifs[i].getEleve();
                  if (eleve != null) {
                %>
                  <a href="EleveView.jsp?action=search&ID=<%= eleve.getORMID() %>" class="text-indigo-600 hover:underline">
                    <%= eleve.getNom() %>
                  </a>
                <% } else { %>
                  -
                <% } %>
              </td>
              <td class="border px-4 py-2">
                <a href="ProjetEducatifDon.jsp?ID=<%= projetEducatifs[i].getORMID() %>"  class="text-indigo-500 hover:underline font-semibold">
                  Don
                </a>
              </td>
            </tr>
          <% } %>
        </tbody>
      </table>
    </div>

    <div class="flex justify-center mt-8">
      <a href="Don.jsp" class="bg-green-500 hover:bg-green-600 text-white font-semibold py-2 px-6 rounded-lg">
        Ajouter un Don
      </a>
    </div>
  </div>

</body>
</html>

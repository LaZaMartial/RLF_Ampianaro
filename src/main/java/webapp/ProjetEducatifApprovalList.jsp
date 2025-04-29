<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Liste des Projets Educatifs</title>
  <!-- Intégration de Tailwind CSS -->
  <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100 min-h-screen p-6">

  <div class="flex justify-end mb-6">
    <a href="logout" class="text-red-500 hover:underline font-semibold">Deconnexion</a>
  </div>

  <div class="max-w-7xl mx-auto bg-white shadow-md rounded-lg p-8">
    <h1 class="text-3xl font-bold text-center text-gray-800 mb-8">Liste des Projets Educatifs</h1>

    <div class="overflow-x-auto">
      <table class="min-w-full table-auto border-collapse">
        <thead>
          <tr class="bg-gray-200">
            <th class="border px-4 py-2">ID</th>
            <th class="border px-4 py-2">Titre</th>
            <th class="border px-4 py-2">Description</th>
            <th class="border px-4 py-2">Montant Objectif</th>
            <th class="border px-4 py-2">Montant Collecte</th>
            <th class="border px-4 py-2">Status</th>
            <th class="border px-4 py-2">Date Creation</th>
            <th class="border px-4 py-2">Eleve</th>
            <th class="border px-4 py-2">Actions</th>
          </tr>
        </thead>
        <tbody class="bg-gray-50 text-center">
          <%
          class_diagram_orm.ProjetEducatif[] projetEducatifs = class_diagram_orm.ProjetEducatif.listProjetEducatifByQuery(null, null);
          for (int i = 0; i < projetEducatifs.length; i++) {
              out.print("<tr class='hover:bg-gray-100'>");
              out.print("<td class='border px-4 py-2'>");
              out.print(projetEducatifs[i].getORMID());
              out.print("</td>");
              out.print("<td class='border px-4 py-2'>");
              out.print(projetEducatifs[i].getTitre());
              out.println("</td>");
              out.print("<td class='border px-4 py-2'>");
              out.print(projetEducatifs[i].getDescription());
              out.println("</td>");
              out.print("<td class='border px-4 py-2'>");
              out.print(projetEducatifs[i].getMontantObjectif());
              out.println("</td>");
              out.print("<td class='border px-4 py-2'>");
              out.print(projetEducatifs[i].getMontantCollecte());
              out.println("</td>");
              out.print("<td class='border px-4 py-2'>");
              out.print(projetEducatifs[i].getStatus());
              out.println("</td>");
              out.print("<td class='border px-4 py-2'>");
              out.print(projetEducatifs[i].getDateCreation());
              out.println("</td>");

              class_diagram_orm.Eleve eleve = projetEducatifs[i].getEleve();
              if (eleve != null) {
                  out.print("<td class='border px-4 py-2'>");
                  out.print("<a href='EleveView.jsp?action=search&ID=");
                  out.print(eleve.getORMID());
                  out.print("' class='text-indigo-600 hover:underline'>");
                  out.print(eleve.getNom());
                  out.print("</a>");
                  out.println("</td>");
              } else {
                  out.println("<td class='border px-4 py-2'></td>");
              }

              out.print("<td class='border px-4 py-2'>");
              out.print("<a href='ProjetEducatifApproval.jsp?action=search&ID=");
              out.print(projetEducatifs[i].getORMID());
              out.print("' class='text-indigo-500 hover:underline font-semibold'>");
              out.print("Statut");
              out.print("</a>");
              out.println("</td>");
              out.println("</tr>");
          }
          %>
        </tbody>
      </table>
    </div>

    <div class="flex justify-center mt-8">
      <a href="EleveList.jsp" class="bg-green-500 hover:bg-green-600 text-white font-semibold py-2 px-6 rounded-lg mr-4">
        Liste des Eleves
      </a>
      <a href="DonateurList.jsp" class="bg-green-500 hover:bg-green-600 text-white font-semibold py-2 px-6 rounded-lg">
        Liste des Donateurs
      </a>
    </div>
  </div>

</body>
</html>

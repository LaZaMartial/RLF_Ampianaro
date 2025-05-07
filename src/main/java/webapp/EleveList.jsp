<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Liste des Élèves</title>
  <!-- Intégration de Tailwind CSS -->
  <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100 min-h-screen p-6">

  <div class="flex justify-end mb-6">
    <a href="logout" class="text-red-500 hover:underline font-semibold">Deconnexion</a>
  </div>

  <div class="max-w-7xl mx-auto bg-white shadow-md rounded-lg p-8">
    <h1 class="text-3xl font-bold text-center text-gray-800 mb-8">Liste des Eleves</h1>

    <div class="overflow-x-auto">
      <table class="min-w-full table-auto border-collapse">
        <thead>
          <tr class="bg-gray-200">
            <th class="border px-4 py-2">Nom</th>
            <th class="border px-4 py-2">Biographie</th>
            <th class="border px-4 py-2">Niveau Scolaire</th>
            <th class="border px-4 py-2">Date Naissance</th>
            <th class="border px-4 py-2">Email</th>
            <th class="border px-4 py-2">Actions</th>
          </tr>
        </thead>
        <tbody class="bg-gray-50 text-center">
          <%
          class_diagram_orm.Eleve[] eleves = class_diagram_orm.Eleve.listEleveByQuery(null, null);
          for (int i = 0; i < eleves.length; i++) {
              out.print("<tr class='hover:bg-gray-100'>");
              out.print("<td class='border px-4 py-2'>");
              out.print(eleves[i].getNom());
              out.println("</td>");
              out.print("<td class='border px-4 py-2'>");
              out.print(eleves[i].getBiographie());
              out.println("</td>");
              out.print("<td class='border px-4 py-2'>");
              out.print(eleves[i].getNiveauScolaire());
              out.println("</td>");
              out.print("<td class='border px-4 py-2'>");
              out.print(eleves[i].getDateNaissance());
              out.println("</td>");
              out.print("<td class='border px-4 py-2'>");
              out.print(eleves[i].getEmail());
              out.println("</td>");
              out.print("<td class='border px-4 py-2'>");
              out.print("<a href='EleveEdit.jsp?action=search&ID=");
              out.print(eleves[i].getORMID());
              out.print("'  class='text-red-500 hover:underline font-semibold'>");
              out.print("Supprimer");
              out.print("</a>");
              out.println("</td>");
              out.println("</tr>");
          }
          %>
        </tbody>
      </table>
    </div>

    <div class="flex justify-center mt-8">
    </div>
  </div>

</body>
</html>

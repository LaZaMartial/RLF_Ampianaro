<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <title>Liste des Donateurs</title>
  <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100 min-h-screen p-6">

  <div class="flex justify-end mb-6">
    <a href="logout" class="text-red-500 hover:underline font-semibold">Deconnexion</a>
  </div>

  <div class="max-w-4xl mx-auto bg-white shadow-md rounded-lg p-8">
    <h1 class="text-2xl font-bold text-center mb-8 text-gray-800">Liste des Donateurs</h1>

    <div class="overflow-x-auto">
      <table class="min-w-full bg-white border border-gray-300">
        <thead>
          <tr class="bg-gray-200 text-gray-700">
            <th class="py-3 px-4 border">Nom</th>
            <th class="py-3 px-4 border">Email</th>
            <th class="py-3 px-4 border">Action</th>
          </tr>
        </thead>
        <tbody>
          <%
            class_diagram_orm.Donateur[] donateurs = class_diagram_orm.Donateur.listDonateurByQuery(null, null);
            for (int i = 0; i < donateurs.length; i++) {
          %>
          <tr class="text-center hover:bg-gray-50">
            <td class="py-2 px-4 border"><%= donateurs[i].getNom() %></td>
            <td class="py-2 px-4 border"><%= donateurs[i].getEmail() %></td>
            <td class="py-2 px-4 border">
              <a href="DonateurEdit.jsp?action=search&ID=<%= donateurs[i].getORMID() %>" class="text-red-500 hover:underline font-semibold">Supprimer</a>
            </td>
          </tr>
          <% } %>
        </tbody>
      </table>
    </div>
  </div>

</body>
</html>

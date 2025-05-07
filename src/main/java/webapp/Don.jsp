<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <title>Don</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- Tailwind CSS CDN -->
  <script src="https://cdn.tailwindcss.com"></script>

  <script type="text/javascript">
    function perform(command) {
      document.form1.action.value = command;
      document.form1.submit();
      return true;
    }
    function listAll() {
      window.location.href = 'ProjetEducatifDonList.jsp';
      return true;
    }
  </script>
</head>

<body class="bg-[url(./assets/bg.png)] bg-cover bg-no-repeat bg-center bg-fixed h-screen">

  <div class="flex justify-end m-6">
    <a href="logout" class="text-red-500 hover:underline font-semibold">Deconnexion</a>
  </div>

  <div class="max-w-2xl mx-auto bg-white p-8 shadow-md rounded-lg">
    <h1 class="text-3xl font-bold text-center text-gray-800 mb-8">Faire un Don</h1>

    <jsp:useBean id="DonBean" scope="page" class="class_diagram_orm.DonProcessor" />
    <jsp:setProperty name="DonBean" property="*" />
    <%
      String result = DonBean.process(request, response);
      java.util.List<class_diagram_orm.ProjetEducatif> projets = null;
      try {
        projets = class_diagram_orm.ProjetEducatif.queryProjetEducatif(null, null);
      } catch (Exception e) {
        e.printStackTrace();
      }

      if("insert".equals(request.getParameter("action")) && result.contains("Don insere")) {
          response.sendRedirect("ProjetEducatifDonList.jsp");
          return;
        }
    %>

    <form method="POST" name="form1" action="Don.jsp" class="space-y-6">

      <div>
        <label class="block text-gray-700 font-semibold mb-2" for="montant">Montant :</label>
        <input
          type="text"
          id="montant"
          name="montant"
          value="<jsp:getProperty name='DonBean' property='montant'/>"
          class="w-full border border-gray-300 px-4 py-2 rounded-lg focus:outline-none focus:ring-2 focus:ring-[#c38c9b]"
          required
        />
      </div>

      <div>
        <label class="block text-gray-700 font-semibold mb-2" for="projetEducatif_projetEducatifID">Projet Educatif :</label>
        <select
          id="projetEducatif_projetEducatifID"
          name="projetEducatif_projetEducatifID"
          class="w-full border border-gray-300 px-4 py-2 rounded-lg focus:outline-none focus:ring-2 focus:ring-[#c38c9b]"
          required
        >
          <option value="">-- Choisir un projet --</option>
          <% if (projets != null) {
               for (class_diagram_orm.ProjetEducatif projet : projets) { %>
                 <option value="<%= projet.getORMID() %>"><%= projet.getTitre() %></option>
          <%   }
             }
          %>
        </select>
      </div>

      <input type="hidden" name="action" value="">

      <div class="flex justify-center gap-4 pt-6">
        <button
          type="button"
          onclick="return listAll();"
          class="bg-[#c38c9b] hover:bg-[#d4afb9] text-white font-semibold py-2 px-6 rounded"
        >
          Liste Projet
        </button>

        <button
          type="button"
          onclick="return perform('insert');"
          class="bg-[#7AA88D] hover:bg-[#AFD4B9] text-white font-semibold py-2 px-6 rounded"
        >
          Inserer
        </button>
      </div>
    </form>

    <hr class="my-8">

    <div class="text-center">
      <h3 class="text-xl font-semibold text-gray-700 mb-4">Resultat :</h3>
      <p class="text-gray-600"><%= result %></p>
    </div>
  </div>

</body>
</html>

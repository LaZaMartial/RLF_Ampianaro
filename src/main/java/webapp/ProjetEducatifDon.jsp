<!DOCTYPE html>
<html lang="fr">

  <!-- JSP Bean -->
  <jsp:useBean id="DonBean" scope="page" class="class_diagram_orm.DonProcessor" />
  <jsp:setProperty name="DonBean" property="*" />
  <%
    String result = DonBean.process(request, response);
    String projetID = request.getParameter("ID");

      if("insert".equals(request.getParameter("action")) && result.contains("Don insere")) {
          response.sendRedirect("ProjetEducatifDonList.jsp");
          return;
        }
  %>
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

<body class="bg-gray-100 min-h-screen p-6">

  <div class="flex justify-end mb-6">
    <a href="logout" class="text-red-500 hover:underline font-semibold">Deconnexion</a>
  </div>

  <div class="max-w-2xl mx-auto bg-white p-8 shadow-md rounded-lg">
    <h1 class="text-3xl font-bold text-center text-gray-800 mb-8">Faire un Don</h1>

    <form method="POST" name="form1" action="ProjetEducatifDon.jsp" class="space-y-6">
      <div>
        <label class="block text-gray-700 font-semibold mb-2">Montant :</label>
        <input
          type="text"
          name="montant"
          value="<jsp:getProperty name='DonBean' property='montant'/>"
          class="w-full border border-gray-300 px-4 py-2 rounded-lg focus:outline-none focus:ring-2 focus:ring-[#c38c9b]"
          required
        />
      </div>

      <div>
        <label class="block text-gray-700 font-semibold mb-2">Projet Educatif :</label>
        <input
          type="text"
          name="projetEducatif_projetEducatifID"
          value="<%= projetID %>"
          readonly
          class="w-full bg-gray-100 border border-gray-300 rounded-lg focus:outline-none px-4 py-2 cursor-not-allowed"
        />
      </div>

      <input type="hidden" name="action" value="">

      <div class="flex justify-center gap-4 pt-6">
        <button
          type="button"
          onclick="return listAll();"
          class="bg-[#c38c9b] hover:bg-[#d4afb9] text-white font-semibold py-2 px-6 rounded"
        >
          Voir Tout
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

<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <title>Ajouter Projet Educatif</title>
  <script src="https://cdn.tailwindcss.com"></script>
  <script language="javascript">
    function perform(command) {
      form1.action.value = command;
      form1.submit();
      return true;
    }
    function listAll() {
      window.location.href = 'ProjetEducatifList.jsp';
      return true;
    }
  </script>
</head>
<body class="bg-gray-100 min-h-screen p-6">

<jsp:useBean id="ProjetEducatifBean" scope="page" class="class_diagram_orm.ProjetEducatifProcessor" />
<jsp:setProperty name="ProjetEducatifBean" property="*" />
<% String result = ProjetEducatifBean.process(request, response);

    if("insert".equals(request.getParameter("action")) && result.contains("Projet insere")) {
          response.sendRedirect("ProjetEducatifList.jsp");
          return;
      }
 %>

<div class="flex justify-end mb-6">
  <a href="logout" class="text-red-500 hover:underline font-semibold">Deconnexion</a>
</div>

<div class="max-w-2xl mx-auto bg-white shadow-md rounded-lg p-8">
  <h1 class="text-2xl font-bold text-center mb-8 text-gray-800">Projet Educatif</h1>

  <form method="POST" name="form1" action="ProjetEducatif.jsp" class="space-y-6">
    <div>
      <label class="block font-semibold mb-2">Titre :</label>
      <input type="text" name="titre" value="<jsp:getProperty name='ProjetEducatifBean' property='titre'/>"
             class="w-full border border-gray-300 px-4 py-2 rounded-lg focus:outline-none focus:ring-2 focus:ring-[#c38c9b]" />
    </div>

    <div>
      <label class="block font-semibold mb-2">Description :</label>
      <input type="text" name="description" value="<jsp:getProperty name='ProjetEducatifBean' property='description'/>"
             class="w-full border border-gray-300 px-4 py-2 rounded-lg focus:outline-none focus:ring-2 focus:ring-[#c38c9b]" />
    </div>

    <div>
      <label class="block font-semibold mb-2">Montant Objectif :</label>
      <input type="text" name="montantObjectif" value="<jsp:getProperty name='ProjetEducatifBean' property='montantObjectif'/>"
             class="w-full border border-gray-300 px-4 py-2 rounded-lg focus:outline-none focus:ring-2 focus:ring-[#c38c9b]" />
    </div>

    <input type="hidden" name="action" value="">

    <hr class="my-6">

    <div class="flex justify-center gap-4">
      <button type="button" onclick="return listAll();"
              class="bg-[#c38c9b] hover:bg-[#d4afb9] text-white font-semibold py-2 px-6 rounded-lg">
        Liste Projets
      </button>
      <button type="button" onclick="return perform('insert');"
              class="bg-[#7AA88D] hover:bg-[#AFD4B9] text-white font-semibold py-2 px-6 rounded-lg">
        Ajouter
      </button>
    </div>
  </form>

  <hr class="my-6">

  <h3 class="text-center font-bold text-lg text-gray-700">Resultat :</h3>
  <p class="text-center text-gray-600"><%= result %></p>
</div>

</body>
</html>

<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Projet Educatif Approval</title>
  <script src="https://cdn.tailwindcss.com"></script>
</head>

<jsp:useBean id="ProjetEducatifBean" scope="page" class="class_diagram_orm.ProjetEducatifProcessor" />
<jsp:setProperty name="ProjetEducatifBean" property="*" />
<% String result = ProjetEducatifBean.process(request, response);

    if("update".equals(request.getParameter("action")) && result.contains("Projet modifie")) {
      response.sendRedirect("ProjetEducatifApprovalList.jsp");
      return;
    }
%>

<script>
function perform(command) {
  form1.action.value = command;
  form1.submit();
  return true;
}
function listAll() {
  window.location.href = 'ProjetEducatifApprovalList.jsp';
  return true;
}
</script>

<body class="bg-[url(./assets/bg.png)] bg-cover bg-no-repeat bg-center bg-fixed h-screen">

  <div class="flex justify-end m-6">
    <a href="logout" class="text-red-500 hover:underline font-semibold">Deconnexion</a>
  </div>

  <div class="max-w-3xl mx-auto bg-white shadow-md rounded-lg p-8">
    <h1 class="text-3xl font-bold text-center text-gray-800 mb-8">Approve Projet Educatif</h1>

    <form method="POST" name="form1" action="ProjetEducatifApproval.jsp" class="space-y-6">

      <div>
        <label class="block text-gray-700 font-semibold mb-2" for="ID">ID :</label>
        <input type="text" id="ID" name="ID" value="<jsp:getProperty name='ProjetEducatifBean' property='ID'/>" readonly
          class="w-full bg-gray-100 border border-gray-300 rounded px-4 py-2 focus:outline-none cursor-not-allowed" />
      </div>

      <div>
        <label class="block text-gray-700 font-semibold mb-2" for="titre">Titre :</label>
        <input type="text" id="titre" name="titre" value="<jsp:getProperty name='ProjetEducatifBean' property='titre'/>" readonly
          class="w-full bg-gray-100 border border-gray-300 rounded px-4 py-2 focus:outline-none cursor-not-allowed" />
      </div>

      <div>
        <label class="block text-gray-700 font-semibold mb-2" for="description">Description :</label>
        <input type="text" id="description" name="description" value="<jsp:getProperty name='ProjetEducatifBean' property='description'/>" readonly
          class="w-full bg-gray-100 border border-gray-300 rounded px-4 py-2 focus:outline-none cursor-not-allowed" />
      </div>

      <div>
        <label class="block text-gray-700 font-semibold mb-2" for="montantObjectif">Montant Objectif :</label>
        <input type="text" id="montantObjectif" name="montantObjectif" value="<jsp:getProperty name='ProjetEducatifBean' property='montantObjectif'/>" readonly
          class="w-full bg-gray-100 border border-gray-300 rounded px-4 py-2 focus:outline-none cursor-not-allowed" />
      </div>

      <div>
        <label class="block text-gray-700 font-semibold mb-2" for="status">Status :</label>
        <select name="status" id="status" class="w-full border border-gray-300 rounded px-4 py-2 focus:outline-none focus:ring-2 focus:ring-[#c38c9b]">
          <option value="En attente" <%= "En attente".equals(ProjetEducatifBean.getStatus()) ? "selected" : "" %>>En attente</option>
          <option value="En cours" <%= "En cours".equals(ProjetEducatifBean.getStatus()) ? "selected" : "" %>>En cours</option>
          <option value="Suspendu" <%= "Suspendu".equals(ProjetEducatifBean.getStatus()) ? "selected" : "" %>>Suspendu</option>
          <option value="Atteint" <%= "Atteint".equals(ProjetEducatifBean.getStatus()) ? "selected" : "" %>>Atteint</option>
        </select>
      </div>

      <input type="hidden" name="action" value="">

      <div class="flex justify-center gap-4 pt-6">
        <button type="button" onclick="return listAll();"
          class="bg-[#c38c9b] hover:bg-[#d4afb9] text-white font-semibold py-2 px-6 rounded-lg">
          Voir tout
        </button>
        <button type="button" onclick="return perform('update');"
          class="bg-[#7AA88D] hover:bg-[#AFD4B9] text-white font-semibold py-2 px-6 rounded-lg">
          Mettre a jour
        </button>
      </div>

    </form>

    <hr class="my-8">

    <h3 class="text-center text-lg font-semibold text-gray-700">
      Resultat : <span class="text-indigo-600"><%= result %></span>
    </h3>

  </div>

</body>
</html>

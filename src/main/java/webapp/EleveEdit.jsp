<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <title>Modifier Eleve</title>
  <script src="https://cdn.tailwindcss.com"></script>
  <script language="javascript">
    function perform(command) {
      form1.action.value = command;
      form1.submit();
      return true;
    }
    function listAll() {
      window.location.href = 'EleveList.jsp';
      return true;
    }
  </script>
</head>
<body class="bg-[url(./assets/bg.png)] bg-cover bg-no-repeat bg-center bg-fixed h-screen">

<jsp:useBean id="EleveBean" scope="page" class="class_diagram_orm.EleveProcessor" />
<jsp:setProperty name="EleveBean" property="*" />
<% String result = EleveBean.process();

    if("delete".equals(request.getParameter("action")) && result.contains("Eleve supprime")) {
        response.sendRedirect("EleveList.jsp");
        return;
    }
%>

<div class="flex justify-end m-6">
  <a href="logout" class="text-red-500 hover:underline font-semibold">Deconnexion</a>
</div>

<div class="max-w-2xl mx-auto bg-white shadow-md rounded-lg p-8">
  <h1 class="text-2xl font-bold text-center mb-8 text-gray-800">Supprimer Eleve</h1>

  <form method="POST" name="form1" action="EleveEdit.jsp" class="space-y-6">
    <div>
      <label class="block font-semibold mb-2">ID :</label>
      <input type="text" name="ID" value="<jsp:getProperty name='EleveBean' property='ID'/>"
             readonly
             class="w-full bg-gray-100 border border-gray-300 px-4 py-2 rounded focus:outline-none cursor-not-allowed" readonly/>
    </div>

    <div>
      <label class="block font-semibold mb-2">Biographie :</label>
      <input type="text" name="biographie" value="<jsp:getProperty name='EleveBean' property='biographie'/>"
             class="w-full bg-gray-100 border border-gray-300 px-4 py-2 rounded focus:outline-none cursor-not-allowed" readonly/>
    </div>

    <div>
      <label class="block font-semibold mb-2">Niveau Scolaire :</label>
      <input type="text" name="niveauScolaire" value="<jsp:getProperty name='EleveBean' property='niveauScolaire'/>"
             class="w-full bg-gray-100 border border-gray-300 px-4 py-2 rounded focus:outline-none cursor-not-allowed" readonly/>
    </div>

    <div>
      <label class="block font-semibold mb-2">Date de Naissance :</label>
      <input type="text" name="dateNaissance" value="<jsp:getProperty name='EleveBean' property='dateNaissance'/>"
             class="w-full bg-gray-100 border border-gray-300 px-4 py-2 rounded focus:outline-none cursor-not-allowed"readonly/>
    </div>

    <div>
      <label class="block font-semibold mb-2">Nom :</label>
      <input type="text" name="nom" value="<jsp:getProperty name='EleveBean' property='nom'/>"
             class="w-full bg-gray-100 border border-gray-300 px-4 py-2 rounded focus:outline-none cursor-not-allowed" readonly/>
    </div>

    <div>
      <label class="block font-semibold mb-2">Email :</label>
      <input type="email" name="email" value="<jsp:getProperty name='EleveBean' property='email'/>"
             class="w-full bg-gray-100 border border-gray-300 px-4 py-2 rounded focus:outline-none cursor-not-allowed" readonly/>
    </div>

    <div>
      <label class="block font-semibold mb-2">Mot de Passe :</label>
      <input type="password" name="motDePasse" value="<jsp:getProperty name='EleveBean' property='motDePasse'/>"
             class="w-full bg-gray-100 border border-gray-300 px-4 py-2 rounded focus:outline-none cursor-not-allowed" readonly/>
    </div>

    <input type="hidden" name="action" value="">

    <hr class="my-6">

    <div class="flex justify-center gap-4">
      <button type="button" onclick="return listAll();"
              class="bg-[#c38c9b] hover:bg-[#d4afb9] text-white font-semibold py-2 px-6 rounded-lg">
        Liste Eleves
      </button>
      <button type="button" onclick="return perform('delete');"
              class="bg-red-500 hover:bg-red-600 text-white font-semibold py-2 px-6 rounded-lg">
        Supprimer
      </button>
    </div>
  </form>

  <hr class="my-6">

  <h3 class="text-center font-bold text-lg text-gray-700">Resultat :</h3>
  <p class="text-center text-gray-600"><%= result %></p>
</div>

</body>
</html>

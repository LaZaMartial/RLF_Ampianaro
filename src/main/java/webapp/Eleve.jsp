<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <title>Eleve</title>
  <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100 min-h-screen p-6">

  <div class="max-w-2xl mx-auto bg-white shadow-md rounded-lg p-8">
    <h1 class="text-2xl font-bold text-center mb-8 text-gray-800">Formulaire Eleve</h1>

    <jsp:useBean id="EleveBean" scope="page" class="class_diagram_orm.EleveProcessor" />
    <jsp:setProperty name="EleveBean" property="*" />
    <%
      String result = EleveBean.process();
    %>

    <form method="POST" name="form1" action="Eleve.jsp" class="space-y-6">
      <div>
        <label class="block font-semibold mb-2">Biographie :</label>
        <input type="text" name="biographie" value="<jsp:getProperty name='EleveBean' property='biographie'/>" class="w-full px-4 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-[#c38c9b]" />
      </div>
      <div>
        <label class="block font-semibold mb-2">Niveau Scolaire :</label>
        <input type="text" name="niveauScolaire" value="<jsp:getProperty name='EleveBean' property='niveauScolaire'/>" class="w-full px-4 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-[#c38c9b]" />
      </div>
      <div>
        <label class="block font-semibold mb-2">Date de Naissance :</label>
        <input type="text" name="dateNaissance" value="<jsp:getProperty name='EleveBean' property='dateNaissance'/>" class="w-full px-4 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-[#c38c9b]" />
      </div>
      <div>
        <label class="block font-semibold mb-2">Nom :</label>
        <input type="text" name="nom" value="<jsp:getProperty name='EleveBean' property='nom'/>" class="w-full px-4 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-[#c38c9b]" />
      </div>
      <div>
        <label class="block font-semibold mb-2">Email :</label>
        <input type="text" name="email" value="<jsp:getProperty name='EleveBean' property='email'/>" class="w-full px-4 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-[#c38c9b]" />
      </div>
      <div>
        <label class="block font-semibold mb-2">Mot de Passe :</label>
        <input type="text" name="motDePasse" value="<jsp:getProperty name='EleveBean' property='motDePasse'/>" class="w-full px-4 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-[#c38c9b]" />
      </div>

      <input type="hidden" name="action" value="">

      <div class="flex justify-center gap-4 mt-6">
        <input type="button" value="S'inscrire" onclick="return perform('insert');" class="bg-[#7AA88D] hover:bg-[#AFD4B9] text-white font-semibold py-2 px-6 rounded-lg" />
      </div>
    </form>

    <hr class="my-8">

    <h3 class="text-center font-semibold text-gray-800 text-lg mb-2">Resultat :</h3>
    <p class="text-center text-gray-600"><%= result %></p>
  </div>

  <script>
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

</body>
</html>

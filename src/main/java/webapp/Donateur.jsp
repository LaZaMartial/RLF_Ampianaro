<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <title>Donateur</title>
  <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100 min-h-screen p-6">

<jsp:useBean id="DonateurBean" scope="page" class="class_diagram_orm.DonateurProcessor" />
<jsp:setProperty name="DonateurBean" property="*" />
<% String result = DonateurBean.process();

    if("insert".equals(request.getParameter("action")) && result.contains("Donateur insere")) {
        response.sendRedirect("Login.jsp");
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
    window.location.href = 'DonateurList.jsp';
    return true;
}
</script>

<div class="max-w-2xl mx-auto bg-white shadow-md rounded-lg p-8">
  <h1 class="text-2xl font-bold text-center mb-8 text-gray-800">Donateur</h1>

  <form method="POST" name="form1" action="Donateur.jsp" class="space-y-6">
    <div>
      <label class="block text-gray-700 font-semibold mb-2">Nom :</label>
      <input type="text" name="nom" value="<jsp:getProperty name='DonateurBean' property='nom'/>"
             class="w-full px-4 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-[#c38c9b]">
    </div>

    <div>
      <label class="block text-gray-700 font-semibold mb-2">Email :</label>
      <input type="text" name="email" value="<jsp:getProperty name='DonateurBean' property='email'/>"
             class="w-full px-4 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-[#c38c9b]">
    </div>

    <div>
      <label class="block text-gray-700 font-semibold mb-2">Mot de passe :</label>
      <input type="text" name="motDePasse" value="<jsp:getProperty name='DonateurBean' property='motDePasse'/>"
             class="w-full px-4 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-[#c38c9b]">
    </div>

    <input type="hidden" name="action" value="">

    <div class="flex justify-center gap-4 mt-8">
      <button type="button" onclick="return perform('insert');" class="bg-[#7AA88D] hover:bg-[#AFD4B9] text-white font-semibold py-2 px-6 rounded-lg">
        S'inscrire
      </button>
    </div>
  </form>

  <hr class="my-8">

  <h3 class="text-center text-lg font-bold text-gray-700">Resultat :</h3>
  <p class="text-center mt-4 text-gray-600"><%= result %></p>
</div>

</body>
</html>

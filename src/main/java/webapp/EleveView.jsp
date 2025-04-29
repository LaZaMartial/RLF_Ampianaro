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
<body class="bg-gray-100 min-h-screen p-6">

<jsp:useBean id="EleveBean" scope="page" class="class_diagram_orm.EleveProcessor" />
<jsp:setProperty name="EleveBean" property="*" />
<% String result = EleveBean.process(); %>

<div class="flex justify-end mb-6">
  <a href="logout" class="text-red-500 hover:underline font-semibold">Deconnexion</a>
</div>

<div class="max-w-2xl mx-auto bg-white shadow-md rounded-lg p-8">
  <h1 class="text-2xl font-bold text-center mb-8 text-gray-800">Information Eleve</h1>

  <form method="POST" name="form1" action="EleveEdit.jsp" class="space-y-6">
    <div>
      <label class="block font-semibold mb-2">ID :</label>
      <input type="text" name="ID" value="<jsp:getProperty name='EleveBean' property='ID'/>"
             readonly
             class="w-full bg-gray-100 border border-gray-300 px-4 py-2 rounded focus:outline-none" />
    </div>

    <div>
      <label class="block font-semibold mb-2">Biographie :</label>
      <input type="text" name="biographie" value="<jsp:getProperty name='EleveBean' property='biographie'/>"
             class="w-full border border-gray-300 px-4 py-2 rounded focus:ring-indigo-400 focus:outline-none"
             readonly/>
    </div>

    <div>
      <label class="block font-semibold mb-2">Niveau Scolaire :</label>
      <input type="text" name="niveauScolaire" value="<jsp:getProperty name='EleveBean' property='niveauScolaire'/>"
             class="w-full border border-gray-300 px-4 py-2 rounded focus:ring-indigo-400 focus:outline-none"
             readonly/>
    </div>

    <div>
      <label class="block font-semibold mb-2">Date de Naissance :</label>
      <input type="text" name="dateNaissance" value="<jsp:getProperty name='EleveBean' property='dateNaissance'/>"
             class="w-full border border-gray-300 px-4 py-2 rounded focus:ring-indigo-400 focus:outline-none"
             readonly/>
    </div>

    <div>
      <label class="block font-semibold mb-2">Nom :</label>
      <input type="text" name="nom" value="<jsp:getProperty name='EleveBean' property='nom'/>"
             class="w-full border border-gray-300 px-4 py-2 rounded focus:ring-indigo-400 focus:outline-none"
             readonly/>
    </div>

    <div>
      <label class="block font-semibold mb-2">Email :</label>
      <input type="email" name="email" value="<jsp:getProperty name='EleveBean' property='email'/>"
             class="w-full border border-gray-300 px-4 py-2 rounded focus:ring-indigo-400 focus:outline-none"
             readonly/>
    </div>

    <input type="hidden" name="action" value="">

    <hr class="my-6">
  </form>
</div>

</body>
</html>

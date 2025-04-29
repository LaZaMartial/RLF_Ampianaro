<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <title>Modifier Donateur</title>
  <script src="https://cdn.tailwindcss.com"></script>
  <script language="javascript">
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
</head>
<body class="bg-gray-100 min-h-screen p-6">

<jsp:useBean id="DonateurBean" scope="page" class="class_diagram_orm.DonateurProcessor" />
<jsp:setProperty name="DonateurBean" property="*" />
<% String result = DonateurBean.process(); %>

<div class="flex justify-end mb-6">
  <a href="logout" class="text-red-500 hover:underline font-semibold">Deconnexion</a>
</div>

<div class="max-w-2xl mx-auto bg-white shadow-md rounded-lg p-8">
  <h1 class="text-2xl font-bold text-center mb-8 text-gray-800">Information Donateur</h1>

  <form method="POST" name="form1" action="DonateurEdit.jsp" class="space-y-6">
    <div>
      <label class="block font-semibold mb-2">ID :</label>
      <input type="text" name="ID" value="<jsp:getProperty name='DonateurBean' property='ID'/>"
             readonly
             class="w-full bg-gray-100 border border-gray-300 px-4 py-2 rounded focus:outline-none" />
    </div>

    <div>
      <label class="block font-semibold mb-2">Nom :</label>
      <input type="text" name="nom" value="<jsp:getProperty name='DonateurBean' property='nom'/>"
             class="w-full border border-gray-300 px-4 py-2 rounded focus:ring-indigo-400 focus:outline-none"
             readonly />
    </div>

    <div>
      <label class="block font-semibold mb-2">Email :</label>
      <input type="email" name="email" value="<jsp:getProperty name='DonateurBean' property='email'/>"
             class="w-full border border-gray-300 px-4 py-2 rounded focus:ring-indigo-400 focus:outline-none"
             readonly/>
    </div>
  </form>

  <hr class="my-6">
</div>

</body>
</html>

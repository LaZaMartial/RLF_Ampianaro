<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Connexion</title>
  <!-- Intégration de Tailwind CSS via CDN -->
  <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100 min-h-screen">

    <div class="flex justify-end mt-6 mr-6">
      <a onclick="openDialog()" class="px-4 py-2 text-[#7AA88D] hover:underline">
          S'inscrire
      </a>
    </div>

  <div class="bg-white mx-auto mt-20 p-8 rounded-lg shadow-md w-full max-w-md">
    <h2 class="text-2xl font-bold text-center text-gray-800 mb-6">Connexion</h2>

    <% String errorMessage = (String) request.getAttribute("errorMessage"); %>
    <% if (errorMessage != null) { %>
      <p class="text-red-600 text-sm mb-4"><%= errorMessage %></p>
    <% } %>

    <form action="login" method="post" class="space-y-4">
      <div>
        <label for="email" class="block text-sm font-medium text-gray-700">Email</label>
        <input type="text" id="email" name="email" required
               class="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-[#d4afb9]" />
      </div>

      <div>
        <label for="motdepasse" class="block text-sm font-medium text-gray-700">Mot de passe</label>
        <input type="password" id="motdepasse" name="motdepasse" required
               class="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-[#d4afb9]" />
      </div>

      <div>
        <button type="submit"
                class="w-full bg-[#c38c9b] text-white py-2 px-4 rounded-md hover:bg-[#d4afb9] transition duration-200">
          Se connecter
        </button>
      </div>
    </form>
  </div>
  <!-- Dialog caché -->
  <div id="signupDialog" class="fixed inset-0 bg-black bg-opacity-30 hidden items-center justify-center z-50">
      <div class="bg-white rounded-lg shadow-lg p-6 max-w-sm w-full text-center space-y-4">
          <h2 class="text-lg font-semibold">Choisissez le type d'inscription</h2>
          <div class="flex justify-center gap-4">
              <button onclick="redirectTo('donateur')" class="px-4 py-2 bg-[#c38c9b] text-white rounded hover:bg-[#d4afb9]">
                  Donateur
              </button>
              <button onclick="redirectTo('eleve')" class="px-4 py-2 bg-[#c38c9b] text-white rounded hover:bg-[#d4afb9]">
                  Eleve
              </button>
          </div>
          <button onclick="closeDialog()" class="text-sm text-gray-500 hover:underline mt-2">Annuler</button>
      </div>
  </div>

  <script>
      function openDialog() {
          document.getElementById("signupDialog").classList.remove("hidden");
          document.getElementById("signupDialog").classList.add("flex");
      }

      function closeDialog() {
          document.getElementById("signupDialog").classList.add("hidden");
          document.getElementById("signupDialog").classList.remove("flex");
      }

      function redirectTo(type) {
          if (type === "donateur") {
              window.location.href = "Donateur.jsp";
          } else if (type === "eleve") {
              window.location.href = "Eleve.jsp";
          }
      }
  </script>

</body>
</html>

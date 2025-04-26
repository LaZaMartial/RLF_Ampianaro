<!DOCTYPE html>
<html>
<head>
    <title>Connexion</title>
</head>
<body>

<h2>Connexion</h2>

<% String errorMessage = (String) request.getAttribute("errorMessage"); %>
<% if (errorMessage != null) { %>
    <p style="color:red;"><%= errorMessage %></p>
<% } %>

<form action="login" method="post">
    Email: <input type="text" name="email" required><br><br>
    Mot de passe: <input type="password" name="motdepasse" required><br><br>
    <input type="submit" value="Se connecter">
</form>

</body>
</html>

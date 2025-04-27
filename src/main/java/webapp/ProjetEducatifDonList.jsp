<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee:
License Type: Purchased-->
<html>
<head><title>ProjetEducatif List</title>
</head>
<body>
<tr><td><a href="logout">Deconnexion</a></td></tr>
<center>
<h1>ProjetEducatif List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID</td>
		<td>Titre</td>
		<td>Description</td>
		<td>MontantObjectif</td>
		<td>MontantCollecte</td>
		<td>Status</td>
		<td>DateCreation</td>
		<td>Eleve</td>
		<td></td>
	</tr>
<%
class_diagram_orm.ProjetEducatif[] projetEducatifs = class_diagram_orm.ProjetEducatif.listProjetEducatifByQuery(null, null);
for(int i = 0; i < projetEducatifs.length; i++) {
        if (!"En cours".equalsIgnoreCase(projetEducatifs[i].getStatus())) {
            continue; // Sauter les projets non "En cours"
        }
		out.print("<tr>");
		out.print("<td>");
		out.print(projetEducatifs[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(projetEducatifs[i].getTitre());
		out.println("</td>");
		out.print("<td>");
		out.print(projetEducatifs[i].getDescription());
		out.println("</td>");
		out.print("<td>");
		out.print(projetEducatifs[i].getMontantObjectif());
		out.println("</td>");
		out.print("<td>");
		out.print(projetEducatifs[i].getMontantCollecte());
		out.println("</td>");
		out.print("<td>");
		out.print(projetEducatifs[i].getStatus());
		out.println("</td>");
		out.print("<td>");
		out.print(projetEducatifs[i].getDateCreation());
		out.println("</td>");

		class_diagram_orm.Eleve eleve = projetEducatifs[i].getEleve();
		if(eleve != null) {
			out.print("<td>");
			out.print("<a href=\"Eleve.jsp?action=search&ID=");
			out.print(eleve.getORMID());
			out.print("\">");
			out.print(eleve.getNom());
			out.print("</a>");
			out.println("</td>");
		}

		else
 {
out.println("<td></td>");
		}

		out.print("<td>");
		out.print("<a href=\"ProjetEducatifDon.jsp?ID=");
		out.print(projetEducatifs[i].getORMID());
		out.print("\">");
		out.print("Faire Don");
		out.print("</a>");
		out.print("</td>");
		out.println("</td>");
		out.println("</tr>");
}

%>
</table><br>
<a href="index.html">Index page</a>
 |
<a href="Don.jsp">Add Don</a>
</center>
</body>
</html>

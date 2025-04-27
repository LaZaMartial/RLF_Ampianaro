<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<head><title>Eleve List</title>
</head>
<body>
<tr><td><a href="logout">Deconnexion</a></td></tr>
<center>
<h1>Eleve List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID</td>
		<td>Biographie</td>
		<td>NiveauScolaire</td>
		<td>DateNaissance</td>
		<td>Nom</td>
		<td>Email</td>
		<td></td>
	</tr>
<%
class_diagram_orm.Eleve[] eleves = class_diagram_orm.Eleve.listEleveByQuery(null, null);
for(int i = 0; i < eleves.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(eleves[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(eleves[i].getBiographie());
		out.println("</td>");
		out.print("<td>");
		out.print(eleves[i].getNiveauScolaire());
		out.println("</td>");
		out.print("<td>");
		out.print(eleves[i].getDateNaissance());
		out.println("</td>");
		out.print("<td>");
		out.print(eleves[i].getNom());
		out.println("</td>");
		out.print("<td>");
		out.print(eleves[i].getEmail());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"EleveEdit.jsp?action=search&ID=");
		out.print(eleves[i].getORMID());
		out.print("\">");
		out.print("Edit");
		out.print("</a>");
		out.print("</td>");
		out.println("</td>");
		out.println("</tr>");
}

%>
</table><br>
<a href="index.html">Index page</a>
 | 
<a href="Eleve.jsp">Add Eleve</a>
</center>
</body>
</html>

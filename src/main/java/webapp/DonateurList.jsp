<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<head><title>Donateur List</title>
</head>
<body>
<tr><td><a href="logout">Deconnexion</a></td></tr>
<center>
<h1>Donateur List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID</td>
		<td>Nom</td>
		<td>Email</td>
		<td></td>
	</tr>
<%
class_diagram_orm.Donateur[] donateurs = class_diagram_orm.Donateur.listDonateurByQuery(null, null);
for(int i = 0; i < donateurs.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(donateurs[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(donateurs[i].getNom());
		out.println("</td>");
		out.print("<td>");
		out.print(donateurs[i].getEmail());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"DonateurEdit.jsp?action=search&ID=");
		out.print(donateurs[i].getORMID());
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
<a href="Donateur.jsp">Add Donateur</a>
</center>
</body>
</html>

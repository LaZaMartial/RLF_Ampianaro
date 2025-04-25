<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<head><title>Don List</title>
</head>
<body>
<center>
<h1>Don List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID</td>
		<td>Montant</td>
		<td>DateEnvoi</td>
		<td>Donateur</td>
		<td>ProjetEducatif</td>
		<td></td>
	</tr>
<%
class_diagram_orm.Don[] dons = class_diagram_orm.Don.listDonByQuery(null, null);
for(int i = 0; i < dons.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(dons[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(dons[i].getMontant());
		out.println("</td>");
		out.print("<td>");
		out.print(dons[i].getDateEnvoi());
		out.println("</td>");
		
		class_diagram_orm.Donateur donateur = dons[i].getDonateur();
		if(donateur != null) {
			out.print("<td>");
			out.print("<a href=\"Donateur.jsp?action=search&ID=");
			out.print(donateur.getORMID());
			out.print("\">");
			out.print(donateur.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		class_diagram_orm.ProjetEducatif projetEducatif = dons[i].getProjetEducatif();
		if(projetEducatif != null) {
			out.print("<td>");
			out.print("<a href=\"ProjetEducatif.jsp?action=search&ID=");
			out.print(projetEducatif.getORMID());
			out.print("\">");
			out.print(projetEducatif.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Don.jsp?action=search&ID=");
		out.print(dons[i].getORMID());
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
<a href="Don.jsp">Add Don</a>
</center>
</body>
</html>

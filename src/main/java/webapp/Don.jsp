<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<jsp:useBean id="DonBean" scope="page" class="class_diagram_orm.DonProcessor" />
<jsp:setProperty name="DonBean" property="*" />
<% String result = DonBean.process(request, response); %>
<%
    java.util.List<class_diagram_orm.ProjetEducatif> projets = null;
    try {
        projets = class_diagram_orm.ProjetEducatif.queryProjetEducatif(null, null);
    } catch (Exception e) {
        e.printStackTrace();
    }
%>


<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'DonList.jsp';
		return true;
	}
// -->
</script>
<head><title>Don</title>
</head>
<body>
<h1>Don</h1>
<form method="POST" name="form1" action=Don.jsp>
	<table>
		<tr>
			<td>Montant : </td>
			<td><input type=text name="montant" value="<jsp:getProperty name="DonBean" property="montant"/>" /></td>
		</tr>
		<tr>
			<td>ProjetEducatif   : </td>
			<td>
                <select name="projetEducatif_projetEducatifID">
                  <option value="">-- Choisir un projet --</option>
                  <% if (projets != null) {
                       for (class_diagram_orm.ProjetEducatif projet : projets) { %>
                         <option value="<%= projet.getORMID() %>"><%= projet.getTitre() %></option>
                  <%   }
                     }
                  %>
                </select>
              </td>
		</tr>
	</table>
	<INPUT type="hidden" name="action" value="">
	<hr>
	<INPUT type="button" value="List All" onclick="return listAll();">
	<INPUT type="button" value="Insert" onclick="return perform('insert');">
</form>
<hr>
<h3><b>Result :</b><%=result%></h3>
</body>
</html>

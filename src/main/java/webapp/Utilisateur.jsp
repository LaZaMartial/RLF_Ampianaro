<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<jsp:useBean id="UtilisateurBean" scope="page" class="class_diagram_orm.UtilisateurProcessor" />
<jsp:setProperty name="UtilisateurBean" property="*" />
<% String result = UtilisateurBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'UtilisateurList.jsp';
		return true;
	}
// -->
</script>
<head><title>Utilisateur</title>
</head>
<body>
<h1>Utilisateur</h1>
<form method="POST" name="form1" action=Utilisateur.jsp>
	<table>
		<tr>
			<td>Nom : </td>
			<td><input type=text name="nom" value="<jsp:getProperty name="UtilisateurBean" property="nom"/>" /></td>
		</tr>
		<tr>
			<td>Email : </td>
			<td><input type=text name="email" value="<jsp:getProperty name="UtilisateurBean" property="email"/>" /></td>
		</tr>
		<tr>
			<td>MotDePasse : </td>
			<td><input type=text name="motDePasse" value="<jsp:getProperty name="UtilisateurBean" property="motDePasse"/>" /></td>
		</tr>
	</table>
	<INPUT type="hidden" name="action" value="">
	<hr>
	<INPUT type="button" value="List All" onclick="return listAll();">
	<INPUT type="button" value="Search" onclick="return perform('search');">
	<INPUT type="button" value="Insert" onclick="return perform('insert');">
	<INPUT type="button" value="Update" onclick="return perform('update');">
	<INPUT type="button" value="Delete" onclick="return perform('delete');">
	<INPUT type="reset">
</form>
<hr>
<h3><b>Result :</b><%=result%></h3>
</body>
</html>

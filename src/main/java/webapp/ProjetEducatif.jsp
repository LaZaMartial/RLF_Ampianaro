<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<jsp:useBean id="ProjetEducatifBean" scope="page" class="class_diagram_orm.ProjetEducatifProcessor" />
<jsp:setProperty name="ProjetEducatifBean" property="*" />
<% String result = ProjetEducatifBean.process(request, response); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'ProjetEducatifList.jsp';
		return true;
	}
// -->
</script>
<head><title>ProjetEducatif</title>
</head>
<body>
<h1>ProjetEducatif</h1>
<form method="POST" name="form1" action=ProjetEducatif.jsp>
	<table>
		<tr>
			<td>Titre : </td>
			<td><input type=text name="titre" value="<jsp:getProperty name="ProjetEducatifBean" property="titre"/>" /></td>
		</tr>
		<tr>
			<td>Description : </td>
			<td><input type=text name="description" value="<jsp:getProperty name="ProjetEducatifBean" property="description"/>" /></td>
		</tr>
		<tr>
			<td>MontantObjectif : </td>
			<td><input type=text name="montantObjectif" value="<jsp:getProperty name="ProjetEducatifBean" property="montantObjectif"/>" /></td>
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

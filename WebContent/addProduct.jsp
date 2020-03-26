<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Product</title>
<s:head/>
<link rel="stylesheet" href="style.css">
</head>
<body>

	<div align="center">
		<h2>Add New Product</h2>
		<s:form action="addAction" class="formTable">
			<s:textfield name="productId" label="Product Id" class="formTextField"></s:textfield>
			<s:textfield name="productName" label="Product Name" class="formTextField"></s:textfield>
			<s:textfield name="productCategory" label="Product Category" class="formTextField"></s:textfield>
			<s:textfield name="productPrice" label="Product Price" class="formTextField"></s:textfield>
			<s:submit value="Add" class="actionBtn"></s:submit>
		</s:form>
	</div>

</body>
</html>
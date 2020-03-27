<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Product</title>
<s:head/>
<link rel="stylesheet" href="style.css">
</head>
<body>

	<%@ include file="header.jsp" %>

	<div align="center">
		<h2>Update Product</h2>
		<s:form action="updateAction" class="formTable">
			<s:textfield name="productId" label="Product Id" class="formTextField" readonly="true" />
			<s:textfield name="productName" label="Product Name" class="formTextField" />
			<s:textfield name="productCategory" label="Product Category" class="formTextField" />
			<s:textfield name="productPrice" label="Product Price" class="formTextField" />
			<s:submit value="Update" class="actionBtn"></s:submit>
		</s:form>
	</div>

</body>
</html>
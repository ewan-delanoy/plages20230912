<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste de parasols équipés</title>
<jsp:include page="include/header.jsp"/>
</head>
<body>
<jsp:include page="include/nav.jsp"></jsp:include>
<h1><spring:message code="reservation"/></h1>
<!-- Avec la méthode post, on envoie les informations dans le corps de la requête HTTP -->
Hello World ! 

<form:options items="${equipements}" itemValue="id" itemLabel="numeroEmplacementEtNumeroDeFile"/>
</form:select><form:errors cssClass="erreur" path="equipements"/>
<form:button>Enregistrer</form:button>
</form:form>
<br>

<jsp:include page="include/piedDePage.jsp"></jsp:include>
</body>
</html>
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

Avec la méthode post, on envoie les informations dans le corps de la requête HTTP 

<form:form method="post" modelAttribute="brouillon" action="brouillon">
Choisissez un parasol équipé :
<br>
<form:select path="parasol1" multiple="false">
<form:option value="0">Merci de choisir un parasol</form:option>
<form:options items="${parasols}" itemValue="id" itemLabel="numeroEmplacementEtNumeroDeFile"/>
</form:select><form:errors cssClass="erreur" path="parasols"/>

<form:select path="equipement1" multiple="false">
<form:option value="0">Merci de choisir un équipement</form:option>
<form:options items="${equipements}" itemValue="id" itemLabel="description"/>
</form:select><form:errors cssClass="erreur"/>
<br>

Choisissez un second parasol équipé :
<br>
<form:select path="parasol2" multiple="false">
<form:option value="0">Merci de choisir un parasol</form:option>
<form:options items="${parasols}" itemValue="id" itemLabel="numeroEmplacementEtNumeroDeFile"/>
</form:select><form:errors cssClass="erreur" path="parasols"/>

<form:select path="equipement2" multiple="false">
<form:option value="0">Merci de choisir un équipement</form:option>
<form:options items="${equipements}" itemValue="id" itemLabel="description"/>
</form:select><form:errors cssClass="erreur"/>
<br>

Choisissez un troisième parasol équipé :
<br>
<form:select path="parasol3" multiple="false">
<form:option value="0">Merci de choisir un parasol</form:option>
<form:options items="${parasols}" itemValue="id" itemLabel="numeroEmplacementEtNumeroDeFile"/>
</form:select><form:errors cssClass="erreur" path="parasols"/>

<form:select path="equipement3" multiple="false">
<form:option value="0">Merci de choisir un équipement</form:option>
<form:options items="${equipements}" itemValue="id" itemLabel="description"/>
</form:select><form:errors cssClass="erreur"/>
<br>
<form:button>Enregistrer</form:button>
</form:form>


<jsp:include page="include/piedDePage.jsp"></jsp:include>
</body>
</html>
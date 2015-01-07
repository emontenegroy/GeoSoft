<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<!-- META -->
		<title>GeoSoft - Software de Geolocalización Vehicular</title>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
		<meta name="description" content="" />

		<!-- CSS -->
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/normalize.css" media="all" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/kickstart.css" media="all" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css" media="all" /> 

		<!-- Javascript -->
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.11.2.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/kickstart.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/javascript.js"></script>
	</head>
	<body>

		<f:view locale="#{localeMBean.locale}">
			<!--Las Iniciales del Idioma de Nuestro Navegador Web es: ${pageContext.request.locale}<br/>-->
			<h:form id="frmLogin">
				<div class="login-idioma">
					<h:outputLabel for="lenguaje"><fmt:message key="choose_a_language"/>:</h:outputLabel>
				    <h:selectOneMenu id="lenguaje" value="#{localeMBean.language}" onchange="submit()">
				        <f:selectItem itemValue="en" itemLabel="English" />
				        <f:selectItem itemValue="es" itemLabel="Español" />
				    </h:selectOneMenu>
				</div>
				<div class="login-sesion">
					<table>
						<tr>
							<td><h:outputLabel for="usuario"><fmt:message key="user" /></h:outputLabel></td>
							<td><h:inputText id="usuario" maxlength="45"></h:inputText></td>
						</tr>
						<tr>
							<td><h:outputLabel for="clave"><fmt:message key="password" /></h:outputLabel></td>
							<td><h:inputSecret id="clave"></h:inputSecret></td>
						</tr>
						<tr>
							<td colspan="2"><h:commandLink value="Iniciar Sesión" action="#{usuarioMBean.login}"></h:commandLink></td>
						</tr>
					</table>
				</div>
			</h:form>		
		</f:view>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>GeoSoft - Software de Geolocalización Vehicular</title>
	</head>
	<body>

		<f:view locale="#{localeMBean.locale}">
			<h:outputText value="#{localeMBean.locale}"></h:outputText><br/>
			
			<h:form>
				
				<h:commandButton value="btngaby" action="#{localeMBean.editAction}">
					<f:param id="lokito" value="soyrex" name="lokito"></f:param>
				</h:commandButton>
				
			
			    <h:selectOneMenu value="#{localeMBean.language}" onchange="submit()">
			        <f:selectItem itemValue="en" itemLabel="English" />
			        <f:selectItem itemValue="es" itemLabel="Español" />
			    </h:selectOneMenu>
			</h:form>		
			
			
			Iniciales del Idioma de Nuestro Navegador Web : ${pageContext.request.locale}<br/>
						
			<h:outputText><fmt:message key="choose_a_language"/>: </h:outputText>
						
			<a href="index.jsf?lang=es">español</a>&nbsp;
			<a href="index.jsf?lang=en">ingles</a><br/>
			
			<fmt:setLocale value="${pageContext.request.locale}" scope="session" />
			<c:if test="${pageContext.request.locale != 'en' && pageContext.request.locale != 'es'}">
			   	<fmt:setLocale value="en" scope="session" />
			</c:if>
			
			loco: ${param.lang}<br/>
			
			<c:if test="${param.lang != null}">
			   	<fmt:setLocale value="${param.lang}" scope="session" />
			</c:if>
			
			<fmt:message key="user" /><br/>
			<fmt:message key="password" /><br/>
			
			<a href="index.jsf?lang=en"><fmt:message key="password" /></a><br/>
			<a href="${pageContext.request.contextPath}/pages/home.jsp">Iniciar Session</a>
			
			
				
			<h:selectOneMenu>
			   <f:selectItem itemValue="1" itemLabel="Item 1" />
			   <f:selectItem itemValue="2" itemLabel="Item 2" />	   							
			</h:selectOneMenu>
		
			
		</f:view>
			
	</body>
</html>
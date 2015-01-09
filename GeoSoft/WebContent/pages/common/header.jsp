<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<img src="${pageContext.request.contextPath}/resources/images/logo.png" alt="Smiley face" height="42">
<h:form id="frmHeader">
	<h:commandLink id="clLogout" value="Cerrar Sesión" action="#{usuarioMBean.logout}"></h:commandLink>
</h:form>


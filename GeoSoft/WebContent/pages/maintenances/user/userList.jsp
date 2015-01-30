<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<h:form id="formMantenimientoUsuario">
	<div class="mantenimiento">
		<h6><fmt:message key="userMaintenance" /></h6>
		<hr>
		<div class="busquedaBasica">
			<h:outputLabel><fmt:message key="searchFor" /></h:outputLabel>
			<div class="styled-select">
				<h:selectOneMenu value="#{mUsuarioMBean.valorCombo}">
			        <f:selectItem itemValue="#{null}" itemLabel="-- select one --" />
			        <f:selectItems value="#{mUsuarioMBean.listaCombo}" />
		    	</h:selectOneMenu>
	    	</div>
	    	<h:inputText value="#{mUsuarioMBean.valorInput}"></h:inputText>
	    	<h:commandLink styleClass="button" actionListener="#{mUsuarioMBean.busquedaBasica()}"><fmt:message key="search" /></h:commandLink>
    	</div>
    	<div class="cuerpo">
			<h:dataTable value="#{mUsuarioMBean.listaUsuarios}" var="lu">
				<h:column>
					<f:facet name="header"><h:outputText value="Nombre" /></f:facet>
					<h:commandLink value="#{lu.nombre}" action="mUserUpdate"></h:commandLink>
				</h:column>
				<h:column>
					<f:facet name="header"><h:outputText value="Apellido" /></f:facet>
					<h:outputText value="#{lu.apellidos}"></h:outputText>
				</h:column>
				<h:column>
					<f:facet name="header"><h:outputText value="Usuario" /></f:facet>
					<h:outputText value="#{lu.usuario}"></h:outputText>
				</h:column>
				<h:column>
					<f:facet name="header"><h:outputText value="Estado" /></f:facet>
					<h:outputText value="#{lu.estado}"></h:outputText>
				</h:column>
			</h:dataTable>
    	</div>
    	<div class="pie">
    		<h:commandLink value="Agregar Usuario" action="mUserInsert"></h:commandLink>
    	</div>
	</div>
</h:form>

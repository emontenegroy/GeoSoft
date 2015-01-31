<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<h:form id="formMantenimientoUsuario"  style="height: 100%;">
	<div class="mantenimiento">
		<h6><fmt:message key="userMaintenanceList" /></h6>
		<hr>
		<div class="busquedaBasica">
			<h:outputLabel><fmt:message key="searchFor" /></h:outputLabel>
			<h:selectOneMenu value="#{mUsuarioMBean.valorCombo}">
<%-- 		        <f:selectItem itemValue="#{null}" itemLabel="-- select one --" /> --%>
		        <f:selectItems value="#{mUsuarioMBean.listaCombo}" />
	    	</h:selectOneMenu>
	    	<h:inputText value="#{mUsuarioMBean.valorInput}"></h:inputText>
	    	<h:commandLink styleClass="button" actionListener="#{mUsuarioMBean.busquedaBasica()}"><fmt:message key="search" /></h:commandLink>
    	</div>
    	<div class="cuerpo">
			<h:dataTable value="#{mUsuarioMBean.listaUsuarios}" var="lu">
				<h:column>
					<f:facet name="header"><h:outputText><fmt:message key="name" /></h:outputText></f:facet>
					<h:commandLink value="#{lu.nombre}" action="#{mUsuarioMBean.cargarActualizar}">
						<f:setPropertyActionListener target="#{mUsuarioMBean.usuario}" value="#{lu}" />
					</h:commandLink>
				</h:column>
				<h:column>
					<f:facet name="header"><h:outputText><fmt:message key="lastname" /></h:outputText></f:facet>
					<h:outputText value="#{lu.apellidos}"></h:outputText>
				</h:column>
				<h:column>
					<f:facet name="header"><h:outputText><fmt:message key="user" /></h:outputText></f:facet>
					<h:outputText value="#{lu.usuario}"></h:outputText>
				</h:column>
				<h:column>
					<f:facet name="header"><h:outputText><fmt:message key="state" /></h:outputText></f:facet>
					<h:outputText value="#{lu.estado}"></h:outputText>
				</h:column>
			</h:dataTable>
    	</div>
    	<div class="pie">
    		<h:commandLink styleClass="button" action="#{mUsuarioMBean.cargarInsertar}"><fmt:message key="add" /></h:commandLink>
    	</div>
	</div>
</h:form>

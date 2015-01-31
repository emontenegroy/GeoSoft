<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<h:form id="formMantenimientoCliente">
	<div class="mantenimiento">
		<h6><fmt:message key="clientMaintenance" /></h6>
		<hr>
		
		<div class="busquedaBasica">
			<h:outputLabel><fmt:message key="searchFor" /></h:outputLabel>
 			<div class="styled-select">
				<h:selectOneMenu value="#{mClienteMBean.valorCombo}">
			        <f:selectItem itemValue="#{null}" itemLabel="-- select one --" />
			        <f:selectItems value="#{mClienteMBean.listaCombos}" />
		    	</h:selectOneMenu>
	    	</div> 
	    	<h:inputText value="#{mClienteMBean.valorInput}"></h:inputText>
	    	<h:commandLink styleClass="button" actionListener="#{mClienteMBean.busquedaBasica()}"><fmt:message key="search" /></h:commandLink>
    	</div>
    	
    	<div class="cuerpo">
			<h:dataTable value="#{mClienteMBean.listaClientes}" var="lu">
				<h:column>
					<f:facet name="header"><h:outputText value="Nombre" /></f:facet>
					<h:commandLink value="#{lu.nombre}" action="mClientUpdate"></h:commandLink>
				</h:column>
				<h:column>
					<f:facet name="header"><h:outputText value="Apellido" /></f:facet>
					<h:outputText value="#{lu.apellido}"></h:outputText>
				</h:column>
				<%-- <h:column>
					<f:facet name="header"><h:outputText value="DNI" /></f:facet>
					<h:outputText value="#{lu.dni}"></h:outputText>
				</h:column>
				<h:column>
					<f:facet name="header"><h:outputText value="Telefono" /></f:facet>
					<h:outputText value="#{lu.telefono}"></h:outputText>
				</h:column> --%>
				<h:column>
					<f:facet name="header"><h:outputText value="Correo" /></f:facet>
					<h:outputText value="#{lu.correo}"></h:outputText>
				</h:column>
				<h:column>
					<f:facet name="header"><h:outputText value="Estado" /></f:facet>
					<h:outputText value="#{lu.estado}"></h:outputText>
				</h:column>
			</h:dataTable>
    	</div>
    	<div class="pie">
    		<h:commandLink value="Agregar Cliente" action="mClientInsert"></h:commandLink>
    	</div>
	</div>
</h:form>
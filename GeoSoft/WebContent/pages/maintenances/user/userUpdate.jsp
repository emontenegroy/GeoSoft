<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<h:form id="formMantenimientoUsuario" style="height: 100%;">
	<div class="mantenimiento">
		<h6><fmt:message key="userMaintenanceUpd" /></h6>
		<hr>
    	<div class="cuerpo">
    		<div style="width: 30%">
    			<div class="col_6"><h:outputLabel><fmt:message key="name" />:</h:outputLabel></div>
				<div class="col_6"><h:inputText value="#{mUsuarioMBean.usuario.nombre}"></h:inputText></div>
    		
    			<div class="col_6"><h:outputLabel><fmt:message key="lastname" />:</h:outputLabel></div>
    			<div class="col_6"><h:inputText value="#{mUsuarioMBean.usuario.apellidos}"></h:inputText></div>
    		
    			<div class="col_6"><h:outputLabel><fmt:message key="user" />:</h:outputLabel></div>
    			<div class="col_6"><h:inputText value="#{mUsuarioMBean.usuario.usuario}"></h:inputText></div>
    		
    			<div class="col_6"><h:outputLabel><fmt:message key="state" />:</h:outputLabel></div>
    			<div class="col_6"><div class="styled-select">
						<h:selectOneMenu value="#{mUsuarioMBean.usuario.estado}">
					        <f:selectItems value="#{mUsuarioMBean.listaEstado}" />
				    	</h:selectOneMenu>
				</div></div>
    		</div>
    	</div>
    	<div class="pie">
    		<h:commandLink id="ManGuadar" styleClass="button" action="#{mUsuarioMBean.actualizar}"><fmt:message key="save" /></h:commandLink>
    		<h:commandLink id="ManCancelar" styleClass="button" action="mUserList"><fmt:message key="cancel" /></h:commandLink>
    	</div>
	</div>
</h:form>
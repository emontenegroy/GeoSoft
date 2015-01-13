<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<h:form id="frmMenu">
	
		<div class="container">
		  
		  <ul>
		    <li class="dropdown">
		      <input type="checkbox" />
		      <a href="#" data-toggle="dropdown"><fmt:message key="map" /></a>
		      <ul class="dropdown-menu">
		        <li><h:commandLink id="clMapa" action="mapa"><fmt:message key="map" /></h:commandLink></li>
		      </ul>
		    </li>
		    <li class="dropdown">
		      <input type="checkbox" />
		      <a href="#" data-toggle="dropdown"><fmt:message key="maintenances" /></a>
		      <ul class="dropdown-menu">
		        <li><h:commandLink id="clMUsuario" action="musuario"><fmt:message key="user" /></h:commandLink></li>
		        <li><h:commandLink id="clMCliente" action="mcliente"><fmt:message key="client" /></h:commandLink></li>
		        <li><h:commandLink id="clMVehiculo" action="mvehiculo"><fmt:message key="vehicle" /></h:commandLink></li>
		      </ul>
		    </li>
		    <li class="dropdown">
		      <input type="checkbox" />
		      <a href="#" data-toggle="dropdown"><fmt:message key="reports" /></a>
		      <ul class="dropdown-menu">
		      	<li><h:commandLink id="clRUsuario" action="rusuario"><fmt:message key="user" /></h:commandLink></li>
		      	<li><h:commandLink id="clRCliente" action="rcliente"><fmt:message key="client" /></h:commandLink></li>
		        <li><h:commandLink id="clRVehiculo" action="rvehiculo"><fmt:message key="vehicle" /></h:commandLink></li>
		      </ul>
		    </li>
		  </ul>
		</div>
</h:form>


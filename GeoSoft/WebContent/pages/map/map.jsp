<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="java.util.List"%>
<%@ page import="com.geosoft.mbeans.MapaMBean"%>
<%@ page import="com.geosoft.beans.HistoricaDTO"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<f:view>
		<head>
			<!-- Javascrips -->
			<script src="http://maps.googleapis.com/maps/api/js?key=AIzaSyCa3bppSoyDM-uT3g99L3pzJ71h7BZd07g&sensor=false"></script>
			<script>
			function cargarVehiculos(){
				<%MapaMBean mapa = (MapaMBean) session.getAttribute("mapaMBean");
				if(mapa!=null){
					for(HistoricaDTO h : mapa.getListaMonitoreo()){%>
					vehiculos.push({placa: "<%=h.getVehiculo().getPlaca()%>", nroMotor: "<%=h.getVehiculo().getNroMotor()%>", 
						marca: "<%=h.getVehiculo().getMarca()%>", anio: "<%=h.getVehiculo().getAnio()%>", 
						modelo: "<%=h.getVehiculo().getModelo()%>", estado: "<%=h.getVehiculo().getEstado()%>", 
						descripcion: "<%=h.getVehiculo().getTipoVehiculo().getDescripcion()%>", latitud: "<%=h.getLatitud()%>", 
						longitud: "<%=h.getLongitud()%>", velocidad: "<%=h.getVelocidad()%>", 
						radio: "<%=h.getRadio()%>", maxFecha: "<%=h.getFecha()%>"});
				<%}}%>
				console.log(vehiculos);
				//vehiculos.push(v)	
			}
			</script>
		</head>
		<body onload="initialize()">
			<div id="map-canvas" class="canvas"></div>
			<div class="monitoreo">
				<h:form>
					<h:dataTable value="#{mapaMBean.listaMonitoreo}" var="lm">
						<h:column>
							<f:facet name="header"><h:outputText value="Placa" /></f:facet>
							<h:outputLabel value="#{lm.vehiculo.placa}" onclick="irAMarcador(#{lm.latitud},#{lm.longitud})" styleClass="link-button" ></h:outputLabel>
						</h:column>
						<h:column>
							<f:facet name="header"><h:outputText value="NroMotor" /></f:facet>
							<h:outputText value="#{lm.vehiculo.nroMotor}"></h:outputText>
						</h:column>
						<h:column>
							<f:facet name="header"><h:outputText value="Marca" /></f:facet>
							<h:outputText value="#{lm.vehiculo.marca}"></h:outputText>
						</h:column>
						<h:column>
							<f:facet name="header"><h:outputText value="Anio" /></f:facet>
							<h:outputText value="#{lm.vehiculo.anio}"></h:outputText>
						</h:column>
						<h:column>
							<f:facet name="header"><h:outputText value="Modelo" /></f:facet>
							<h:outputText value="#{lm.vehiculo.modelo}"></h:outputText>
						</h:column>
						<h:column>
							<f:facet name="header"><h:outputText value="Estado" /></f:facet>
							<h:outputText value="#{lm.vehiculo.estado}"></h:outputText>
						</h:column>
						<h:column>
							<f:facet name="header"><h:outputText value="Descripcion" /></f:facet>
							<h:outputText value="#{lm.vehiculo.tipoVehiculo.descripcion}"></h:outputText>
						</h:column>
						<h:column>
							<f:facet name="header"><h:outputText value="Latitud" /></f:facet>
							<h:outputText value="#{lm.latitud}"></h:outputText>
						</h:column>
						<h:column>
							<f:facet name="header"><h:outputText value="Longitud" /></f:facet>
							<h:outputText value="#{lm.longitud}"></h:outputText>
						</h:column>
						<h:column>
							<f:facet name="header"><h:outputText value="Velocidad" /></f:facet>
							<h:outputText value="#{lm.velocidad}"></h:outputText>
						</h:column>
						<h:column>
							<f:facet name="header"><h:outputText value="Radio" /></f:facet>
							<h:outputText value="#{lm.radio}"></h:outputText>
						</h:column>
						<h:column>
							<f:facet name="header"><h:outputText value="Fecha" /></f:facet>
							<h:outputText value="#{lm.fecha}"></h:outputText>
						</h:column>
					</h:dataTable>
				</h:form>
			</div>
		</body>
	</f:view>
</html>
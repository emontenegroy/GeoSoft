<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- RichFaces tag library declaration -->
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ page import="java.util.List"%>
<%@ page import="com.geosoft.mbeans.LoginMBean"%>
<%@ page import="com.geosoft.beans.HistoricaDTO"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<f:view>
		<head>
			<!-- Javascrips -->
			<script src="http://maps.googleapis.com/maps/api/js?key=AIzaSyCa3bppSoyDM-uT3g99L3pzJ71h7BZd07g&sensor=false"></script>
			<script>
			function cargarVehiculos(){
				<%LoginMBean mapa = (LoginMBean) session.getAttribute("loginMBean");
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
					<rich:dataTable value="#{loginMBean.listaMonitoreo}" var="lm2">
                  		<rich:column>
							<f:facet name="header"><h:outputText value="Placa" /></f:facet>
							<h:outputLabel value="#{lm2.vehiculo.placa}" onclick="irAMarcador(#{lm2.latitud},#{lm2.longitud})" styleClass="link-button" ></h:outputLabel>
						</rich:column>
						<rich:column>
							<f:facet name="header"><h:outputText value="NroMotor" /></f:facet>
							<h:outputText value="#{lm2.vehiculo.nroMotor}"></h:outputText>
						</rich:column>
						<rich:column>
							<f:facet name="header"><h:outputText value="Marca" /></f:facet>
							<h:outputText value="#{lm2.vehiculo.marca}"></h:outputText>
						</rich:column>
						<rich:column>
							<f:facet name="header"><h:outputText value="Anio" /></f:facet>
							<h:outputText value="#{lm2.vehiculo.anio}"></h:outputText>
						</rich:column>
						<rich:column>
							<f:facet name="header"><h:outputText value="Modelo" /></f:facet>
							<h:outputText value="#{lm2.vehiculo.modelo}"></h:outputText>
						</rich:column>
						<rich:column>
							<f:facet name="header"><h:outputText value="Estado" /></f:facet>
							<h:outputText value="#{lm2.vehiculo.estado}"></h:outputText>
						</rich:column>
						<rich:column>
							<f:facet name="header"><h:outputText value="Descripcion" /></f:facet>
							<h:outputText value="#{lm2.vehiculo.tipoVehiculo.descripcion}"></h:outputText>
						</rich:column>
						<rich:column>
							<f:facet name="header"><h:outputText value="Latitud" /></f:facet>
							<h:outputText value="#{lm2.latitud}"></h:outputText>
						</rich:column>
						<rich:column>
							<f:facet name="header"><h:outputText value="Longitud" /></f:facet>
							<h:outputText value="#{lm2.longitud}"></h:outputText>
						</rich:column>
						<rich:column>
							<f:facet name="header"><h:outputText value="Velocidad" /></f:facet>
							<h:outputText value="#{lm2.velocidad}"></h:outputText>
						</rich:column>
						<rich:column>
							<f:facet name="header"><h:outputText value="Radio" /></f:facet>
							<h:outputText value="#{lm2.radio}"></h:outputText>
						</rich:column>
						<rich:column>
							<f:facet name="header"><h:outputText value="Fecha" /></f:facet>
							<h:outputText value="#{lm2.fecha}"></h:outputText>
						</rich:column>
					</rich:dataTable>
				</h:form>
			</div>
		</body>
	</f:view>
</html>
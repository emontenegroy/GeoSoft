<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<f:view>
		<head>
			<!-- Javascrips -->
			<script src="http://maps.googleapis.com/maps/api/js?key=AIzaSyCa3bppSoyDM-uT3g99L3pzJ71h7BZd07g&sensor=false"></script>
		</head>
		<body onload="initialize()">
			<div class="map">
				<div id="map-canvas" class="map-canvas"></div>
				<div class="monitoreo">
					<h:form>
						<h:dataTable value="">
						
							<h:column>
							
							</h:column>
						
						</h:dataTable>
					</h:form>
				</div>
			</div>
		</body>
	</f:view>
</html>
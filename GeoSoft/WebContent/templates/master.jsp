<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<!-- META -->
		<title>GeoSoft - Software de Geolocalización Vehicular</title>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
		<meta name="description" content="" />

		<!-- CSS -->
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/normalize.css" media="all" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/kickstart.css" media="all" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css" media="all" /> 

		<!-- Javascript -->
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.11.2.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/kickstart.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/javascript.js"></script>
	</head>

	<body class="master">
		<f:view>
			<div class="page-header">
				<tiles:insertAttribute name="header" />	
			</div>
			<div class="page-menu">
				<tiles:insertAttribute name="menu" />
			</div>
			<div class="page-body">
				<tiles:insertAttribute name="body" />
			</div>
			<div class="page-footer">
				<tiles:insertAttribute name="footer" />
			</div>
		</f:view>
	</body>
</html>
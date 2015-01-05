//DOM Cargado
var idioma = true;
$(document).ready(function() {
	console.log("Hola");
	alert("a");
});
//DOM + Elementos Cargados
$(window).load(function() {
	if(idioma){
		$("#frmLogin\\:cmlBrowserLang").click();
		idioma=false;
		alert("c");
	}
	console.log("Adios");
	alert("b");
});
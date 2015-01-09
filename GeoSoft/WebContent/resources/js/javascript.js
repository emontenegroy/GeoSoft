/*Variables*/
var map;
var monitoreoArray = [];
var vehiculos = [];

//DOM Cargado
var idioma = true;
$(document).ready(function() {
	console.log("Hola");
	
});
//DOM + Elementos Cargados
$(window).load(function() {
	console.log("Adios");
});




/*Manejo de Mapas*/
function initialize() {
  console.log("initialize");
  cargarVehiculos();
	
  var mapOptions = {
    zoom: 8,
    center: new google.maps.LatLng(-10.379765224421455,-77.80517578125)
  };
  map = new google.maps.Map(document.getElementById('map-canvas'),
      mapOptions);
  
  refrescarMonitoreo();
}

/*Manejo de Monitoreo*/
function refrescarMonitoreo() {
	
	deleteOverlays(monitoreoArray);
	//llamar a lista for
	var latLng = new google.maps.LatLng(-10.379765224421455,-77.80517578125);
	var marker = crearMarker(latLng, {map:map,pintar:true});
		
	monitoreoArray.push(marker);
}

function crearMarker(pLatLng,opt_options ){
    //Parametros
    var options = opt_options || {};
    var map     = options['map'] || this.map;
    var nube     = options['nube'] || "";
    var icon     = options['icon'] || null;
    var pintar   = options['pintar'] || false;
    var abrir   = options['abrir'] || false;
    //Variables
    var infoWindow
    
    //Solo pintar si tiene posicion valida
    if(pLatLng!=null){
        //Crear Marcador Sin colocarlo al Mapa
        var marker = new google.maps.Marker({            
            position: pLatLng,
            draggable: false,
            icon : icon
        });
        if(nube!=""){
            infoWindow = new google.maps.InfoWindow({content: nube});
                google.maps.event.addListener(marker, 'click', function() {
                infoWindow.open(map,marker);
            });
            if(abrir)
                infoWindow.open(map,marker);
            
        }
        if(pintar)
            marker.setMap(map);
        
            
        return marker;
    }else
        return null;
}

function deleteOverlays(markersArray) {
    if(markersArray){
        var longitud = markersArray.length;
        for(var i=0; i<longitud; i++){
            try {
                markersArray[i].setMap(null);
            }catch(err){
            }            
        //Handle errors here
        }
      markersArray.length = 0;  
    }
}
function irALatLonBounds(arrayLatLong,opt_options){
    //Parametros
    var options = opt_options || {};
    var map     = options['map'] || this.map;
    //Variables
    var bounds = new google.maps.LatLngBounds();
    var longitud = arrayLatLong.length;

    for(var i = 0; i < longitud; i++)		  		  		  
      bounds.extend(arrayLatLong[i]);

    map.fitBounds(bounds);	
}
//google.maps.event.addDomListener(window, 'load', initialize);
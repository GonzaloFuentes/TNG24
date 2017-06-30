<%@ include file="/common/taglibs.jsp"%>
<title>Hoja de Ruta</title>
<script src="http://maps.googleapis.com/maps/api/js?key=AIzaSyDyxCvKrtb7cPFUsdQvZ8QCKegl-KrUtJ0"></script>
<script>
var geocoder;
  var i = new Array();
  
  function initialize(nro) {
    geocoder = new google.maps.Geocoder();
    var latlng = new google.maps.LatLng(-34.397, 54.644);
    var mapOptions = {
      zoom: 15,
      center: latlng
    }
    i[nro] = new google.maps.Map(document.getElementById('map' + nro), mapOptions);
  }

  function codeAddress(address,nro) {
	 initialize(nro)
     geocoder.geocode( { 'address': address}, function(results, status) {
      if (status == 'OK') {
        i[nro].setCenter(results[0].geometry.location);
        var marker = new google.maps.Marker({
            map: i[nro],
            position: results[0].geometry.location
        });
      } else {
        alert('Geocode was not successful for the following reason: ' + status);
      }
    });
  }
</script>

<div class="row">
	<div class="col-md-12">
		<h2>Hoja de ruta </h2>   
		<h4>Técnico: Juan García.</h4>
		<br>
	</div>
</div>
 <div class="row">
	<div class="col-md-12 col-sm-12">
		<div class="panel panel-info">
			<div class="panel-heading">
				10:00 - 11:00
			</div>
			<div class="panel-body">
			<p><strong>Presupuestar</strong>
			</br>
			</br><u>Nro Cliente:</u> 34
			</br><u>Contacto:</u> Juan García
			</br><u>Teléfono:</u> 4585-5548
			</br><u>Direccion:</u> Suipacha 750 - 4to C  
			</br><u>Barrio:</u> San Nicolás
			</br><u>Actividad:</u> Instalación cámaras.
			<div id="map1" style="width: 280px; height: 280px;"></div>
			
			<script type="text/javascript">
			codeAddress("Suipacha 750 Buenos Aires Argentina","1");
			</script>
			</p>
			</div>
			<div class="panel-footer">
			<a href="#" class="btn btn-primary">Presupuesto</a> &nbsp;&nbsp;
			<a href="#" class="btn btn-primary">Factura</a>&nbsp;&nbsp;
			<a href="#" class="btn btn-primary">Finalizar</a>
			</div>
		</div>
	</div>
</div>

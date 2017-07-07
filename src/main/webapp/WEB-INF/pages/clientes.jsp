<%@ include file="/common/taglibs.jsp"%>
<head>
<title>Clientes</title>
</head>

<div class="row">
	<div class="col-md-12">
		<h2>Clientes</h2>
	</div>
</div>
<div class="row">
	<div class="col-md-12">
		<!-- Advanced Tables -->
		<div class="panel panel-default">
			<c:if test="${clienteNuevo=='OK'}">
				<div class="alert alert-info alert-dismissable">
					<button type="button" class="close" data-dismiss="alert"
						aria-hidden="true">&times;</button>
					<strong> Cliente creado exitosamente.</strong>
				</div>
			</c:if>
			<div class="panel-heading">
				<button type="button" class="btn btn-primary btn-sm"
					data-toggle="modal" data-target="#nuevoCliente">Nuevo</button>
				<!-- Modal -->
				<div class="modal fade" id="nuevoCliente" tabindex="-1"
					role="dialog" aria-labelledby="myModalLabel">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
								<h4 class="modal-title" id="myModalLabel">Nuevo Cliente</h4>
							</div>
							<div class="modal-body">
								<div class="row">
									<div class="col-md-12">
										<form role="form" action="nuevoCliente" method="post">
											<div class="form-group">
												<label>Nombre</label>
												<input class="form-control" name="nombre" placeholder="Ej: Juan Domingo" required> 
												 <label>Apellido</label> 
												 <input class="form-control" name="apellido" placeholder="Heinz"  required> 
												 <label>TipoDocumento</label>
												 <select class="form-control" name="tipoDoc" required>
													<option value ="dni">DNI</option>
													<option value ="cuit">CUIT</option>
													<option value="ci">CI</option>
												</select>
												<label>Número</label>
												<input class="form-control" name="nroDoc" placeholder="Ej:12345678 o 20-123123123-2" required>
												<label>Teléfono</label> 
												<input class="form-control" name="telefono" placeholder="Ej:4560-2929" required> 
												<label>E-mail</label> 
												<input type="mail"class="form-control" name="mail" placeholder="uade@uade.edu.ar"  required> 
												<label>Calle</label>
												<input class="form-control" name="calle" placeholder="Ej: Pi y Margall" required > 
												<label>Número</label>
												<input class="form-control" name="numero" placeholder="Ej: 920" required > 
												<label>Piso</label>
												<input class="form-control" name="piso" placeholder="Ej:6" > 
												<label>Departamento</label>
												<input class="form-control" name="departamento" placeholder="Ej: D" >
												<label>Provincia</label>
												<input class="form-control" name="provincia" placeholder="Ej: CABA" required>
												<label>Ciudad</label>
												<input class="form-control" name="ciudad" placeholder="Ej: La Boca" required>
												<label>Código Postal</label>
												<input class="form-control" name="codigoPostal" placeholder="Ej: 1155" required>
											</div>
											<button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
											<button type="submit" class="btn btn-primary">Guardar</button>
										</form>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div> 
		 </div>
			<div class="panel-body">
				<div class="table-responsive">
					<table class="table table-striped table-bordered table-hover"
						id="dataTables-example">
						<thead>
							<tr>
								<th>Cliente</th>
								<th>Documento</th>
								<th>Telefono</th>
								<th>E-mail</th>
								<th>Direccion</th>
								<th>Accion</th>
							</tr>
						</thead>
						<tbody>
						     <c:if test="${not empty listaClientes}">
								<c:forEach var="cliente" items="${listaClientes}">
								<tr class="odd gradeX">
								<td>${cliente.apellido}, ${cliente.nombre}</td>
								<td>${cliente.tipoDoc}:${cliente.nroDoc}</td>
								<td>${cliente.telefono}</td>
								<td>${cliente.mail}</td>
								<td>
									${cliente.calle}, ${cliente.numero}&nbsp;${cliente.piso}&nbsp;${cliente.departamento},
								${cliente.ciudad}, ${cliente.provincia}, ${cliente.codigoPostal}
								</td>
								<td class="center">
								<form action="editarCliente" method="POST">
									<input type="hidden" name="idCliente" value="${cliente.idEnte}" />
									<a href="#" onclick="this.parentNode.submit()">
										<span class="glyphicon glyphicon-pencil" aria-hidden="true">
									</a>
								</form>
								<form action="eliminarCliente" method="POST">
									<input type="hidden" name="idCliente" value="${cliente.idEnte}" />
									<a href="#" onclick="this.parentNode.submit()">
										<span class="glyphicon glyphicon-remove" aria-hidden="true">
									</a>
								</form>
								</td>
							</tr>
								</c:forEach>
							</c:if>
							<tr class="odd gradeX">
								<td>Garcia, Juan</td>
								<td>DNI: 123123123</td>
								<td>4320-5844</td>
								<td>juangarcia@gmail.com</td>
								<td>Calle Numero Piso Departamento, Ciudad, Provincia, Codigo postal</td>
								<td class="center">
									<!--Editar --> <a href="editar_registro.html?id=4532"> <span
										class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
								</a>&nbsp; <!--Eliminar --> <a
									href="javascript: eliminar_registro('4532','','')"> <span
										class="glyphicon glyphicon-remove" aria-hidden="true"></span>
								</a>
								</td>
							</tr>
							<tr class="odd gradeX">
								<td>Garcia, Juan</td>
								<td>DNI: 123123123</td>
								<td>4320-5844</td>
								<td>juangarcia@gmail.com</td>
								<td>Calle Numero Piso Departamento, Ciudad, Provincia, Codigo postal</td>
								<td class="center">
									<!--Editar --> 
									<a href="editar_registro.html?id=4532"> 
									<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
								</a>&nbsp; 
								<!--Eliminar --> 
								<a href="#"> 
									<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
								</a>
								</td>
							</tr>
							<tr class="odd gradeX">
								<td>Garcia, Juan</td>
								<td>DNI: 123123123</td>
								<td>4320-5844</td>
								<td>juangarcia@gmail.com</td>
								<td>Calle Numero Piso Departamento, Ciudad, Provincia, Codigo postal</td>
								<td class="center">
									<!--Editar --> 
									<a href="editar_registro.html?id=4532"> 
									<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
								</a>&nbsp; 
								<!--Eliminar --> 
								<a href="#"> 
									<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
								</a>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<!--End Advanced Tables -->
	</div>
</div>

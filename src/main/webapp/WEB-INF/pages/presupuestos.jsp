<%@ include file="/common/taglibs.jsp"%>

<title>Presupuestos</title>
<div class="row">
	<div class="col-md-12">
		<h2>Presupuestos</h2>
	</div>
</div>
<div class="row">
	<div class="col-md-12">
		<!-- Advanced Tables -->
		<div class="panel panel-default">
			<div class="panel-heading">
				<!--Crear Presupuesto nuevo -->
				<a href="l"> <span class="glyphicon glyphicon-plus"
					aria-hidden="true"></span>&nbsp; Crear nuevo presupuesto
				</a>&nbsp;
			</div>
			<div class="panel-body">
				<thead>
					<div class="table-responsive">
						<div id="dataTables-example_wrapper"
							class="dataTables_wrapper form-inline" role="grid">
							<div class="row">
								<div class="col-sm-6">
									<div class="dataTables_length" id="dataTables-example_length">
										<label>Buscar: <input class="form-control input-sm"
											aria-controls="dataTables-example" type="search"></label>
									</div>
								</div>
								<div class="col-sm-6">
									<div id="dataTables-example_filter" class="dataTables_filter"></div>
								</div>
							</div>
							<table
								class="table table-striped table-bordered table-hover dataTable no-footer"
								id="dataTables-example"
								aria-describedby="dataTables-example_info">
								<tr role="row">
									<th class="sorting" tabindex="0" rowspan="1" colspan="1"
										style="width: 20px;">Fecha</th>
									<th class="sorting" tabindex="0" rowspan="1" colspan="1"
										style="width: 200px;">Nombre</th>
									<th class="sorting" tabindex="0" rowspan="1" colspan="1"
										style="width: 300px;">Dirección</th>
									<th class="sorting" tabindex="0" rowspan="1" colspan="1"
										style="width: 20px;">Estado</th>
									<th class="sorting" tabindex="0" rowspan="1" colspan="1"
										style="width: 6px;">Acción</th>
								</tr>
								</thead>
								<tbody>
									<tr class="gradeA odd">
										<td class="sorting_1">30/02/2017</td>
										<td class=" ">Mariano Smith</td>
										<td class=" ">Calle de Las Artes 345 - Capital</td>
										<td class="center ">Cerrado</td>
										<td class="center ">
											<!--Editar --> <a href=""><span
												class="glyphicon glyphicon-pencil" aria-hidden="true"></span></a>&nbsp;
											<!--Imprimir --> <a href=""><span
												class="glyphicon glyphicon-print" aria-hidden="true"></a>&nbsp;
											<!--Eliminar --> <a href=""><span
												class="glyphicon glyphicon-remove" aria-hidden="true"></span></a>
										</td>
									</tr>
									<tr class="gradeA even">
										<td class="sorting_1">30/02/2017</td>
										<td class=" ">Mariano Smith</td>
										<td class=" ">Calle de Las Artes 345 - Capital</td>
										<td class="center ">Cerrado</td>
										<td class="center ">
											<!--Editar --> <a href=""><span
												class="glyphicon glyphicon-pencil" aria-hidden="true"></span></a>&nbsp;
											<!--Imprimir --> <a href=""><span
												class="glyphicon glyphicon-print" aria-hidden="true"></a>&nbsp;
											<!--Eliminar --> <a href=""><span
												class="glyphicon glyphicon-remove" aria-hidden="true"></span></a>
										</td>
									</tr>
								</tbody>
							</table>
						</div>

					</div>
			</div>
			<!--End Advanced Tables -->
		</div>
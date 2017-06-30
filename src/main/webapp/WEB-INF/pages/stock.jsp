 <%@ include file="/common/taglibs.jsp"%>
 <title>Stock</title>
 <div class="row">
                    <div class="col-md-12">
                     <h2>Stock</h2>   
                    </div>
                </div>
                 <hr />
        <div class="row">
                <div class="col-md-12">
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                             <button type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#retirarPiezasModal">
                              Retirar 
                            </button>
                             <button type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#devolverPiezasModal">
                              Devolver
                            </button>

                            <!-- Modal -->
                            <div class="modal fade" id="retirarPiezasModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                              <div class="modal-dialog" role="document">
                                <div class="modal-content">
                                  <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                    <h4 class="modal-title" id="myModalLabel">Nuevo Usuario</h4>
                                  </div>
                                  <div class="modal-body">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <form role="form">
                                                <div class="form-group">
                                                    <label>Nombre</label>
                                                    <input class="form-control">
                                                    <label>Apellido</label>
                                                    <input class="form-control">
                                                     <label>DNI</label>
                                                    <input class="form-control">
                                                     <label>Tel&eacute;fono</label>
                                                    <input class="form-control">
                                                    <label>E-mail</label>
                                                    <input class="form-control">
                                                    <lclass="form-control">
                                             </div>
                                            </form>
                                        </div>
                                    </div>
                                  </div>
                                  <div class="modal-footer">
                                    <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
                                    <button type="button" class="btn btn-primary">Guardar</button>
                                  </div>
                                </div>
                              </div>
                            </div> <!-- Modal retirar-->
                            <!-- ModalDevolver -->
                            <div class="modal fade" id="retirarPiezasModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                              <div class="modal-dialog" role="document">
                                <div class="modal-content">
                                  <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                    <h4 class="modal-title" id="myModalLabel">Nuevo Usuario</h4>
                                  </div>
                                  <div class="modal-body">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <form role="form">
                                                <div class="form-group">
                                                    <label>Nombre</label>
                                                    <input class="form-control">
                                                    <label>Apellido</label>
                                                    <input class="form-control">
                                                     <label>DNI</label>
                                                    <input class="form-control">
                                                     <label>Tel&eacute;fono</label>
                                                    <input class="form-control">
                                                    <label>E-mail</label>
                                                    <input class="form-control">
                                                    <lclass="form-control">
                                             </div>
                                            </form>
                                        </div>
                                    </div>
                                  </div>
                                  <div class="modal-footer">
                                    <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
                                    <button type="button" class="btn btn-primary">Guardar</button>
                                  </div>
                                </div>
                              </div>
                            </div> <!-- Modal Devolver-->

                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <div id="dataTables-example_wrapper" class="dataTables_wrapper form-inline" role="grid"><div class="row"><div class="col-sm-12">
                                <table class="table table-striped table-bordered table-hover dataTable no-footer" id="dataTables-example" aria-describedby="dataTables-example_info">
                                    <thead><tr role="row">
                                        <th class="sorting" tabindex="0" rowspan="1" colspan="1" style="width: 30px;">Código</th>
                                        <th class="sorting" tabindex="0" rowspan="1" colspan="1" style="width: 550px;">Descripción</th>
                                        <th class="sorting" tabindex="0" rowspan="1" colspan="1" style="width: 30px;">Precio</th>
                                        <th class="sorting" tabindex="0" rowspan="1" colspan="1" style="width: 30px;">Cantidad</th>
                                        <th class="sorting" tabindex="0" rowspan="1" colspan="1" style="width: 30px;">Pto Pedido</th>
                                        <th class="sorting" tabindex="0" rowspan="1" colspan="1" style="width: 30px;">SN Pedido</th>
                                        <th class="sorting" tabindex="0" rowspan="1" colspan="1" style="width: 30px;">Estado</th>
                                        <th class="sorting" tabindex="0" rowspan="1" colspan="1" style="width: 10px;">Acción</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                        <tr class="gradeA odd">
                                            <td class="sorting_1">CAB-001</td>
                                            <td class=" ">Cable UTP Cat 5e Exterior Negro - Rollo x 100 Mts</td>
                                            <td class=" ">560</td>
                                            <td class="center ">5</td>
                                            <td class="center ">2</td>
                                            <td class="center ">NO</td>
                                            <td class="center ">-</td>
                                            <td class="center ">
                                                <!--Editar -->
                                                <a href="editar_registro.html?id=4532">
                                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                                </a>&nbsp;
                                                <!--Eliminar -->
                                                <a href="javascript: eliminar_registro('4532','','')">
                                                   <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                                                </a>
                                            </td>
                                        </tr><tr class="gradeA even">
                                            <td class="sorting_1">CAB-002</td>
                                            <td class=" ">Cable UTP Cat 5e Exteior Negro Doble Vaina - Rollo x 100M</td>
                                            <td class=" ">578</td>
                                            <td class="center ">4</td>
                                            <td class="center ">1</td>
                                            <td class="center ">NO</td>
                                            <td class="center ">-</td>
                                           <td class="center ">
                                                <!--Editar -->
                                                <a href="editar_registro.html?id=4532">
                                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                                </a>&nbsp;
                                                <!--Eliminar -->
                                                <a href="javascript: eliminar_registro('4532','','')">
                                                   <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                                                </a>
                                            </td>
                                        </tr>
                                        <tr class="gradeA odd">
                                            <td class="sorting_1">CAB-003</td>
                                            <td class=" ">Cable UTP Cat 5e Exterior Negro - Bobina x 305 Mts</td>
                                            <td class=" ">1000</td>
                                            <td class="center ">3</td>
                                            <td class="center ">2</td>
                                            <td class="center ">NO</td>
                                            <td class="center ">-</td>
                                            <td class="center ">
                                                <!--Editar -->
                                                <a href="editar_registro.html?id=4532">
                                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                                </a>&nbsp;
                                                <!--Eliminar -->
                                                <a href="javascript: eliminar_registro('4532','','')">
                                                   <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                                                </a>
                                            </td>
                                        </tr><tr class="gradeA even">
                                            <td class="sorting_1">CAB-004</td>
                                            <td class=" ">Cable UTP Cat 5e Exterior Negro Doble Vaina - Bobina x 305 Mts</td>
                                            <td class=" ">1300</td>
                                            <td class="center ">1</td>
                                            <td class="center ">3</td>
                                            <td class="center ">SI</td>
                                            <td class="center ">Pedido</td>
                                            <td class="center ">
                                                <!--Editar -->
                                                <a href="editar_registro.html?id=4532">
                                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                                </a>&nbsp;
                                                <!--Eliminar -->
                                                <a href="javascript: eliminar_registro('4532','','')">
                                                   <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                                                </a>
                                            </td>
                                        </tr>

                                        <tr class="gradeA odd">
                                            <td class="sorting_1">CAB-005</td>
                                            <td class=" ">Cable FTP Cat 5e Blindado C/Portante Acero - Rollo x 100m</td>
                                            <td class=" ">890</td>
                                            <td class="center ">3</td>
                                            <td class="center ">1</td>
                                            <td class="center ">NO</td>
                                            <td class="center ">-</td>
                                           <td class="center ">
                                                <!--Editar -->
                                                <a href="editar_registro.html?id=4532">
                                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                                </a>&nbsp;
                                                <!--Eliminar -->
                                                <a href="javascript: eliminar_registro('4532','','')">
                                                   <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                                                </a>
                                            </td>
                                        </tr><tr class="gradeA even">
                                            <td class="sorting_1">CAM-001</td>
                                            <td class=" ">Camara de Seguridad IP Motorizada P2P Wifi Visión Nocturna</td>
                                            <td class=" ">1300</td>
                                            <td class="center ">20</td>
                                            <td class="center ">10</td>
                                            <td class="center ">NO</td>
                                            <td class="center ">-</td>
                                            <td class="center ">
                                                <!--Editar -->
                                                <a href="editar_registro.html?id=4532">
                                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                                </a>&nbsp;
                                                <!--Eliminar -->
                                                <a href="javascript: eliminar_registro('4532','','')">
                                                   <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                                                </a>
                                            </td>
                                        </tr>

                                            <tr class="gradeA odd">
                                            <td class="sorting_1">CAB-001</td>
                                            <td class=" ">Cable UTP Cat 5e Exterior Negro - Rollo x 100 Mts</td>
                                            <td class=" ">560</td>
                                            <td class="center ">5</td>
                                            <td class="center ">2</td>
                                            <td class="center ">NO</td>
                                            <td class="center ">-</td>
                                            <td class="center ">
                                                <!--Editar -->
                                                <a href="editar_registro.html?id=4532">
                                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                                </a>&nbsp;
                                                <!--Eliminar -->
                                                <a href="javascript: eliminar_registro('4532','','')">
                                                   <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                                                </a>
                                            </td>
                                        </tr><tr class="gradeA even">
                                            <td class="sorting_1">CAB-002</td>
                                            <td class=" ">Cable UTP Cat 5e Exteior Negro Doble Vaina - Rollo x 100M</td>
                                            <td class=" ">578</td>
                                            <td class="center ">4</td>
                                            <td class="center ">1</td>
                                            <td class="center ">NO</td>
                                            <td class="center ">-</td>
                                            <td class="center ">
                                                <!--Editar -->
                                                <a href="editar_registro.html?id=4532">
                                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                                </a>&nbsp;
                                                <!--Eliminar -->
                                                <a href="javascript: eliminar_registro('4532','','')">
                                                   <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                                                </a>
                                            </td>
                                        </tr>
                                        <tr class="gradeA odd">
                                            <td class="sorting_1">CAB-003</td>
                                            <td class=" ">Cable UTP Cat 5e Exterior Negro - Bobina x 305 Mts</td>
                                            <td class=" ">1000</td>
                                            <td class="center ">3</td>
                                            <td class="center ">2</td>
                                            <td class="center ">NO</td>
                                            <td class="center ">-</td>
                                            <td class="center ">
                                                <!--Editar -->
                                                <a href="editar_registro.html?id=4532">
                                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                                </a>&nbsp;
                                                <!--Eliminar -->
                                                <a href="javascript: eliminar_registro('4532','','')">
                                                   <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                                                </a>
                                            </td>
                                        </tr><tr class="gradeA even">
                                            <td class="sorting_1">CAB-004</td>
                                            <td class=" ">Cable UTP Cat 5e Exterior Negro Doble Vaina - Bobina x 305 Mts</td>
                                            <td class=" ">1300</td>
                                            <td class="center ">1</td>
                                            <td class="center ">3</td>
                                            <td class="center ">SI</td>
                                            <td class="center ">Pedido</td>
                                            <td class="center ">
                                                <!--Editar -->
                                                <a href="editar_registro.html?id=4532">
                                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                                </a>&nbsp;
                                                <!--Eliminar -->
                                                <a href="javascript: eliminar_registro('4532','','')">
                                                   <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                                                </a>
                                            </td>
                                        </tr>

                                        <tr class="gradeA odd">
                                            <td class="sorting_1">CAB-005</td>
                                            <td class=" ">Cable FTP Cat 5e Blindado C/Portante Acero - Rollo x 100m</td>
                                            <td class=" ">890</td>
                                            <td class="center ">3</td>
                                            <td class="center ">1</td>
                                            <td class="center ">NO</td>
                                            <td class="center ">-</td>
                                            <td class="center ">
                                                <!--Editar -->
                                                <a href="editar_registro.html?id=4532">
                                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                                </a>&nbsp;
                                                <!--Eliminar -->
                                                <a href="javascript: eliminar_registro('4532','','')">
                                                   <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                                                </a>
                                            </td>
                                        </tr><tr class="gradeA even">
                                            <td class="sorting_1">CAM-001</td>
                                            <td class=" ">Camara de Seguridad IP Motorizada P2P Wifi Visión Nocturna</td>
                                            <td class=" ">1300</td>
                                            <td class="center ">20</td>
                                            <td class="center ">10</td>
                                            <td class="center ">NO</td>
                                            <td class="center ">-</td>
                                            <td class="center ">
                                                <!--Editar -->
                                                <a href="editar_registro.html?id=4532">
                                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                                </a>&nbsp;
                                                <!--Eliminar -->
                                                <a href="javascript: eliminar_registro('4532','','')">
                                                   <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                                                </a>
                                            </td>
                                        </tr>
                                        <tr class="gradeA odd">
                                            <td class="sorting_1">CAB-001</td>
                                            <td class=" ">Cable UTP Cat 5e Exterior Negro - Rollo x 100 Mts</td>
                                            <td class=" ">560</td>
                                            <td class="center ">5</td>
                                            <td class="center ">2</td>
                                            <td class="center ">NO</td>
                                            <td class="center ">-</td>
                                            <td class="center ">
                                                <!--Editar -->
                                                <a href="editar_registro.html?id=4532">
                                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                                </a>&nbsp;
                                                <!--Eliminar -->
                                                <a href="javascript: eliminar_registro('4532','','')">
                                                   <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                                                </a>
                                            </td>
                                        </tr><tr class="gradeA even">
                                            <td class="sorting_1">CAB-002</td>
                                            <td class=" ">Cable UTP Cat 5e Exteior Negro Doble Vaina - Rollo x 100M</td>
                                            <td class=" ">578</td>
                                            <td class="center ">4</td>
                                            <td class="center ">1</td>
                                            <td class="center ">NO</td>
                                            <td class="center ">-</td>
                                           <td class="center ">
                                                <!--Editar -->
                                                <a href="editar_registro.html?id=4532">
                                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                                </a>&nbsp;
                                                <!--Eliminar -->
                                                <a href="javascript: eliminar_registro('4532','','')">
                                                   <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                                                </a>
                                            </td>
                                        </tr>
                                        <tr class="gradeA odd">
                                            <td class="sorting_1">CAB-003</td>
                                            <td class=" ">Cable UTP Cat 5e Exterior Negro - Bobina x 305 Mts</td>
                                            <td class=" ">1000</td>
                                            <td class="center ">3</td>
                                            <td class="center ">2</td>
                                            <td class="center ">NO</td>
                                            <td class="center ">-</td>
                                            <td class="center ">
                                                <!--Editar -->
                                                <a href="editar_registro.html?id=4532">
                                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                                </a>&nbsp;
                                                <!--Eliminar -->
                                                <a href="javascript: eliminar_registro('4532','','')">
                                                   <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                                                </a>
                                            </td>
                                        </tr>                                       
                                    </tbody>
                                </table>
                            </div>
                            
                        </div>

                            </div>
                            
                        </div>
                    </div>
                    <!--End Advanced Tables -->
                </div>
            </div>
                
          
         
        </div>
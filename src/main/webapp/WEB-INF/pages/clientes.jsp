<%@ include file="/common/taglibs.jsp"%>
<head>
    <title>Clientes</title>
</head>

<div class="col-sm-3">
    <h2><fmt:message key="userForm.title"/></h2>
    <p>Please fill in user's information.</p>
</div>


<form method="post" id="clientesForm" action="clientesSuccess" class="form-signin" autocomplete="off">

    <h2 class="form-signin-heading">Clientes</h2>

    <label>Nombre</label>
    <input type="text" name="nombre" id="nombre" class="input-block-level"
           placeholder="Username" required tabindex="1">
    <label>Apellido</label>
    <br>
    <input type="text" name="apellido" id="apellido" class="input-block-level"
           placeholder="Username" required tabindex="2">

     <input type="submit" class="btn btn-large btn-success" name="login" id="login" tabindex="4" value="Submit Cliente">
</form>



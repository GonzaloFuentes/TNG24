<%@ include file="/common/taglibs.jsp"%>

<title>Iniciar Sesión</title>
<body id="login">
<div class="row">
	<div class="col-md-6 col-md-offset-3">
	<c:if test="${param.error != null}">
	    <div class="alert alert-error alert-dismissable">
	        ${sessionScope.SPRING_SECURITY_LAST_EXCEPTION.message}
	    </div>
	</c:if>
		<form method="post" id="loginForm" action="<c:url value='/j_security_check'/>" class="form-signin" autocomplete="off">
			  <div class="form-group">
			    <label for="exampleInputEmail1">Usuario</label>
			    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="Usuario" name="j_username" id="j_username" placeholder="Usuario" required tabindex="1">
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">Contraseña</label>
			    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Contraseña" name="j_password" id="j_password" placeholder="Contraseña" required  tabindex="2">
			  </div>
			  <div class="checkbox">
			    <label>
			      <input type="checkbox" class="checkbox" name="_spring_security_remember_me" id="rememberMe" tabindex="3"/>Recordarme
			    </label>
			  </div>
			  <button type="submit" class="btn btn-large btn-success" name="login" id="login" tabindex="4"> Iniciar Sesión</button>
		</form>
	</div>
</div>
<script type="text/javascript">
    $(document).ready(function() {
        $("input[type='text']:visible:enabled:first", document.forms['loginForm']).focus();
    });
</script>

</body>


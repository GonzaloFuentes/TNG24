<%@ include file="/common/taglibs.jsp"%>

<title>Iniciar Sesi�n</title>
<body id="login">
	<div class="row">
		<div class="col-md-6 col-md-offset-3">
			<div class="well">
				<c:if test="${param.error != null}">
					<div class="alert alert-danger alert-dismissable">
						<button type="button" class="close" data-dismiss="alert"
							aria-hidden="true">&times;</button>
						<strong> Credenciales Invalidas</strong>
					</div>
				</c:if>
				<form method="post" id="loginForm"
					action="<c:url value='/j_security_check'/>" class="form-signin"
					autocomplete="off">
					<div class="form-group">
						<label for="exampleInputEmail1">Usuario</label> <input type="text"
							class="form-control" id="usuario" placeholder="Usuario"
							name="j_username" id="j_username" placeholder="Usuario" required
							tabindex="1">
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Contrase�a</label> <input
							type="password" class="form-control" id="password"
							placeholder="Contrase�a" name="j_password" id="j_password"
							placeholder="Contrase�a" required tabindex="2">
					</div>
					<div class="checkbox">
						<label> <input type="checkbox" class="checkbox"
							name="_spring_security_remember_me" id="rememberMe" tabindex="3" />Recordarme
						</label>
					</div>
					<button type="submit" class="btn btn-large btn-success"
						name="login" id="login" tabindex="4">Iniciar Sesi�n</button>
				</form>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		$(document).ready(
				function() {
					$("input[type='text']:visible:enabled:first",
							document.forms['loginForm']).focus();
				});
	</script>

</body>


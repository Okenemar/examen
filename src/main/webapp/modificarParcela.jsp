<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<div class="container">
		<div class="form-container">
			<form method="POST" action="ModificarParcela">
				<p class="fw-bold">
					Id: ${parcela.id } <input type="hidden" name="id"
						value="${parcela.id }" /> <br>
				</p>
				<p class="fw-bold">
					Numero: <input type="text" name="numero"
						value="${parcela.numero }" /> <br>
				</p>

				<p class="fw-bold">
					M2: <input type="text" name="m_cuadrados" value="${parcela.m_cuadrados}" />
					<br>
				</p>
				<br>
				<p class="fw-bold">
					Precio: <input type="text" name="precio_dia"
						value="${parcela.precio_dia}" /> <br>
				</p>
				<input class="btn btn-primary" type="submit" value="Modificar" name="modificar" />
				</form>
				</div>
				</div>
				
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="conceptosAvanzados.CalcularSeccion" %>
<%@ page import="conceptosAvanzados.Operaciones" %>

<%

	double[] valores = {60000, 60000, 83333, 103333, 123333, 164000, 205000, 217500, 222500, 230000, 283333, 290000, 558000};
	int indice = 1;
	String texto = "";
	
	CalcularSeccion objetoPruebas = new CalcularSeccion();
	objetoPruebas.setValores(valores);

	objetoPruebas.CalcularSisones();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
		<title>Taller 4</title>
	</head>
	<body>
		
		<div class="container">
			<h1 class="text-center">Taller 4</h1>
			<div class="panel panel-default">
				<div class="panel-heading text-center">Valores de Entrada</div>
				<table class="table">
					<thead>
						<tr>
							<%
							int total = valores.length;
							for(int i = 0; i < total ;i++)
							{
							%>
										<th>
							<%
								texto += "valor " + (i+1);
							%>
							<%= texto %>
							</th>
							<%
							texto ="";
							}
							%>
						</tr>
					<thead>
					<tbody>
						<tr>
							<%
							for(double valor : valores)
							{
							%>
								<td>
							<%= valor %>
							
								</td>
							<%
							}
							%>
						</tr>
					</tbody>
				</table>
			</div>
			
			<div class="panel panel-default">
				<div class="panel-heading text-center">Resultados</div>
				<table class="table">
					<thead>
						<tr>
							<th class="text-center">SV</th>
							<th class="text-center">S</th>
							<th class="text-center">M</th>
							<th class="text-center">L</th>
							<th class="text-center">VL</th>
						</tr>
					<thead>
					<tbody>
						<tr>						
							<td class="text-center"><%= objetoPruebas.getVS() %></td>
							<td class="text-center"><%= objetoPruebas.getS() %></td>
							<td class="text-center"><%= objetoPruebas.getM() %></td>
							<td class="text-center"><%= objetoPruebas.getL() %></td>
							<td class="text-center"><%= objetoPruebas.getVL() %></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</body>
</html>
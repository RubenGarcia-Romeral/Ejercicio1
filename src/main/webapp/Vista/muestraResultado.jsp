
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body style="background-color: #ccffff">
        <h1 style="font-family: Arial; color: #00cccc;">Confirmar</h1>
        
        <br>
        
        <% request.getAttribute("calcular"); %>
        <p style="font-family: Arial;">Importe: ${ calcular.importe }.</p>
        
        <button style="" onclick="alert('Gracias por reservar en nuestro hotel!')">Hacer reserva</button>
    </body>
</html>
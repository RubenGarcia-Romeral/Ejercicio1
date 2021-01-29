  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body style="background-color: #ccffff">
        <h1 style="font-family: Arial; color: #00cccc; text-align: center;" >Hotel IES Juan bosco</h1>
        <br>
        <div style="background-color: #0066ff; width: 300px; height: 195px; margin-left: auto; margin-right: auto; border-radius: 15px">
        <form action="servletCalcular" style="text-align: center; ">
            <br>
            Entrada: <input type="Date" name="fechaEnt"><br><br>
            Salida: <input type="Date" name="fechaSal"><br><br>
            <select name="tipo">
                <option value="normal">Normal</option>
                <option value="superior">Premium</option>
            </select>
            <br>
            <br>
            <br>
            <input type="submit" value="Introducir datos" style="border-radius: 10px;">
            </div>
        </form>
    </body>
</html>
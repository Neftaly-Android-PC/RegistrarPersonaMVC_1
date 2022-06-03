<%-- 
    Document   : SalarioTrabajador
    Created on : 19-may-2022, 9:02:23
    Author     : ITCA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    <center><h1>Datos del Trabajador</h1>
        
        <form action='SalarioTrabajador.jsp' method="post">
            <table border='5' width='60%'>
                <tr>
                    <th>Nombres Trabajador</th>
                    <td><input type='text' name='nombre' size='40' maxlength="40"></td>
                </tr>
                <tr>
                    <th>Apellidos Trabajador</th>
                    <td><input type='text' name='apellido' size='30' maxlength="30"></td>
                </tr>
                <tr>
                    <th>Horas Trabajadas</th>
                    <td><input type='text' name='ht' size='10' maxlength="10"></td>
                </tr>
                <tr>
                    <th>Pago por Hora</th>
                    <td><input type='text' name='ph' size='10' maxlength="10"></td>
                </tr>
                <tr>
                    <td colspan='2' align='center'>
                        <input type='submit' name='enviar'  value='enviar'>
                        <input type='reset' name='reset'>
                    </td>
                </tr>
            </table>
        </form>
    </center>
    </body>
</html>

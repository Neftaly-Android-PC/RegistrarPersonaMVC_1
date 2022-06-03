<%-- 
    Document   : SalarioTrabajador1
    Created on : 19-may-2022, 9:19:16
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
        
        <%
            String nombres = request.getParameter("nombre");
            String apellidos = request.getParameter("apellido");
            double ht = Double.parseDouble(request.getParameter("ht"));
            double ph = Double.parseDouble(request.getParameter("ph"));
            String bt = request.getParameter("submit");
            
            double salario = 0;
            double descuento = 0;
            
            
            if(nombres!=null){
                
                salario = ht * ph;
                descuento = salario * 0.1;
                salario = salario - descuento;
                System.out.print(salario);
                System.out.print(descuento);
                
            }else{
                out.print("<h1>Debe completar el formulario</h1>");
                out.print("<form action='SalarioTrabajador.jsp' method='post'>");
                out.print("<input type='submit' value='Regresar'>");
                out.print("</form>");
            }
        %>
        
    <center>
        <h1>Datos del Trabajador</h1>
        
        <table border='0' width='50%'>
            <tr>
            <th>Nombres del Trabajador:</th>
            <td> <%= 4 %> </td>
            </tr>
            <tr>
            <th>Apellidos del Trabajador:</th>
            <td> <%= 4 %> </td>
            </tr>
            
        </table>
            
            <h1>Total a pagar:</h1>
            
            <table border='0' width='50%'>
                <tr>
                    <th>Total a pagar:</th>
                    <td><%= salario %></td>
                </tr>
                <tr>
                    <th>Descuento (Renta):</th>
                    <td><%= descuento %></td>
                </tr>
                            
            </table>
    </center>
    </body>
</html>

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SalarioTrabajador1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("        \n");
      out.write("    <center>\n");
      out.write("        <h1>Datos del Trabajador</h1>\n");
      out.write("        \n");
      out.write("        <table border='0' width='50%'>\n");
      out.write("            <tr>\n");
      out.write("            <th>Nombres del Trabajador:</th>\n");
      out.write("            <td> ");
      out.print( 4 );
      out.write(" </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("            <th>Apellidos del Trabajador:</th>\n");
      out.write("            <td> ");
      out.print( 4 );
      out.write(" </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("            \n");
      out.write("            <h1>Total a pagar:</h1>\n");
      out.write("            \n");
      out.write("            <table border='0' width='50%'>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Total a pagar:</th>\n");
      out.write("                    <td>");
      out.print( salario );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Descuento (Renta):</th>\n");
      out.write("                    <td>");
      out.print( descuento );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                            \n");
      out.write("            </table>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

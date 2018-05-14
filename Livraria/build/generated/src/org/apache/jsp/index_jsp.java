package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.livraria.dominio.Livro;
import java.util.List;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Livros</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Livros</h1>\n");
      out.write("        \n");
      out.write("        <form action='excluir.jsp'>\n");
      out.write("            <div>\n");
      out.write("                <a href='inserir.jsp'><input type=\"button\" name=\"inserir\" id=\"inserir\" value=\" Inserir \"></a>\n");
      out.write("                <input type='submit' name='excluir' value=' Excluir ' />\n");
      out.write("            </div>\n");
      out.write("            <br />\n");
      out.write("            <table border='1'>\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th></th><th>Título</th><th>Ano</th><th>Edição</th><th>ISBN</th><th>Páginas</th><th>Sinopse</th><th>Status</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        List<Livro> livros = (List<Livro>) request.getAttribute("livrosDoBanco"); // Object.
                        if (null != livros) {
                            for (Livro livro : livros) {
                                out.println("<tr>");
                                out.println("<td><input type='checkbox' name='id' value='" + livro.getIdLivro()+ "' /></td>");
                                out.println("<td><a href='PreAtualizarLivro?id=" + livro.getIdLivro() + "'>" + livro.getTitulo() + "</a></td>");
                                out.println("<td>" + livro.getAno()+ "</td>");
                                out.println("<td>" + livro.getEdicao()+ "</td>");
                                out.println("<td>" + livro.getISBN()+ "</td>");
                                out.println("<td>" + livro.getPaginas()+ "</td>");
                                out.println("<td>" + livro.getSinopse()+ "</td>");
                                out.println("<td>" + livro.getStatus()+ "</td>");
                                out.println("</tr>");
                            }
                        } else {
                    
      out.write("\n");
      out.write("                    <tr><td colspan=\"4\"><a href=\"Livros\">Clique aqui para ver os dados.</a></td></tr>\n");
      out.write("                    ");

                        } // Fim dor if(null != pessoas)
                    
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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

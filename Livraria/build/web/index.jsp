<%-- 
    Document   : index
    Author     : Helio Kinoshita
--%>


<%@page import="br.com.livraria.dominio.Livro"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Livros</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="style/bootstrap/css/bootstrap.css">
    </head>
    <body>
        <div class="container">	
            <h1>Livros</h1>
            <form action='excluir.jsp'>
                <div>
                    <a href='inserir.jsp'><input type="button" class ="btn btn-primary" name="inserir" id="inserir" value=" Inserir "></a>
                    <input type='submit' class="btn" name='excluir' value=' Excluir ' />
                </div>
                <br />
                <div class="table-responsive">
                    <table class="table table-striped">
                    <thead>
                        <tr>
                            <th></th><th>Título</th><th>Ano</th><th>Edição</th><th>ISBN</th><th>Páginas</th><th>Editora</th><th>Sinopse</th><th>Status</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
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
                                    out.println("<td>" + livro.getEditora()+ "</td>");
                                    out.println("<td>" + livro.getSinopse()+ "</td>");
                                    out.println("<td>" + livro.getStatus()+ "</td>");
                                    out.println("</tr>");
                                }
                            } else {
                        %>
                        <tr><td colspan="4"><a href="Livros">Clique aqui para ver os dados.</a></td></tr>
                        <%
                            } // Fim dor if(null != pessoas)
                        %>
                    </tbody>
                </table>
                </div>
            </form>
        </div>
               
	<script src="style/bootstrap/js/jquery.js"></script>
        <script src="style/bootstrap/js/popper.js"></script>
        <script src="style/bootstrap/js/bootstrapjs"></script>
    </body>
</html>
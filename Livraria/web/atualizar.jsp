<%-- 
    Document   : atualizar
    Author     : Helio Kinoshita
--%>

<%@page import="br.com.livraria.dominio.Livro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Atualizar Livro</title>
    </head>
    <body>
        <h1>Atualizar Livro</h1>
        <%
            Livro livro = (Livro) request.getAttribute("livro");
        %>
        <form action='AtualizarLivro'>
            <input type='hidden' name='id' value='<%= livro.getIdLivro()%>' /><br />
            <label for='titulo'>Título: </label><br />
            <input type='text' name='titulo' id='titulo' value='<%= livro.getTitulo() %>' /><br /> 
            <label for="ano">Ano: </label><br />
            <input type='text' name='ano' id='ano'  value='<%= livro.getAno() %>' /><br />           
            <label for="edicao">Edição: </label><br />
            <input type='text' name='edicao' id='edicao'  value='<%= livro.getEdicao()%>' /><br />
            <label for="isbn">ISBN: </label><br />
            <input type='text' name='isbn' id='isbn'  value='<%= livro.getISBN()%>' /><br />
            <label for="paginas">Páginas: </label><br />
            <input type='text' name='paginas' id='paginas'  value='<%= livro.getPaginas()%>' /><br />
            <label for="sinopse">Sinopse: </label><br />
            <input type='text' name='sinopse' id='sinopse'  value='<%= livro.getSinopse() %>' /><br />
            <label for="status">Status: </label><br />
            <input type='text' name='status' id='status'  value='<%= livro.getStatus()%>' /><br />
            <input type='submit' name='atualizar' value='Atualizar' />
            <a href='Livros'><input type="button" name="cancelar" id="cancelar" value="Cancelar"></a>
        </form>
    </body>
</html>

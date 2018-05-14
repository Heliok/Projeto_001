<%-- 
    Document   : inserir
    Created on : 09/05/2018, 11:50:33
    Author     : Helio
--%>

<%@page import="br.com.livraria.dominio.Livro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Cadastrar Livro</title>
    </head>
    <body>
        <h1>Cadastrar Livro</h1>
        <%
            Livro livro = (Livro) request.getAttribute("livro");
        %>
        <form action='InserirLivro'>
            <label for='titulo'>Título: </label><br />
            <input type='text' name='titulo' id='titulo' /><br /> 
            <label for="ano">Ano: </label><br />
            <input type='text' name='ano' id='ano'/><br />           
            <label for="edicao">Edição: </label><br />
            <input type='text' name='edicao' id='edicao' /><br />
            <label for="isbn">ISBN: </label><br />
            <input type='text' name='isbn' id='isbn' /><br />
            <label for="paginas">Páginas: </label><br />
            <input type='text' name='paginas' id='paginas' /><br />
            <label for="sinopse">Sinopse: </label><br />
            <input type='text' name='sinopse' id='sinopse' /><br />
            <label for="status">Status: </label><br />
            <input type='text' name='status' id='status' /><br />
            <label for="data">Data: </label><br />
            <input type='text' name='data' id='data' /><br />
            <input type='submit' name='inserir' value='Salvar' />
            <a href='Livros'><input type="button" name="cancelar" id="cancelar" value="Cancelar"></a>
        </form>
    </body>
</html>

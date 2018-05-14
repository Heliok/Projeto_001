<%-- 
    Document   : sucesso
    Author     : Helio Kinoshita
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado da Operação</title>
    </head>
    <body>
        <h1>A <%= request.getAttribute("operacao") %> foi realizada com sucesso!</h1>
        <a href='Livros'>Voltar</a>
    </body>
</html>

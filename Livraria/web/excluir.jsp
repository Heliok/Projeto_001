<%-- 
    Document   : excluir
    Author     : Helio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>Exclusão</title>
         <meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="style/bootstrap/css/bootstrap.css">
    </head>
    <body>
        <div class="container">	
            <%
            String[] ids = (String[]) request.getParameterValues("id");
            if (ids == null){
                %>
                <h3>Livro não selecionado.</h3>
                <a href='Livros'><input type="button" class="btn" value=" Voltar "></a>
                <%
            }  
            else {
                %>
                <h3>Você realmente deseja excluir o(s) livro(s) selecionado(s)?</h3>
                <br />
                <form action="ExcluirLivro">
                <%
                   for (String id : ids) {
                        out.println("<input type='hidden' name='id' value='" + id + "' />");     
                       }
                 %>
                <input type="submit" class="btn" name="excluir" id="excluir" value=" Sim ">
                <a href='Livros'><input type="button" class="btn" value=" Não "></a>
                </form>
                 <%
              }
             %>
        </div>    
         <script src="style/bootstrap/js/jquery.js"></script>
        <script src="style/bootstrap/js/popper.js"></script>
        <script src="style/bootstrap/js/bootstrapjs"></script>
    </body>
</html>

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
       <meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="style/bootstrap/css/bootstrap.css">
    </head>
    <body>
        <div class="container">	
            <h1>Cadastrar Livro</h1>
            <form action='InserirLivro'>
                <div class="form-group row">
                    <label for="titulo" class="col-1 col-form-label">Título:</label>
                    <div class="col-5">
                        <input class="form-control" type="text" id="titulo" name="titulo">
                    </div>
                    <label for="editora" class="col-1 col-form-label">Editora:</label>
                    <div class="col-5">
   		 	<input class="form-control" type="text" id="editora" name="editora">
                    </div>
		</div>
			
		<div class="form-group row">
                    <label for="isbn" class="col-1 col-form-label">ISBN:</label>
                    <div class="col-3">
                        <input class="form-control" type="text" id="isbn" name="isbn">
                    </div>
                    <label for="edicao" class="col-1 col-form-label">Edição:</label>
                    <div class="col-2">
   			<input class="form-control" type="number" id="edicao" name="edicao">
                    </div>
                    <label for="paginas" class="col-1 col-form-label">Páginas:</label>
                    <div class="col-2">
   		 	<input class="form-control" type="text" id="paginas" name="paginas">
                    </div>
                    	<label for="ano" class="col-1 col-form-label">Ano:</label>
                    <div class="col-1">
   		 	<input class="form-control" type="text" id="ano" name="ano">
                    </div>
		</div>
			
		<div class="form-group row">
                    <label for="sinopse" class="col-1 col-form-label">Sinopse:</label>
 			<div class="col-11">
                            <textarea class="form-control"  id="sinopse" name="sinopse" rows="4"></textarea>
 			</div>
 		</div>
              
                <div class="form-group row">
                    <label for="status" class="col-1 col-form-label">Status:</label>
                    <div class="col-3">
                        <select class="form-control" id="status" name="status">
                            <option selected value="Ativo">Ativo</option>
                            <option value="Inativo">Inativo</option>
  			</select>
                    </div>
                </div>
            
                <input type='submit' class="btn btn-primary" name='inserir' value='Salvar' />
                <a href='Livros'><input type="button" class="btn" value="Cancelar"></a>
            </form>
        </div>    
        
        <script src="style/bootstrap/js/jquery.js"></script>
        <script src="style/bootstrap/js/popper.js"></script>
        <script src="style/bootstrap/js/bootstrapjs"></script>
    </body>
</html>

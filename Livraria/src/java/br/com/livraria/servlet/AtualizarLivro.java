package br.com.livraria.servlet;

import br.com.livraria.DAO.FabricaDAO;
import br.com.livraria.DAO.IDAO;
import br.com.livraria.dominio.Livro;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Helio Kinoshita
 */
@WebServlet(name = "AtualizarLivro", urlPatterns = {"/AtualizarLivro"})
public class AtualizarLivro extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        String titulo = request.getParameter("titulo");
        String editora = request.getParameter("editora");
        int ano = Integer.parseInt(request.getParameter("ano"));
        int edicao = Integer.parseInt(request.getParameter("edicao"));
        String isbn = request.getParameter("isbn");
        int paginas = Integer.parseInt(request.getParameter("paginas"));
        String sinopse = request.getParameter("sinopse");
        String status = request.getParameter("status");
               
        Livro livro = new Livro();
        livro.setIdLivro(Integer.valueOf(id));
        livro.setTitulo(titulo);
        livro.setEditora(editora);
        livro.setAno(ano);
        livro.setEdicao(edicao);
        livro.setISBN(isbn);
        livro.setPaginas(paginas);
        livro.setSinopse(sinopse);
        livro.setStatus(status);
      
        
        try {
            IDAO livroDAO = FabricaDAO.getLivroDAO();
            livroDAO.alterar(livro);
            request.setAttribute("operacao", "atualização");
            request.getRequestDispatcher("/sucesso.jsp").forward(request, response);
        } catch (Exception ex) {
            request.getRequestDispatcher("/erro.jsp").forward(request, response);
        }
    }

}

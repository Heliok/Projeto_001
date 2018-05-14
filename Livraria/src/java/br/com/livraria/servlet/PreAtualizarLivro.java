package br.com.livraria.servlet;


import br.com.livraria.DAO.FabricaDAO;
import br.com.livraria.DAO.IDAO;
import br.com.livraria.dominio.Livro;
import br.com.livraria.excecao.ExcecaoAcessoDados;
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
@WebServlet(name = "PreAtualizarLivro", urlPatterns = {"/PreAtualizarLivro"})
public class PreAtualizarLivro extends HttpServlet {

     @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");

        Livro livro = new Livro();
        try {
            IDAO livroDAO = FabricaDAO.getLivroDAO();
            livro = livroDAO.consultarPorId(Integer.valueOf(id));

            request.setAttribute("livro", livro);
            request.getRequestDispatcher("/atualizar.jsp").forward(request, response);
        } catch (ExcecaoAcessoDados ex) {
            request.getRequestDispatcher("/erro.jsp").forward(request, response);
        }
    }
}

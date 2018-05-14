package br.com.livraria.servlet;


import br.com.livraria.DAO.FabricaDAO;
import br.com.livraria.DAO.IDAO;
import br.com.livraria.dominio.Livro;
import br.com.livraria.excecao.ExcecaoAcessoDados;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Helio Kinoshita
 */
@WebServlet(name = "Livros", urlPatterns = {"/Livros"})
public class Livros extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        List<Livro> livros;
        try {
            IDAO livroDAO = FabricaDAO.getLivroDAO();
            livros = livroDAO.consultarTodos();
            request.setAttribute("livrosDoBanco", livros);
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } catch (ExcecaoAcessoDados ex) {
            request.getRequestDispatcher("/erro.jsp").forward(request, response);
        }
    }

    

}

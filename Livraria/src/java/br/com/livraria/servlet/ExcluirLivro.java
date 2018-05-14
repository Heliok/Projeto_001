
package br.com.livraria.servlet;


import br.com.livraria.DAO.FabricaDAO;
import br.com.livraria.DAO.IDAO;
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
@WebServlet(name = "ExcluirLivro", urlPatterns = {"/ExcluirLivro"})
public class ExcluirLivro extends HttpServlet {
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String[] ids = request.getParameterValues("id");

            IDAO livroDAO = FabricaDAO.getLivroDAO();
            for (String id : ids) {
                livroDAO.excluir(Integer.valueOf(id));
            }
            
            request.setAttribute("operacao", "exclusão");
            request.getRequestDispatcher("/sucesso.jsp").forward(request, response);
        } catch (Exception ex) {
            request.getRequestDispatcher("/erro.jsp").forward(request, response);
        }

    }
}

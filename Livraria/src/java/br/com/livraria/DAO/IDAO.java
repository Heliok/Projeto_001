package br.com.livraria.DAO;

import br.com.livraria.dominio.Livro;
import br.com.livraria.excecao.ExcecaoAcessoDados;
import java.util.List;

/**
 *
 * @author Helio Kinoshita
 */
public interface IDAO {
    
    void alterar(Livro livro) throws ExcecaoAcessoDados;

    Livro consultarPorId(int id) throws ExcecaoAcessoDados;

    List<Livro> consultarTodos() throws ExcecaoAcessoDados;

    void excluir(int id) throws ExcecaoAcessoDados;

    void inserir(Livro lilvro) throws ExcecaoAcessoDados;
}

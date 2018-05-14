package br.com.livraria.DAO;

import br.com.livraria.dominio.Livro;
import br.com.livraria.excecao.ExcecaoAcessoDados;
import br.livraria.util.ConexaoPostgres;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Helio Kinoshita
 */
public class LivroDAO implements IDAO{
    
     public void inserir(Livro livro) throws ExcecaoAcessoDados {
        try {
            // Abre uma conexao com o banco.
            Connection conexao = ConexaoPostgres.getConexao();

            String instrucaoSQL = "insert into livro(titulo, ano, edicao, isbn, paginas, sinopse, status, data)"
                    + " values(?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement declaracao = conexao.prepareStatement(instrucaoSQL);
            declaracao.setString(1, livro.getTitulo());
            declaracao.setInt(2, livro.getAno());
            declaracao.setInt(3, livro.getEdicao());
            declaracao.setString(4, livro.getISBN());
            declaracao.setInt(5, livro.getPaginas());
            declaracao.setString(6, livro.getSinopse());
            declaracao.setString(7, livro.getStatus());
            String sValue = "2009/10/10" ; 
            java.sql.Date data = java.sql.Date.valueOf(sValue);
            declaracao.setDate(8, data);
            declaracao.execute();

            // Fecha a conexao.
            conexao.close();
        } catch (ClassNotFoundException erro) {
            erro.printStackTrace();
            throw new ExcecaoAcessoDados("Houve um problema de configuração");
        } catch (SQLException erro) {
            erro.printStackTrace();
            throw new ExcecaoAcessoDados("Houve um problema de conectividade");
        }

    }

    public void excluir(int id) throws ExcecaoAcessoDados {
        try {
            // Abre uma conexao com o banco.
            Connection conexao = ConexaoPostgres.getConexao();

            String instrucaoSQL = "delete from livro where id_livro=?";
            PreparedStatement declaracao = conexao.prepareStatement(instrucaoSQL);
            declaracao.setInt(1, id);
            declaracao.execute();

            // Fecha a conexao.
            conexao.close();
        } catch (ClassNotFoundException erro) {
            erro.printStackTrace();
            throw new ExcecaoAcessoDados("Houve um problema de configuração");
        } catch (SQLException erro) {
            erro.printStackTrace();
            throw new ExcecaoAcessoDados("Houve um problema de conectividade");
        }
    }

    public void alterar(Livro livro) throws ExcecaoAcessoDados {
        try {
            // Abre uma conexao com o banco.
            Connection conexao = ConexaoPostgres.getConexao();

            String instrucaoSQL = "update livro set titulo=?, ano=?, edicao=?, isbn=?, paginas=?, sinopse=?, status=? where id_livro=?";
            PreparedStatement declaracao = conexao.prepareStatement(instrucaoSQL);
            declaracao.setString(1, livro.getTitulo());
            declaracao.setInt(2, livro.getAno());
            declaracao.setInt(3, livro.getEdicao());
            declaracao.setString(4, livro.getISBN());
            declaracao.setInt(5, livro.getPaginas());
            declaracao.setString(6, livro.getSinopse());
            declaracao.setString(7, livro.getStatus());
            declaracao.setInt(8, Integer.valueOf(livro.getIdLivro()));
            declaracao.execute();

            // Fecha a conexao.
            conexao.close();
        } catch (ClassNotFoundException erro) {
            erro.printStackTrace();
            throw new ExcecaoAcessoDados("Houve um problema de configuração");
        } catch (SQLException erro) {
            erro.printStackTrace();
            throw new ExcecaoAcessoDados("Houve um problema de conectividade");
        }
    }

    public Livro consultarPorId(int id) throws ExcecaoAcessoDados {
        Livro livro = null;
        try {
            // Abre uma conexao com o banco.
            Connection conexao = ConexaoPostgres.getConexao();

            String instrucaoSQL = "select id_livro, titulo, ano, edicao, isbn, paginas, sinopse, status from livro where id_livro=" + id;
            PreparedStatement declaracao = conexao.prepareStatement(instrucaoSQL);
            ResultSet resultado = declaracao.executeQuery();
            if (resultado.next()) {
                livro = new Livro();
                livro.setIdLivro(resultado.getInt("id_livro"));
                livro.setTitulo(resultado.getString("titulo"));
                livro.setAno(resultado.getInt("ano"));
                livro.setEdicao(resultado.getInt("edicao"));
                livro.setISBN(resultado.getString("isbn"));
                livro.setPaginas(resultado.getInt("paginas"));
                livro.setSinopse(resultado.getString("sinopse"));
                livro.setStatus(resultado.getString("status"));
            }

            // Fecha a conexao.
            conexao.close();
        } catch (ClassNotFoundException erro) {
            erro.printStackTrace();
            throw new ExcecaoAcessoDados("Houve um problema de configuração");
        } catch (SQLException erro) {
            erro.printStackTrace();
            throw new ExcecaoAcessoDados("Houve um problema de conectividade");
        }
        return livro;
    }

    public List<Livro> consultarTodos() throws ExcecaoAcessoDados {
        List<Livro> livros = null;
        try {
            // Abre uma conexao com o banco.
            Connection conexao = ConexaoPostgres.getConexao();

            String instrucaoSQL = "select id_livro, titulo, ano, edicao, isbn, paginas, sinopse, status from livro";
            PreparedStatement declaracao = conexao.prepareStatement(instrucaoSQL);
            ResultSet resultado = declaracao.executeQuery();
            livros = new ArrayList<>();
            while (resultado.next()) {
                Livro livro = new Livro();
                livro.setIdLivro(resultado.getInt("id_livro"));
                livro.setTitulo(resultado.getString("titulo"));
                livro.setAno(resultado.getInt("ano"));
                livro.setEdicao(resultado.getInt("edicao"));
                livro.setISBN(resultado.getString("isbn"));
                livro.setPaginas(resultado.getInt("paginas"));
                livro.setSinopse(resultado.getString("sinopse"));
                livro.setStatus(resultado.getString("status"));
                livros.add(livro);
            }

            // Fecha a conexao.
            conexao.close();
        } catch (ClassNotFoundException erro) {
            erro.printStackTrace();
            throw new ExcecaoAcessoDados("Houve um problema de configuração");
        } catch (SQLException erro) {
            erro.printStackTrace();
            throw new ExcecaoAcessoDados("Houve um problema de conectividade");
        }
        return livros;
    }
}

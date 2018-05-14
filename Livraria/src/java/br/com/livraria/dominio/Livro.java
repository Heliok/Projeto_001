package br.com.livraria.dominio;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Helio Kionshita
 */
public class Livro {
    
        private int idLivro;
	private String titulo;
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	private int ano;
	private ArrayList<Autor> autores = new ArrayList<Autor>();
	private String editora;
	private int edicao;
	private String ISBN;
	private int paginas;
	private String sinopse;
	private double valorVenda;
	private String status;
	private String motivo;
	private Calendar dtEntrada;
	private double precocompra;
        private Date dtcadastro;

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Calendar getDtEntrada() {
        return dtEntrada;
    }

    public void setDtEntrada(Calendar dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public double getPrecocompra() {
        return precocompra;
    }

    public void setPrecocompra(double precocompra) {
        this.precocompra = precocompra;
    }

    public Date getDtcadastro() {
        return dtcadastro;
    }

    public void setDtcadastro(Date dtcadastro) {
        this.dtcadastro = dtcadastro;
    }
        
        
}

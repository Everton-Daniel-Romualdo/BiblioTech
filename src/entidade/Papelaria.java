package entidade;

import java.time.LocalDate;

/**
 * Representação abstrata de um produto de papelaria
 * @author Everton Daniel
 */
public abstract class Papelaria {
	
	String titulo;
	int id;
	String descricao;
	String conteudo;
	String autor;
	int numeroPagina;
	LocalDate dataPublicacao;
	double preco;
	int quantidadeEstoque;
	
	public Papelaria(String titulo, int id, String descricao, String conteudo, String autor, int numeroPagina,
			LocalDate dataPublicacao, double preco, int quantidadeEstoque) throws IllegalArgumentException{
		//Criar novas exceções em caso de estoque negativo e data anterior a atual
		if(titulo.equals("") || descricao.equals("") || conteudo.equals("") || autor.equals("")) {
			throw new IllegalArgumentException("VALORES NÃO PODEM SER NULOS");
		}else if(id <= 0 || preco <= 0 || quantidadeEstoque <= 0) {
			throw new IllegalArgumentException("OS VALORES NÃO PODEM SER NEGATIVOS OU ZERO");
		}else if(dataPublicacao.isBefore(LocalDate.now())) {
			throw new IllegalArgumentException("A DATA DE PUBLIAÇÃO NÃO PODE SER MENOR QUE A ATUAL DATA");
		}
		
		this.titulo = titulo;
		this.id = id;
		this.descricao = descricao;
		this.conteudo = conteudo;
		this.autor = autor;
		this.numeroPagina = numeroPagina;
		this.dataPublicacao = dataPublicacao;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	
}

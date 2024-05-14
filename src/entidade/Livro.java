package entidade;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Representação de um livor no sistema
 * Contem um atributo "editora"
 * @author Everton Daniel
 */

public class Livro extends Papelaria implements Legivel {
	String editora;

	public Livro(String titulo, int id, String descricao, String conteudo, String autor, int numeroPagina,
			LocalDate dataPublicacao, double preco, int quantidadeEstoque, String editora)
			throws IllegalArgumentException {
		super(titulo, id, descricao, conteudo, autor, numeroPagina, dataPublicacao, preco, quantidadeEstoque);
		if(editora.equals("")) {
			throw new IllegalArgumentException("A EDITORA NÃO PODE SER VAZIA");
		}
		this.editora = editora;
	}

	public String getEditora() {
		return editora;
	}


	@Override
	public String toString() {
		return "Livro [editora=" + editora + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(editora);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if(this.id == other.id) {
			return true;
		}
		return false;
		
	}
	
	
	
	
}

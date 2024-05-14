package entidade;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Representação de uma revista no sistema
 * @author Everton Daniel
 */
public class Revista extends Papelaria implements Legivel {
	String editora;
	int idadeRecomendada;
	
	public Revista(String titulo, int id, String descricao, String conteudo, String autor, int numeroPagina,
			LocalDate dataPublicacao, double preco, int quantidadeEstoque, String editora, int idadeRecomendada)
			throws IllegalArgumentException {
		super(titulo, id, descricao, conteudo, autor, numeroPagina, dataPublicacao, preco, quantidadeEstoque);
		if(editora.equals("")) {
			throw new IllegalArgumentException("A EDITORA NÃO PODE TER NOME VAZIO");
		}else if(idadeRecomendada < 0){
			throw new IllegalArgumentException("A IDADE RECOMENDADA NÃO PODE SER NEGATIVA");
		}
		this.editora = editora;
		this.idadeRecomendada = idadeRecomendada;
	}
	
	public String getEditora() {
		return editora;
	}
	
	public int getIdadeRecomendada() {
		return idadeRecomendada;
	}
	
	@Override
	public String toString() {
		return "Revista [editora=" + editora + ", idadeRecomendada=" + idadeRecomendada + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(editora, idadeRecomendada);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Revista other = (Revista) obj;
		if(this.id == other.id) {
			return true;
		}
		return false;
	}
	
	
}

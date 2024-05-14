package entidade;

import java.time.LocalDate;
import java.util.Objects;

public class Artigo extends Papelaria implements Legivel {
	String nivel;
	String universidade;
	public Artigo(String titulo, int id, String descricao, String conteudo, String autor, int numeroPagina,
			LocalDate dataPublicacao, double preco, int quantidadeEstoque, String nivel, String universidade)
			throws IllegalArgumentException {
		super(titulo, id, descricao, conteudo, autor, numeroPagina, dataPublicacao, preco, quantidadeEstoque);
		
		if(nivel.equals("") || universidade.equals("")) {
			throw new IllegalArgumentException("OS VALORES NÃO PODEM SER VAZIOS");
		}
		this.nivel = nivel;
		this.universidade = universidade;
	}
	public String getNivel() {
		return nivel;
	}
	public String getUniversidade() {
		return universidade;
	}
	@Override
	public String toString() {
		return "Artigo [nivel=" + nivel + ", universidade=" + universidade + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nivel, universidade);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artigo other = (Artigo) obj;
		if(this.id == other.id) {
			return true;
		}
		return false;
	}
	
	
	
}

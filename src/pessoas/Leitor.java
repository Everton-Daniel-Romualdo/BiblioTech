package pessoas;

import java.util.ArrayList;
import java.util.Objects;

import entidade.Legivel;
/**
 * Representação de um usuario Leitor ou cliente do sistema
 * @author Everton Daniel
 */
public class Leitor extends Usuario {
	ArrayList<Legivel> compras;
	
	/**
	 * Constroi um objeto Leitor com super construtor e inicializa o atributo compras
	 * @param nome O nome do usuario
	 * @param cpf O cpf do usuario
	 * @param senha A senha do usuario 
	 */
	public Leitor(String nome, String cpf, int senha)throws  IllegalArgumentException{ 
		super(nome, cpf, senha);
		this.compras = new ArrayList<Legivel>();
	}
	
	public ArrayList<Legivel> getCompras() {
		return compras;
	}

	@Override
	public String toString() {
		String livros = "Palelaria Compradas: \n";
		for(Legivel l : this.compras) {
			livros += l.toString();
		}
		
		return "Nome: " + this.nome + "\n" + livros;
	}

	@Override
	public int hashCode() {
		return Objects.hash(compras);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Leitor other = (Leitor) obj;
		if(this.cpf.equals(other.cpf)) {
			return true;
		}
		return false;
	}
	
	
	
	
}

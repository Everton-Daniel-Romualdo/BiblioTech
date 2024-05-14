package pessoas;

import java.util.Objects;

/**
 * Classe abstrata que representa um usuario
 * @author Everton Daniel
 */
public abstract class Usuario {
	protected String nome;
	protected  String cpf;
	protected int senha;
	
	/**
	 * Super construtor do objeto que inicializa todos os seus parametros
	 * @param nome O nome do usuario
	 * @param cpf O cpf unico do usuario
	 * @param senha A senha do usuario
	 * @throws IllegalArgumentException Lançado quando são recebidos valores negativos ou String vazias
	 */
	public Usuario(String nome, String cpf, int senha) throws IllegalArgumentException{
		if(senha < 0 ) {
			throw new IllegalArgumentException("VALORES NEGATIVOS NÃO SÃO PERMITIDOS");
		}
		else if(nome.equals("") || cpf.equals("")) {
			throw new IllegalArgumentException("VALORES VAZIO NÃO É PERMITIDO");
		}
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}
	
	
	
	public Usuario(String nome, int senha)throws IllegalArgumentException {
		if(senha < 0 ) {
			throw new IllegalArgumentException("VALORES NEGATIVOS NÃO SÃO PERMITIDOS");
		}else if(nome.equals("")) {
			throw new IllegalArgumentException("VALORES VAZIO NÃO É PERMITIDO");
		}
		
		this.nome = nome;
		this.senha = senha;
	}



	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public int getSenha() {
		return senha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(nome, other.nome) && senha == other.senha;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", cpf=" + cpf + ", senha=" + senha + "]";
	}
	
	
	
}

package pessoas;

import java.util.Objects;

/**
 * Classe que representa um administrador no sistema.
 * Contem um nick de acesso unico que é seu identificador.
 * Os administradores não informam seu cpf
 * @author Everton Daniel
 */
public class Administrador extends Usuario {
	String nick;
	public Administrador(String nome, String nick, int senha) throws IllegalArgumentException {
		super(nome, senha);
		if(nick.equals("")) {
			throw new IllegalArgumentException("O NICK NÃO PODE SER VAZIO");
		}
		this.nick = nick;
	}
	
	public String getNick() {
		return nick;
	}

	@Override
	public String toString() {
		return "Administrador [nick=" + nick + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(nick);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Administrador other = (Administrador) obj;
		if(this.nick.equals(other.nick)) {
			return true;
		}
		return false;
	}
	
	

}

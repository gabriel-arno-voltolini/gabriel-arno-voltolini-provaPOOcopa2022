package Domain.Entities;

import java.time.LocalDate;

public class ComissaoTecnica extends Membro {
	
	private String funcao;

	public ComissaoTecnica(String nome, String apelido, LocalDate dataNascimento) {
		super(nome, apelido, dataNascimento);
	}

}

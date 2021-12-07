package Domain.Entities;

import java.time.LocalDate;
import java.util.concurrent.locks.Condition;

public class ComissaoTecnica extends Membro{
    
    private String funcao;

    public ComissaoTecnica(String nome, String apelido, LocalDate dataNascimento) {
        super(nome, apelido, dataNascimento);
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

	@Override
	public char getGrauHidratacao() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void go(Condition c) {
		// TODO Auto-generated method stub
		
	}
} 
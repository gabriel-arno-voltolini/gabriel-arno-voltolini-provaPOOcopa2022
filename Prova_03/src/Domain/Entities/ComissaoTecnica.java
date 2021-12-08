package Domain.Entities;

import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.locks.Condition;

import Enumerators.Conditions;

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
	public void go(Conditions c) {
		Random random = new Random();

		int randomValue = random.nextInt(10);
		double temperaturaAtual = this.getTemperatura();
		int hidratacaoAtual = this.getHidratacao();

		if(randomValue == 7 | randomValue == 8){
			temperaturaAtual += 0.1;
			if(c.equals(Conditions.MATCH)){
				hidratacaoAtual -= (hidratacaoAtual * 0.03);
			}
			if (c.equals(Conditions.TRAINING)) {
				hidratacaoAtual -= (hidratacaoAtual * 0.01);
			}
		}
		else if(randomValue == 9 | randomValue == 10){
			temperaturaAtual -= 0.1;
			if(c.equals(Conditions.MATCH)){
				hidratacaoAtual += (hidratacaoAtual * 0.02);
			}
			if (c.equals(Conditions.TRAINING)) {
				hidratacaoAtual += (hidratacaoAtual * 0.01);
			}
		}
		this.setTemperatura(temperaturaAtual);
		this.setHidratacao(hidratacaoAtual);
	}

}
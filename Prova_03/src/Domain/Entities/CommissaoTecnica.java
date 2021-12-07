package Domain.Entities;

import java.time.LocalDate;

public class CommissaoTecnica extends Membro{
    
    private String funcao;

    public CommissaoTecnica(String nome, String apelido, LocalDate dataNascimento) {
        super(nome, apelido, dataNascimento);
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
} 
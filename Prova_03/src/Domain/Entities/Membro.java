package Domain.Entities;

import java.time.LocalDate;
import java.util.concurrent.locks.Condition;

public abstract class Membro {
    private String nome;
    private String apelido;
    private LocalDate dataNascimento;
    private int hidratacao;
    private double temperatura;

    public Membro(String nome, String apelido, LocalDate dataNascimento) {
        this.setNome(nome);
        this.setApelido(apelido);
        this.setDataNascimento(dataNascimento);
    }
    
    public char getGrauHidratacao(){
        return ' ';
    }

    public void go(Condition c){

    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public int getHidratacao() {
        return hidratacao;
    }

    public void setHidratacao(int hidratacao) {
        this.hidratacao = hidratacao;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

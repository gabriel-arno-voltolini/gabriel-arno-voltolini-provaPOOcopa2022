package Domain.Entities;

import java.time.LocalDate;
import java.util.concurrent.locks.Condition;

public class Jogador extends Membro{

	private int numero;
	private String posicao;
	private int altura;
	private double peso;
	
	public Jogador(String nome, String apelido, LocalDate dataNascimento, int numero, String posicao, int altura, double peso) {
		super(nome, apelido, dataNascimento);
		this.setNumero(numero);
		this.setPosicao(posicao);
		this.setAltura(altura);
		this.setPeso(peso);
	}
	
	public char getGrauHidratacao() {
		
	}
	
	public void go(Condition c) {
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
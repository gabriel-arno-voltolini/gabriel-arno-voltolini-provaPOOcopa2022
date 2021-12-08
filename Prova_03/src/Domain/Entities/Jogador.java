package Domain.Entities;

import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.locks.Condition;

import Enumerators.Conditions;

public class Jogador extends Membro {

	private int numero;
	private String posicao;
	private int altura;
	private double peso;

	public Jogador(String nome, String apelido, LocalDate dataNascimento, int numero, String posicao, int altura,
			double peso) {
		super(nome, apelido, dataNascimento);
		this.setNumero(numero);
		this.setPosicao(posicao);
		this.setAltura(altura);
		this.setPeso(peso);
	}

	@Override
	public char getGrauHidratacao() {
		double temperatura = this.getTemperatura();
		double hidratacao = this.getHidratacao();

		if (temperatura <= 37 && hidratacao >= 87) {
			return 'H';
		} else if (temperatura > 37.6 && hidratacao < 80) {
			return 'D';
		} else {
			return 'E';
		}
	}

	public void go(Conditions c) {
		Random random = new Random();
		int randomValue = random.nextInt(10);
		double temperatura = this.getTemperatura();
		int hidratacao = this.getHidratacao();

		if (randomValue >= 5 && randomValue <= 7) {
			temperatura += 0.1;
			if (c.equals(Conditions.MATCH)) {
				hidratacao -= (hidratacao * 0.05);
			} else if (c.equals(Conditions.TRAINING)) {
				hidratacao -= (hidratacao * 0.03);
			}
		} else if (randomValue >= 8 && randomValue <= 10) {
			temperatura -= 0.1;
			if (c.equals(Conditions.MATCH)) {
				hidratacao += (hidratacao * 0.03);
			} else if (c.equals(Conditions.TRAINING)) {
				hidratacao += (hidratacao * 0.02);
			}
		}
		this.setTemperatura(temperatura);
		this.setHidratacao(hidratacao);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero >= 1 && numero <= 23) {
			this.numero = numero;
		} else {
			throw new IllegalArgumentException("O número do jogador precisar estar entre 1 e 23!");
		}
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
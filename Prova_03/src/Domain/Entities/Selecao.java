package Domain.Entities;

import java.util.ArrayList;

import Enumerators.Conditions;
import Interfaces.INationalTeam;

public class Selecao implements INationalTeam {

	private String pais;
	private ArrayList<Membro> membros;

	public Selecao(String nomePais) {
		this.setPais(nomePais);
		this.membros = new ArrayList<Membro>();
	}

	public ArrayList<Membro> getMembros() {
		return membros;
	}

	public void addMembro(Membro membro) {
		this.membros.add(membro);
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		if (pais.isBlank() || pais.equals(null)) {
			throw new IllegalArgumentException("Adicione o nome do país!");
		} else {
			this.pais = pais;
		}
	}

	@Override
	public String getName() {
		return pais;
	}

	@Override
	public void simulating(Conditions condition) {
		// TODO Auto-generated method stub

	}

	@Override
	public String statusReport() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWaterComfort() {
		int hidratado = 0, desidratado = 0, desgastado = 0;

		for (Membro m : membros) {
			if (m.getGrauHidratacao() == 'H') {
				hidratado++;
			} else if (m.getGrauHidratacao() == 'D') {
				desidratado++;
			} else if (m.getGrauHidratacao() == 'E') {
				desgastado++;
			}
		}

		if (hidratado == this.getMembros().size()) {
			return 10;
		} else if (getPercentage(desidratado) <= 10 || getPercentage(desgastado) <= 20) {
			return 9;
		} else if (getPercentage(desidratado) > 10 && getPercentage(desidratado) <= 30
				|| getPercentage(desgastado) > 20 && getPercentage(desgastado) <= 40) {
			return 7;
		} else if (getPercentage(desidratado) > 30 && getPercentage(desidratado) <= 50
				|| getPercentage(desgastado) > 40 && getPercentage(desgastado) <= 60) {
			return 5;
		} else {
			return 2;
		}

	}

	private double getPercentage(int occurences) {
		return (occurences * membros.size()) / 100;
	}
}

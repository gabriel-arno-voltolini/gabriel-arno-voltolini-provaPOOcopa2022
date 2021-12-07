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

    public ArrayList<Membro> getMebros() {
        return membros;
    }

    public void addMembro(Membro membro) {
        this.membros.add(membro);
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return 0;
	}
}

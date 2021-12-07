package Domain.Entities;

import java.util.ArrayList;

public class Selecao {

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
}

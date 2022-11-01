package Raca;

import Interfaces.IClasse;
import Informacoes.Personagem;
import Interfaces.IGritoDeGuerra;


public class Orc extends Personagem implements IGritoDeGuerra, IClasse {

    private final IClasse classe;
    public Orc(String n, String o, IClasse classe) {
        this.setNome(n);
        this.setOrientacaoSexual(o);
        this.classe=classe;
    }

    @Override
    public void poder1() {
        this.classe.poder1();
    }

    @Override
    public void poder2() {
        this.classe.poder2();
    }

    @Override
    public void gritoDeGuerra() {
        System.out.println("Grito de Guerra");
    }

    @Override
    public String toString() {
        return "Orc: " + this.getNome() +
                "\n" + this.classe.getClass() +
                "\nSexo: " + this.getOrientacaoSexual();
    }
}

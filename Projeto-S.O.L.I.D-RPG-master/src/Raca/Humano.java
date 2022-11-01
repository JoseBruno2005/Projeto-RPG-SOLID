package Raca;

import Interfaces.IClasse;
import Informacoes.Personagem;
import Interfaces.IDiplomacia;


public class Humano extends Personagem implements IDiplomacia, IClasse{

    private final IClasse classe;


    public Humano(String n, String o, IClasse classe) {
        this.classe = classe;
        this.setNome(n);
        this.setOrientacaoSexual(o);
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
    public void diplomacia() {
        System.out.println("Diplomacia");
    }

    @Override
    public String toString() {
        return "Humano: " + this.getNome() +
               "\n" + this.classe.getClass() +
                "\nSexo: " + this.getOrientacaoSexual();
    }
}

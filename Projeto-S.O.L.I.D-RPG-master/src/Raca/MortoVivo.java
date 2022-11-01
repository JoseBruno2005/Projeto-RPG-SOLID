package Raca;

import Interfaces.IClasse;
import Informacoes.Personagem;
import Interfaces.IDeterminacao;


public class MortoVivo extends Personagem implements IDeterminacao, IClasse {

    private final IClasse classe;

    public MortoVivo(String n, String o, IClasse classe) {
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
    public void determinacao() {
        System.out.println("Determinacao");
    }

    @Override
    public String toString() {
        return "MortoVivo: " + this.getNome() +
                "\n" + this.classe.getClass() +
                "\nSexo: " + this.getOrientacaoSexual();
    }
}

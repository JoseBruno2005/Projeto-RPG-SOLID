package Classes;

import Interfaces.IClasse;

public class Mago implements IClasse {
    @Override
    public void poder1() {
        System.out.println("Bola De Fogo");
    }

    @Override
    public void poder2() {
        System.out.println("Bola de Gelo");
    }
}

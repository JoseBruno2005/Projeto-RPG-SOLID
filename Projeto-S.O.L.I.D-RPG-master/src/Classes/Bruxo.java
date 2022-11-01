package Classes;

import Interfaces.IClasse;

public class Bruxo implements IClasse {

    @Override
    public void poder1() {
        System.out.println("Maldicao");
    }

    @Override
    public void poder2() {
        System.out.println("Invocar Demonio");
    }
}

package Classes;

import Interfaces.IClasse;

public class Paladino implements IClasse {

    @Override
    public void poder1() {
        System.out.println("Usando escuto de luz");
    }

    @Override
    public void poder2() {
        System.out.println("Usando Cura");
    }
}

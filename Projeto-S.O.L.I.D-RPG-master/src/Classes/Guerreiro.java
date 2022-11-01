package Classes;

import Interfaces.IClasse;

public class Guerreiro implements IClasse {

    @Override
    public void poder1() {
        System.out.println("Cortando com uma faca afiada");
    }

    @Override
    public void poder2() {
        System.out.println("Defedendo com escuto");
    }
}

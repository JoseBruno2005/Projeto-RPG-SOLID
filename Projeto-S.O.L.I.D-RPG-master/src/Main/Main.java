package Main;


import Classes.Bruxo;
import Classes.Guerreiro;
import Classes.Mago;
import Classes.Paladino;
import Raca.Elfo;
import Raca.Humano;
import Raca.MortoVivo;
import Raca.Orc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {

        Object[] exercito = {};
        ArrayList<Object> novoExercito = new ArrayList<Object>(new ArrayList(asList(exercito)));

        System.out.println("SEJA BEM VINDO AO WARCRAFT");
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("------------------------------------");
            System.out.println("MENU" +
                    "\n1- Cadastrar" +
                    "\n2- Mostrar Exercito" +
                    "\n3- Sair");
            System.out.println("------------------------------------");


            while(opcao!=1 && opcao!=2 && opcao!=3){
                Scanner teclado = new Scanner(System.in);
                System.out.print("Escolha um opcao -> ");
                try{
                    opcao = teclado.nextInt();
                    if(opcao!=1 && opcao!=2 && opcao!=3){
                        System.out.println("Opcao imvalida");
                        continue;
                    }

                }catch (InputMismatchException e){
                    System.out.println("(ERRO : O tipo de variavel esta incorreto)");
                }

            }

            if (opcao == 1) {
                while (true) {
                    System.out.println("------------------------------------");
                    System.out.println("Opcoes de raca: " +
                            "\nElfo Paladino" +
                            "\nHumano Guerreiro" +
                            "\nMorto Vivo Bruxo" +
                            "\nOrc Mago");
                    System.out.println("------------------------------------");

                    Scanner escolha = new Scanner(System.in);
                    System.out.print("Digite sua Raca -> ");
                    String escolha1 = escolha.nextLine();

                    if (escolha1.equalsIgnoreCase("elfo")) {

                        Elfo elfo = new Elfo("", "", new Paladino());

                        System.out.print("Escolha um nome do seu Personagem: ");
                        elfo.setNome(escolha.nextLine());


                        System.out.print("Digite a orientacao sexual do seu Personagem: ");
                        elfo.setOrientacaoSexual(escolha.nextLine());

                        novoExercito.add(elfo);
                        opcao = 0;
                        System.out.println("Cadastro concluido!");
                        break;

                    } else if (escolha1.equalsIgnoreCase("Humano")) {
                        Humano humano = new Humano("", "", new Guerreiro());

                        System.out.print("Escolha um nome do seu Personagem: ");
                        humano.setNome(escolha.nextLine());


                        System.out.print("Digite a orientacao sexual do seu Personagem: ");
                        humano.setOrientacaoSexual(escolha.nextLine());


                        novoExercito.add(humano);
                        opcao = 0;
                        System.out.println("Cadastro concluido!");
                        break;

                    } else if (escolha1.equalsIgnoreCase("Morto Vivo")) {
                        MortoVivo mortoVivo = new MortoVivo("", "", new Bruxo());

                        System.out.print("Escolha um nome do seu Personagem: ");
                        mortoVivo.setNome(escolha.nextLine());


                        System.out.print("Digite a orientacao sexual do seu Personagem: ");
                        mortoVivo.setOrientacaoSexual(escolha.nextLine());


                        novoExercito.add(mortoVivo);
                        opcao = 0;
                        System.out.println("Cadastro concluido!");
                        break;

                    } else if (escolha1.equalsIgnoreCase("Orc")) {
                        Orc orc = new Orc("", "", new Mago());

                        System.out.print("Escolha um nome do seu Personagem: ");
                        orc.setNome(escolha.nextLine());


                        System.out.print("Digite a orientacao sexual do seu Personagem: ");
                        orc.setOrientacaoSexual(escolha.nextLine());

                        novoExercito.add(orc);
                        opcao = 0;
                        System.out.println("Cadastro concluido!");
                        break;

                    } else {
                        System.out.println("Essa Classe não existe. ESCOLHA UMA CLASSE VALIDA!");
                    }

                }

            } else if (opcao == 2) {

                if(novoExercito.size()==0){
                    System.out.println("---------------------------------");
                    System.out.println("Voce ainda não posui um exercito!!"+
                            "\nDigite 1 para cadastrar seus menbros!");
                    System.out.println("---------------------------------");
                    opcao = 0;
                } else {

                    System.out.println("---------------------------------");
                    for (Object percorer : novoExercito) {
                        System.out.println(percorer);
                        System.out.println();
                    }
                    System.out.println("---------------------------------");
                    opcao = 0;
                }

            }
        }
        System.out.println("Obrigada!!");
    }
}
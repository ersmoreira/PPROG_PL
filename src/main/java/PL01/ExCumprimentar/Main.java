package PL01.ExCumprimentar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Insira o nome: ");
        String nome = ler.nextLine();
        Pessoa p = new Pessoa(nome);
        System.out.println(p.toString());
    }
}

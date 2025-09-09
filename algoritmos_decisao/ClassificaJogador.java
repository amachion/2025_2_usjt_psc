//ler a idade de um jogador e dizer se ele é 
//juvenil: entre 18 e 20
//adulto: entre 21 e 28
//senior: entre 29 e 34
//master: de 35 para cima

import java.util.Scanner;

public class ClassificaJogador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite a idade do jogador");
        int idade = scanner.nextInt();
        if (idade < 18) {
            System.out.println("Base");
        }
        else if (idade <= 20) {
            System.out.println("Juvenil");
        }
        else if (idade <= 28) {
            System.out.println("Adulto");
        }
        else if (idade <= 34) {
            System.out.println("Senior");
        }
        else {
            System.out.println("Master");
        }
    }
}

//o IMC é dado por peso/(altura ao quadrado)
//ler o peso e a altura de uma pessoa, calcular e exibir seu IMC

import java.util.Scanner;

public class Saude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.print("digite sua altura: ");
        double altura = scanner.nextDouble();
        scanner.close();
        double imc1 = peso / (altura * altura);
        double imc2 = peso / Math.pow(altura, 2);
        System.out.println("seu imc e " + imc1);
        System.out.println("seu imc e " + imc2);
    }
}

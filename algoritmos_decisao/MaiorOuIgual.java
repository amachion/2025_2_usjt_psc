//ler 2 números e mostrar o maior

import java.util.Scanner;
public class MaiorOuIgual {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        System.out.print("digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        if (valor1 == valor2) {
            System.out.println ("valores iguais");
        }
        else if (valor1 > valor2) {
            System.out.println ("o maior valor e " + valor1);
        }
        else {
            System.out.println ("o maior valor e " + valor2);
        }
        scanner.close();
    }
}

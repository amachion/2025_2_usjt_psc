import java.util.Scanner;
public class Calculadora {
    public static void main (String[] args) {
        //entrada
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();
        System.out.print("digite o segundo numero: ");
        double numero2 = scanner.nextDouble();
        scanner.close();
        //processamento
        double resultado = numero1 + numero2;
        //saída
        System.out.println("soma = " + resultado);
        System.out.println("soma = " + (numero1 + numero2));
    }
}

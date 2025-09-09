//ler o prêmio da loteria, calcular 46% para o primeiro jocador, 32% para o segundo e o restante para 3o
import java.util.Scanner;
public class Loteria {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        //entrada
        System.out.print ("digite o valor do premio: ");
        double premio = scanner.nextDouble();
        double primeiro = 46 * premio / 100;
        double segundo = 32.0/100 * premio;
        double terceiro = premio - primeiro - segundo;
        System.out.println("o primeiro leva R$ " + String.format("%,.2f", primeiro) + "\no segundo leva R$ " + String.format("%,.2f",segundo) + "\ne o terceiro R$ " + String.format("%,.2f",terceiro));
        scanner.close();
    }
}

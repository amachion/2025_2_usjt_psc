import java.util.Scanner;
public class Entradas {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        //classe variável     instanciação
        System.out.println ("digite um inteiro");
        int valorInteiro = scanner.nextInt();
        System.out.println ("digite um decimal");
        double valorDecimal = scanner.nextDouble();
        System.out.println("digite um valor logico (true/false)");
        boolean valorLogico = scanner.nextBoolean();
        System.out.println("digite uma palavra");
        scanner.nextLine(); //sumidouro
        String palavra = scanner.nextLine();
        System.out.println("voce digitou:\n" + valorInteiro + "\n" + valorDecimal + "\n" + valorLogico + "\n" + palavra);
        scanner.close();
    }
}

import java.util.Scanner;

public class PesoIdeal {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite sua altura: ");
        double altura = scanner.nextDouble();
        System.out.print ("digite M para masculino ou F para feminino: ");
        scanner.nextLine(); //limpando o buffer
        String aux = scanner.nextLine().toUpperCase();
        char sexo = aux.charAt(0);
        if (sexo == 'M') {
            double pesoIdeal = 72.7 * altura - 58;
            System.out.printf("Seu peso ideal e %.2f", pesoIdeal);
        }
        else if (sexo == 'F') {
            double pesoIdeal = 62.1 * altura - 44.7;
            System.out.printf("Seu peso ideal e %.2f", pesoIdeal);
        }
        else {
            System.out.println("nao sei calcular");
        }
        scanner.close();
    }
}

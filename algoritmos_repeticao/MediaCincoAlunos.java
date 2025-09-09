import java.util.Scanner;

public class MediaCincoAlunos {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1; //valor inicial da condição do laço
        while (contador <= 5) {
            System.out.println ("aluno " + contador + ":\n");
            System.out.print ("digite a nota 1: ");
            double nota1 = scanner.nextDouble();
            System.out.print ("digite a nota 2: ");
            double nota2 = scanner.nextDouble();
            System.out.println ("media = " + (nota1 + nota2) / 2 + "\n");
            contador++;
        }
        scanner.close();
    }
}

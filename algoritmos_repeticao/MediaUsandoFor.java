//perguntar ao usuário quantos alunos ele tem, ler as notas e calcular a média de todos eles
import java.util.Scanner;
public class MediaUsandoFor {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("quantos alunos voce tem? ");
        int quantidadeAlunos = scanner.nextInt();
        for (int cont=1; cont <= quantidadeAlunos; cont++) {
            System.out.print ("digite a nota 1: ");
            double nota1 = scanner.nextDouble();
            System.out.print ("digite a nota 2: ");
            double nota2 = scanner.nextDouble();
            System.out.println ("media = " + (nota1 + nota2) / 2 + "\n");
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class TesteVetores {
    public static void main(String[] args) {
        int[] v1 = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<5; i++) {
            System.out.println("digite o elemento da posicao " + i);
            v1[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("posicao " + i + ", valor " + v1[i]);
        }
        System.out.println("\nQuantos nomes tem na lista?");
        int tamanho = scanner.nextInt();

        String[] lista = new String[tamanho];
        scanner.nextLine();//limpa buffer
        System.out.println("digite sua lista de nomes:");
        for (int i=0; i < lista.length; i++) {
            System.out.print((i+1) + "o nome: ");
            lista[i] = scanner.nextLine();
        }
        for (int i=0; i < lista.length; i++) {
            System.out.println (lista[i]);
        }
        scanner.close();

    }
}
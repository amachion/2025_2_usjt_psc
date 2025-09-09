import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Jogo1 {

    static int menu() {
        int op = Integer.parseInt(
                JOptionPane.showInputDialog("O que seu personagem vai fazer?" + "\n1 - cacar" +
                        "\n2 - comer" + "\n3 - dormir" + "\n0 - sair do jogo"));
        return op;
    }

    public static void main(String[] args) {
        Personagem cacador = new Personagem();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Qual o nome do personagem?");
        cacador.nome = scanner.nextLine();
        cacador.sono = 0;
        cacador.energia = random.nextInt(10);
        cacador.fome = random.nextInt(5);
        cacador.exibePersonagem();
        int opcao = menu();
        while (opcao != 0 && cacador.estaVivo) {
            if (opcao == 1) {
                cacador.cacar();
                cacador.exibePersonagem();
            } else if (opcao == 2) {
                cacador.comer();
                cacador.exibePersonagem();
            } else if (opcao == 3) {
                cacador.dormir();
                cacador.exibePersonagem();
            } else {
                System.out.println("personagem não sabe fazer isso");
            }
            if (cacador.estaVivo) {
                opcao = menu();
            }
        }
    }
}

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Jogo2 {

    static int menu() {
        int op = Integer.parseInt(
                JOptionPane.showInputDialog("O que seu personagem vai fazer?" + "\n1 - cacar" +
                        "\n2 - comer" + "\n3 - dormir" + "\n0 - sair do jogo"));
        return op;
    }

    public static void main(String[] args) {
        //o cacador é instanciado utilizando o construtor padrão
        Personagem cacador = new Personagem();
        cacador.exibePersonagem();
        //o scanner é instanciado utilizando um construtor que recebe um parâmetro
        Scanner scanner = new Scanner(System.in);
        //o random é instanciado utilizando o construtor padrão
        Random random = new Random();
        System.out.println("Qual o nome do personagem?");
        //////
        String s = scanner.nextLine();
        cacador.setNome(s);
        //cacador.setNome(scanner.nextLine());
        cacador.setSono(0);
        ////////
        int e = random.nextInt(10);
        cacador.setEnergia(e);
        //cacador.setEnergia(random.nextInt(10));
        int f = random.nextInt(5);
        cacador.setFome(f);
        //cacador.setFome(random.nextInt(5));
        cacador.exibePersonagem();
        int opcao = menu();
        while (opcao != 0 && cacador.getEstaVivo()) {
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
            if (cacador.getEstaVivo()) {
                opcao = menu();
            }
        }
        scanner.close();
    }
}

//vamos gerar um numero de 1 a 10 randomicamente, e pedir para o usuário digitar até ele acertar
import java.util.Random;
import java.util.Scanner;
public class UmJogoMuitoSimples {
    public static void main (String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        //vamos sortear um número de 1 a 10:
        int sorteado;
        int chute;
        int tentativas=0;
        do {
            tentativas++;
            sorteado = random.nextInt(10) + 1;
            System.out.print ("digite um numero de 1 a 10: ");
            chute = scanner.nextInt();
        } while (chute != sorteado);
        System.out.println ("EEEEEE, voce acertou com " + tentativas + " tentativas");
        scanner.close();
    }
}

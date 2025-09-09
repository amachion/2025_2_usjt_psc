// ler 2 notas (0 a 100), calcular a média e exibir aprovado para média >= 70 ou reprovado, caso contrário

import javax.swing.JOptionPane;
public class MediaNotas {
    public static void main(String[] args) {
        int nota1 = Integer.parseInt(
            JOptionPane.showInputDialog("digite a primeira nota")
        );
        int nota2 = Integer.parseInt(
            JOptionPane.showInputDialog("digite a segunda nota")
        );
        //precisa converter para double = casting
        double media = ((double)nota1 + (double)nota2) / 2;
        if (media >= 70) {
            JOptionPane.showMessageDialog(null, "voce foi aprovado com " + media);
        }
        else {
            JOptionPane.showMessageDialog(null, "voce foi reprovado com " + media);
        }
    }
}
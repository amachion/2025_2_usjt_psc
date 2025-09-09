
//ler os catetos, calcular e mostrar a hipotenusa
import javax.swing.JOptionPane;
public class Hipotenusa {
    public static void main (String[] args) {
        //declaração de variáveis e entrada de dados
        double catetoA;
        do {
            catetoA = Double.parseDouble(
                JOptionPane.showInputDialog(null, "digite o cateto a", "Entrada de dados", JOptionPane.QUESTION_MESSAGE)
            );
        } while (catetoA <= 0);

        double catetoB = Double.parseDouble(
            JOptionPane.showInputDialog("digite o cateto b")
        );
        while (catetoB <= 0) {
            catetoB = Double.parseDouble(
                JOptionPane.showInputDialog(null, "digite o cateto b", "o valor deve ser positivo", JOptionPane.WARNING_MESSAGE)
            );
        }
        //processamento: calcular a hipotenusa
        double hipotenusa = Math.sqrt(catetoA * catetoA + catetoB * catetoB);
        //saída: exibir o resultado
        JOptionPane.showMessageDialog(null, "hipotenusa = " + hipotenusa, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
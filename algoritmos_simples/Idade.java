//usando a classe JOptionPane, ler o ano atual e o ano de nascimento de uma pessoa, calcular e exibir sua idade

import javax.swing.JOptionPane;

public class Idade {
    public static void main(String[] args) {
        int anoAtual = Integer.parseInt(
            JOptionPane.showInputDialog("digite o ano atual")
        );
        int anoNascimento = Integer.parseInt(
            JOptionPane.showInputDialog("digite o ano de nascimento")
        );
        JOptionPane.showMessageDialog(null, "a idade e " + (anoAtual - anoNascimento));
    }
}
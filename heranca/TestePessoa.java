import javax.swing.JOptionPane;
public class TestePessoa {
    public static void main (String[] args) {
        Pessoa p1 = new Pessoa ("Ana", 20);
        String nome = JOptionPane.showInputDialog("digite um nome");
        int idade = Integer.parseInt(
            JOptionPane.showInputDialog("digite a idade")
        );
        Pessoa p2 = new Pessoa(nome, idade);
        JOptionPane.showMessageDialog(null, "p1: " + p1);
        JOptionPane.showMessageDialog(null, "p2: " + p2);

        Pessoa p3 = new Pessoa("Flavio");
        JOptionPane.showMessageDialog(null, "p3: " + p3);

        Pessoa p4 = new Pessoa();
        JOptionPane.showMessageDialog(null, "p4: " + p4);

        p4.setNome("Joao");
        JOptionPane.showMessageDialog(null, "nome da p4: " + p4.getNome());

        p4.fazAniversario();
        JOptionPane.showMessageDialog(null, "p4: " + p4);
    }
}

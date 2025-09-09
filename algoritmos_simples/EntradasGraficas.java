import javax.swing.JOptionPane;
public class EntradasGraficas {
    public static void main (String[] args) {
        String primeiroNome = JOptionPane.showInputDialog("Digite seu primeiro nome");
        String ultimoNome = JOptionPane.showInputDialog("digite seu ultimo nome");
        JOptionPane.showMessageDialog(null, "seu nome completo e " + primeiroNome + " " + ultimoNome);

        String temp = JOptionPane.showInputDialog("digite um inteiro");
        int inteiro = Integer.parseInt(temp);
        
        double real = Double.parseDouble(
            JOptionPane.showInputDialog("digite um ponto flutuante")
        );
        temp = JOptionPane.showInputDialog("digite true ou false");
        boolean eVerdade = Boolean.parseBoolean(temp);

        JOptionPane.showMessageDialog(null, "o inteiro e " + inteiro + "\no real e " + real + "\na logica e " + eVerdade);
    }
}

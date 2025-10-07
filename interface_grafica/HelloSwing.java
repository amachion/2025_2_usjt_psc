import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.awt.Container;

public class HelloSwing {
    public static void criarTela() {
        JFrame tela = new JFrame("Hello, Swing!!!");  //constroi moldura
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //define o "x"
        JLabel helloJLabel = new JLabel("Hello, again!!"); //constroi um label
        Container painel = tela.getContentPane(); //obtem painel de conteudo para o frame
        painel.add(helloJLabel);//adiciona o label ao painel
        
        tela.pack();//ajusta o tamanho ao conteúdo
        tela.setVisible(true);// torna o frame visível
        tela.setLocationRelativeTo(null);//centraliza a janelinha
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(
            () -> {criarTela();});
    }
}
//ler um inteiro de 1 a 12 e dizer qual é o mês
import javax.swing.JOptionPane;
public class MesesDoAno {
    public static void main (String[] args) {
        int mes = Integer.parseInt(
            JOptionPane.showInputDialog("digite um mes (1 a 12)")
        );
        switch (mes) {
            case 1: 
                System.out.println("janeiro");
                break;
            case 2:
                System.out.println("fevereiro");
                break;
            case 3:
                System.out.println("marco");
                break;
            case 4: 
                System.out.println("abril");
                break;
            case 5:
                System.out.println("maio");
                break;
            case 6:
                System.out.println("junho");
                break;
            case 7:
                System.out.println("julho");
                break;
            case 8:
                System.out.println("agosto");
                break;
            case 9:
                System.out.println("setembro");
                break;
            case 10:
                System.out.println("outubro");
                break;
            case 11:
                System.out.println("novembro");
                break;
            case 12:
                System.out.println("dezembro");
                break;
            default:
                System.out.println("valor invalido");
        }
        switch (mes) {
            case 4: case 6: case 9: case 11:
                JOptionPane.showMessageDialog(null, "30 dias");    
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                JOptionPane.showMessageDialog(null, "31 dias");    
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "28 ou 29 dias");
                break;
            default:
                JOptionPane.showMessageDialog(null, "mes invalido");
                break;
        }
    }
}

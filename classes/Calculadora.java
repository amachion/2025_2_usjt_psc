import javax.swing.JOptionPane;

public class Calculadora {
    static int soma (int a, int b) {
        return a + b;
    }
    //sobrecarga de método
    static int soma (int a, int b, int c) {
        return a + b + c;
    }
    static int soma (int a, int b, int c, int d) {
        return a + b + c + d;
    }
    static double soma (double a, double b) {
        return a + b;
    }
    static int soma (String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
    static int multiplica (int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        System.out.println(soma(2, 3));
        System.out.println(multiplica(14, 78));
        int a = 10, b = 20, c = 30;
        System.out.println(soma (a-b, c*a));
        System.out.println(soma(10, 20, 30));
        System.out.println(soma(10, 20, 30, 40));
        String num1 = JOptionPane.showInputDialog("digite um numero");
        String num2 = JOptionPane.showInputDialog("digite outro numero");

        System.out.println (soma(num1, num2));

        System.out.println(soma ("1", "2"));
    }
}
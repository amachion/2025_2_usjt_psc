public class Soma1a100 {
    public static void main (String[] args) {
        int soma=0;
        for (int i=1; i<=100; i++) {
            System.out.print (i + " ");
            soma = soma + i;
        }
        System.out.println ("\nsoma = " + soma);
    }
}

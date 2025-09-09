public class Variaveis {
    public static void main (String[] args) {
        //declarar duas variáveis inteiras
        int numero1=5, numero2=2;
        //declarar três variáveis double e atribuir valores a 2
        double decimal1 = 5.0, decimal2 = 2.0, decimal3;
        //declarar um caracter e atribuir um valor
        char opcao = 'a';
        //declarar dois booleanos e atribuir valores a cada um deles
        boolean eNovo = true, eFormando = false;
        //declarar duas Strings e atribuir valores
        String primeiroNome = "Andreia", ultimoNome = "Machion";
        System.out.println("O valor da variavel decimal1 e " + decimal1);
        System.out.println("O valor da variavel numero1 e " + numero1);
        System.out.println("minha opcao e: " + opcao);
        System.out.println("e novo? " + eNovo);
        System.out.println("Meu nome completo e " + primeiroNome + " " + ultimoNome);
        System.out.println(numero1 + " / " + numero2 + " = " + numero1/numero2);
        decimal3 = decimal1 / decimal2;
        System.out.println(decimal1 + " / " + decimal2 + " = " + decimal3);
    }
}

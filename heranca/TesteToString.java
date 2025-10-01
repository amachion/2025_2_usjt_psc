public class TesteToString {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro", 20);
        System.out.println("p1: " + p1);

        Estudante e1 = new Estudante("Luis", "Sistemas");
        System.out.println("e1: " + e1);
        e1.setIdade(21);
        System.out.println("e1: " + e1);
    }
}

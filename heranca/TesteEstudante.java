public class TesteEstudante {
    public static void main(String[] args) {
        Estudante e1 = new Estudante("Claudia", "Sistemas");
        Estudante e2 = new Estudante("Guilherme", 20, "Engenharia");
        System.out.println ("e1: " + e1);
        System.out.println ("e2: " + e2);
        e1.setIdade(19);
        e2.setCurso("CCP");
        System.out.println ("e1: " + e1);
        System.out.println ("e2: " + e2);
    }
}

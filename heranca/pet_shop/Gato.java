public class Gato extends Animal {
    @Override
    public void fazBarulho() {
        System.out.println(super.getNome() + "faz miau");
    }
}

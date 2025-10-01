public abstract class Animal {
    private String nome;
    //recriar o construtor padrão
    public Animal() {
        nome = "nononono";
    }
    public Animal (String nome) {
        this.nome = nome;
    }
    public String getNome () {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public abstract void fazBarulho ();
    public void dorme () {
        System.out.println("zzzzzzzzzzzzzzzz");
    }
    @Override
    public String toString () {
        return "nome: " + nome;
    }
}
public class Pessoa {
    //encapsulamento
    private String nome;
    private int idade;
    //construtores sobrecarregados
    public Pessoa (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa (String nome) {
        this.nome = nome;
    }
    public Pessoa () {}
    //métodos de acesso - permitem consultar valores dos atributos (get)
    public String getNome () {
        return nome;
    }
    public int getIdade () {
        return idade;
    }
    //métodos modificadores - permitem alterar valores dos atributos (set)
    public void setNome (String nome) {
        this.nome = nome;
    }
    public void setIdade (int idade) {
        this.idade = idade;
    }
    //representação textual de um objeto da classe Pessoa
    @Override
    public String toString () {
        return "nome = " + nome + ", idade = " + idade;
    }
    //métodos específicos
    public void fazAniversario() {
        idade++;
    }
}
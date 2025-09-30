public class Trabalhador extends Pessoa{
    private String profissao;
    public Trabalhador (String nome, int idade, String profissao) {
        super(nome, idade);
        this.profissao = profissao;
    }
    public Trabalhador (String nome, String profissao) {
        super(nome);
        this.profissao = profissao;
    }
    public Trabalhador() {}
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao (String profissao) {
        this.profissao = profissao;
    }
    @Override
    public String toString () {
        return super.toString() + ", profissao = " + profissao;
    }
}

public class Personagem {
    //os atributos devem ser encapsulados
    private String nome;
    private int fome;
    private int sono;
    private int energia;
    private boolean estaVivo = true;
    //construtor com parâmetros
    public Personagem (String nome, int energia, int sono, int fome) {
        this.nome = nome;
        this.energia = energia;
        this.fome = fome;
        this.sono = sono;
    }
    //métodos de acesso
    public String getNome() {
        return nome;
    }
    public int getFome() {
        return fome;
    }
    public int getSono() {
        return sono;
    }
    public int getEnergia () {
        return energia;
    }
    public boolean getEstaVivo() {
        return estaVivo;
    }
    //métodos modificadores
    public void setNome (String novoNome) {
        nome = novoNome;
    }
    public void setFome (int novaFome) {
        fome = novaFome;
    }
    public void setSono (int novoSono) {
        sono = novoSono;
    }
    public void setEnergia (int novaEnergia) {
        energia = novaEnergia;
    }
    public void setEstaVivo (boolean novoEstado) {
        estaVivo = novoEstado;
    }
    public void dormir () {
        if (sono > 0) {
            sono--;
        }
        if (fome < 4) {
            fome++;
        }
        if (energia < 9) {
            energia++;
        }
    }
    public void comer () {
        if (fome > 0) {
            fome--;
        }
        if (energia < 9) {
            energia++;
        }
    }
    public void cacar () {
        if (fome < 4) {
            fome++;
        }
        if (sono < 9) {
            sono++;
        }
        if (energia > 0) {
            energia--;
        }
        else {
            estaVivo = false;
        }
    }
    public void exibePersonagem() {
        System.out.println("Veja seu personagem:" + nome);
        System.out.println("sono = " + sono);
        System.out.println("fome = " + fome);
        System.out.println("energia = " + energia);
        if (estaVivo) {
            System.out.println ("ele esta vivo");
        }
        else {
            System.out.println ("ele morreu");
        }
    }
}
public class Personagem {
    //os atributos devem ser encapsulados
    private String nome;
    private int fome;
    private int sono;
    private int energia;
    private boolean vivo = true;
    //construtor com parâmetros
    public Personagem (String nome, int energia, int sono, int fome) {
        this(nome, energia, fome); //chamando o construtor da linha 21
        this.setSono(sono);
    }
    //sobrecarga de Construtor
    public Personagem (String nome) {
        this.nome = nome;
    }
    public Personagem (String nome, int energia) {
        this(nome); //chamando o construtor da linha 16
        this.setEnergia(energia); //reutiliza validação do set
    }
    public Personagem (String nome, int energia, int fome) {
        this(nome, energia); //chamando o construtor da linha 19
        this.setFome(fome);
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
    public boolean getVivo() {
        return vivo;
    }
    //métodos modificadores
    public void setNome (String nome) {
        this.nome = nome;
    }
    public void setFome (int fome) {
        if (fome >= 4) {
            this.fome = 4;
        }
        else if (fome <= 0) {
            this.fome = 0;
        }
        else {
            this.fome = fome;
        }
    }
    public void setSono (int sono) {
        if (sono >= 9) {
            this.sono = 9;
        }
        else if (sono <= 0) {
            this.sono = 0;
        }
        else {
            this.sono = sono;
        }
    }
    public void setEnergia (int energia) {
        if (energia >= 9) {
            this.energia = 9;
        }
        else if (energia <= 0) {
            this.energia = 0;
        }
        else {
            this.energia = energia;
        }
    }
    public void setVivo (boolean vivo) {
        this.vivo = vivo;
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
            vivo = false;
        }
    }
    public void exibePersonagem() {
        System.out.println("Veja seu personagem:" + nome);
        System.out.println("sono = " + sono);
        System.out.println("fome = " + fome);
        System.out.println("energia = " + energia);
        if (vivo) {
            System.out.println ("ele esta vivo");
        }
        else {
            System.out.println ("ele morreu");
        }
    }
}
public class Personagem {
    String nome;
    int fome;
    int sono;
    int energia;
    boolean estaVivo = true;
    void dormir () {
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
    void comer () {
        if (fome > 0) {
            fome--;
        }
        if (energia < 9) {
            energia++;
        }
    }
    void cacar () {
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
    void exibePersonagem() {
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
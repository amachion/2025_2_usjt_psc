public class Jogo4 {
    public static void main(String[] args) {
        Personagem heroi = new Personagem("Ben 10", 8, 2, 4);
        Personagem vilao = new Personagem("Tanus", 9, 0, 4);

        heroi.setEnergia(9);
        vilao.setEnergia(6);

        Personagem joao = new Personagem("Joao", 38);
        joao.exibePersonagem();
        
    }
}

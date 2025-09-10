public class Jogo3 {
    public static void main (String[] args) {
        Personagem heroi  = new Personagem("Thor", 9, 1, 4);
        heroi.exibePersonagem();
        Personagem vilao = new Personagem("Coringa", 5, 2, 3);
        vilao.exibePersonagem();
        heroi.setSono(2);
        heroi.exibePersonagem();
    }
}

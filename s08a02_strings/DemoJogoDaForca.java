public class DemoJogoDaForca {
    public static void main(String[] args) {
        JogoDaForca jogo = new JogoDaForca("miraculosamente");
        while(jogo.quantasLetrasAindaNÃ£oAdivinhadas() > 0) {
            jogo.pergunta();
        }
    }
}
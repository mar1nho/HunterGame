import java.awt.*;

public class Personagem {

    Criacao criacao = new Criacao();
    Image imagem = criacao.imagem();
    Image yuri = criacao.yuri();

    String[] inventario = { "Comida", "Vazio"};
    String nomeEscolhido = criacao.getNomeDoPersonagem();
    int carismaPoints = criacao.getCarismaPoints();
    int luckyPoints = criacao.getLuckyPoints();
    int idadeDoPersonagem = criacao.getIdade();
        int diasPassados = 0;
        int fome = 80;
        int energia = 100;
}

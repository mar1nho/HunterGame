import java.awt.*;

public class Personagem {

    Criacao criacao = new Criacao();
    String nome = criacao.getNomeDoPersonagem();
    int idade = criacao.getIdade();
    int carisma = criacao.getCarismaPoints();
    int sorte = criacao.getLuckyPoints();
    Image imagem = criacao.imagem();
    
    String nomeEscolhido = nome;
    int carismaPoints = carisma;
    int luckyPoints = sorte;
    int idadeDoPersonagem = idade;
        int dinheiro = 50;
        int diasPassados = 0;
        int sono = 2;
        int fome = 10;
        int energia = 7;
}


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class StatusIncial extends JFrame {

    Personagem personagem = new Personagem();

    public StatusIncial( ) {

        setTitle("Hunting for Life");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setBackground(Color.RED);

        // Adiciona o personagem selecionado na tela de seleção

        JLabel selectLabel = new JLabel();
        Image selectedPersonagem = personagem.imagem;
        ImageIcon selecionado = new ImageIcon(selectedPersonagem);
        selectLabel.setIcon(selecionado);
        add(selectLabel);

        JPanel characterPanel = new JPanel();
        characterPanel.setBounds(20,20,110,150);
        characterPanel.setBackground(new Color(0,0,0, 180));
        characterPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
        characterPanel.add(selectLabel);
        add(characterPanel);

        // Informações

        JLabel nomeDoPersonagem = new JLabel("Nome: " + personagem.nomeEscolhido);
        nomeDoPersonagem.setBounds(140,20,400,30);
        nomeDoPersonagem.setFont(new Font("Arial", Font.BOLD,20));
        nomeDoPersonagem.setForeground(Color.WHITE);
        add(nomeDoPersonagem);

        JLabel carismaDoPersonagem = new JLabel("Pontos de Carisma:" + String.valueOf(personagem.carismaPoints));
        carismaDoPersonagem.setBounds(140,100,400,30);
        carismaDoPersonagem.setFont(new Font("Arial", Font.BOLD,20));
        carismaDoPersonagem.setForeground(Color.WHITE);
        add(carismaDoPersonagem);

        JLabel sorteDoPersonagem = new JLabel("Pontos de Sorte: " + String.valueOf(personagem.luckyPoints));
        sorteDoPersonagem.setBounds(140,140,400,30);
        sorteDoPersonagem.setFont(new Font("Arial", Font.BOLD,20));
        sorteDoPersonagem.setForeground(Color.WHITE);
        add(sorteDoPersonagem);

        JLabel idadeDoPersonagem = new JLabel("Idade: " + String.valueOf(personagem.idadeDoPersonagem));
        idadeDoPersonagem.setBounds(140,50,400,30);
        idadeDoPersonagem.setFont(new Font("Arial", Font.BOLD,20));
        idadeDoPersonagem.setForeground(Color.WHITE);
        add(idadeDoPersonagem);

        personagem.criacao.setVisible(false);
        fundoDeTela();
        setVisible(true);

    }


    public void fundoDeTela(){
        //Adiciona o fundo de tela.
        ImageIcon fundo = new ImageIcon(getClass().getResource("/fundoStatus.jpg"));
        Image imagemRedimensionada = fundo.getImage().getScaledInstance(500,500, Image.SCALE_SMOOTH);
        ImageIcon fundoMenu = new ImageIcon(imagemRedimensionada);
        JLabel menuFundo = new JLabel(fundoMenu);
        JPanel menu = new JPanel();
        menu.add(menuFundo);
        menu.setBounds(0,0,500,500);
        add(menu);
    }
}
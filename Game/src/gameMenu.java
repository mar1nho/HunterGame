import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class gameMenu extends JFrame {
        Image img;
        JLabel label = new JLabel();
        Color corDeFundo = new Color(212,239,223);
    public gameMenu() throws InterruptedException {
        //Tamanho da tela e afins
        setTitle("Hunting for Life");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setBackground(Color.RED);

        //Adiciona a imagem do alce
        ImageIcon imagemOriginal = new ImageIcon(getClass().getResource("/moose.png"));
        Image imagemRedimensionada = imagemOriginal.getImage().getScaledInstance(160, 200, Image.SCALE_SMOOTH);
        ImageIcon imagem = new ImageIcon(imagemRedimensionada);
        JLabel imgLabel = new JLabel(imagem);
        JPanel painelImg = new JPanel();
            painelImg.add(imgLabel);
            painelImg.setBounds(165,95,160,200);
            painelImg.setOpaque(false);
        add(painelImg);

        //Título
        JButton title = new JButton("Instruções");
            title.setBounds(270,340,100,40);
            title.setBackground(Color.GREEN);
            title.setForeground(Color.BLACK);
            title.setFocusPainted(false);
            title.addActionListener(this::infos); // Ao abertar o botão, executa o metodo criado
        add(title);

        //INTRODUÇÃO
        JLabel introd = new JLabel("Bem-Vindo ao jogo de caça");
            introd.setBounds(150, 10, 500, 100);
            introd.setFont(new Font("Arial", Font.BOLD, 15));
            introd.setForeground(Color.GREEN);
        add(introd);

        // Botões //

        // Instruções
        JButton info = new JButton("Instruções");
            info.setBounds(270,340,100,40);
            info.setBackground(Color.GREEN);
            info.setForeground(Color.BLACK);
            info.setFocusPainted(false);
            info.addActionListener(this::infos); // Ao abertar o botão, executa o metodo criado
        add(info);

        //Iniciar, vai pra página de criação de personagem
        JButton iniciar = new JButton("Jogar");
        iniciar.setBounds(120,340,100,40);
        iniciar.setBackground(Color.GREEN);
        iniciar.setForeground(Color.BLACK);
        iniciar.setFocusPainted(false);
        iniciar.addActionListener(new ActionListener(){ // Adiciona um evento ao apertar o botão
            @Override
            public void actionPerformed(ActionEvent e){
                Criacao telaDeCriacao = new Criacao(); // Cria uma variável para a tela de criação de personagem
                telaDeCriacao.setVisible(true);  // Habilita a tela de criação
                setVisible(false);
            }
        });
        add(iniciar);
        fundoDeTela();
        setVisible(true);
    }

    private void infos(ActionEvent event){
        JOptionPane.showMessageDialog(null, "Olá Jogador", "Inicio do Jogo", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Deve ter dúvidas de como jogar esse jogo", "Inicio do Jogo", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Você deve sobreviver caçando para não morrer de fome.", "Instruções", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Você possui outras necessidades como energia, sono e possui um inventário com 2 slots.\nAlém disso você possui estatísticas e status, consulte sempre para saber suas necessisadaes", "Instruções", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mas cuidado...\nHá 2 situações que sua escolha será importante para sair vivo.", "Instruções", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Toda vez que você dome um dia se passa, e ao chegar no 10º dia vivo, você receberá uma missão.", "Instruções", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"Chegue ao 15º dia vivo e ganhe o jogo");
    }

    public void fundoDeTela(){
        //Adiciona o fundo de tela com o alce.
        ImageIcon fundo = new ImageIcon(getClass().getResource("/fundo.jpg"));
        Image imagemRedimensionada = fundo.getImage().getScaledInstance(500,500, Image.SCALE_SMOOTH);
        ImageIcon fundoMenu = new ImageIcon(imagemRedimensionada);
        JLabel menuFundo = new JLabel(fundoMenu);
        JPanel menu = new JPanel();
            menu.add(menuFundo);
            menu.setBackground(corDeFundo);
            menu.setBounds(0,0,500,500);
        add(menu);
    }
}





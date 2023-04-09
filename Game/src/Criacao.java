import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;


public class Criacao extends JFrame {

    static ImageIcon img;
    JPanel currentImagePanel =  null;

    static String nomeDoPersonagem;
    int pontosDeHabilidade = 3;
    static int carismaPoints = 0;
    static int luckyPoints = 0;
    static int idadeDoPersonagem;


    public static void main(String[] args) throws InterruptedException{
        gameMenu telaDeMenu = new gameMenu();

    }

    public Criacao(){

        setTitle("Hunting for Life");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setBackground(Color.RED);

        //Título
        JLabel title = new JLabel("Criação de Personagem");
            title.setBounds(140,0,400,100);
            title.setForeground(Color.WHITE);
            title.setFont(new Font("Arial", Font.BOLD, 20));
        add(title);

        //Seleção de personagem

        ImageIcon[] personagens = new ImageIcon[2];
            personagens[0] = new ImageIcon(getClass().getResource("/cacador.png"));
            personagens[1] = new ImageIcon(getClass().getResource("/caçadora.png"));

            JLabel selectLabel = new JLabel();
            add(selectLabel);

        JButton masc = new JButton("CAÇADOR");
            masc.setBounds(130,70,120,30);
            masc.setForeground(Color.WHITE);
            masc.setFocusPainted(false);
            masc.setBackground(Color.BLACK);
            masc.setFont(new Font("Arial", Font.BOLD, 15));
            masc.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    Image personagem = personagens[0].getImage().getScaledInstance(80,120, Image.SCALE_SMOOTH);
                    ImageIcon selecao = new ImageIcon(personagem);
                    selectLabel.setBounds(220,110,150,120);
                    selectLabel.setIcon(selecao);
                    img = selecao;
                    setVisible(true);
                }
            });
            add(masc);

        JButton fem = new JButton("CAÇADORA");
            fem.setBounds(260,70,120,30);
            fem.setForeground(Color.WHITE);
            fem.setFocusPainted(false);
            fem.setBackground(Color.BLACK);
            fem.setFont(new Font("Arial", Font.BOLD, 15));
            fem.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    Image personagem = personagens[1].getImage().getScaledInstance(95,130, Image.SCALE_SMOOTH);
                    ImageIcon selecao = new ImageIcon(personagem);
                    selectLabel.setBounds(210,100,150,130);
                    img = selecao;
                    selectLabel.setIcon(selecao);
                    setVisible(true);
                }
            });
        add(fem);

        //Campos de idade e nome

        JLabel nome = new JLabel("Nome: ");
            nome.setBounds(40,235,80,40);
            nome.setFont(new Font("Arial", Font.BOLD,20));
            nome.setForeground(Color.WHITE);
        add(nome);

        JLabel idade = new JLabel("Idade : ");
            idade.setBounds(40,265,80,40);
            idade.setFont(new Font("Arial", Font.BOLD,20));
            idade.setForeground(Color.WHITE);
        add(idade);

        //Inserir nome e idade

        Border border = BorderFactory.createLineBorder(Color.WHITE, 2);
        Color bgColor = new Color(0,0,0,127);

        JTextArea userName = new JTextArea("");
            userName.setBounds(230,240,150,30);
            userName.setFont(new Font("Arial", Font.BOLD, 18));
            userName.setBackground(bgColor);
            userName.setForeground(Color.WHITE);
            userName.setBorder(border);
        userName.setOpaque(false);
        add(userName);

        JTextArea userAge = new JTextArea("");
            userAge.setBounds(350,280,30,30);
            userAge.setFont(new Font("Arial", Font.BOLD, 18));
            userAge.setBackground(bgColor);
            userAge.setForeground(Color.WHITE);
            userAge.setBorder(border);
        userAge.setOpaque(false);

        add(userAge);

        // Habilidades: Carisma e Sorte


        JLabel habilidades = new JLabel("HABILIDADES                               " +"+"+ String.valueOf(pontosDeHabilidade));
            habilidades.setBounds(40,280,500,100);
            habilidades.setFont(new Font("Arial", Font.BOLD, 20));
            habilidades.setForeground(Color.WHITE);
        add(habilidades);

        JLabel carismaPointsLabel = new JLabel("CARISMA                                        " + String.valueOf(carismaPoints));
            carismaPointsLabel.setBounds(40,330,500,100);
            carismaPointsLabel.setFont(new Font("Arial", Font.BOLD, 20));
            carismaPointsLabel.setForeground(Color.WHITE);
        add(carismaPointsLabel);

        JLabel luckyPointsLabel = new JLabel("SORTE:                                          " + String.valueOf(luckyPoints));
            luckyPointsLabel.setBounds(40,350,500,100);
            luckyPointsLabel.setFont(new Font("Arial", Font.BOLD, 20));
            luckyPointsLabel.setForeground(Color.WHITE);
        add(luckyPointsLabel);

        // Selecionar pontos de habilidade

        JButton moreCarisma = new JButton("");
            moreCarisma.setBounds(385,372,15,15);
            moreCarisma.setBackground(Color.GREEN);
            moreCarisma.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if(pontosDeHabilidade == 0 ){
                        JOptionPane.showMessageDialog(null, "SEM PONTOS RESTANTES", "MENSAGGEM", JOptionPane.WARNING_MESSAGE);
                    } else {
                        carismaPoints++;
                        pontosDeHabilidade--;
                        carismaPointsLabel.setText("CARISMA                                        " + String.valueOf(carismaPoints));
                        habilidades.setText("HABILIDADES                               " +"+"+ String.valueOf(pontosDeHabilidade));
                    }
                }
            });
            add(moreCarisma);

        JButton lessCarisma = new JButton("");
            lessCarisma.setBounds(350,372,15,15);
            lessCarisma.setBackground(Color.RED);
            lessCarisma.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(carismaPoints > 0){
                    carismaPoints--;
                    pontosDeHabilidade++;
                    carismaPointsLabel.setText("CARISMA                                        " + String.valueOf(carismaPoints));
                    habilidades.setText("HABILIDADES                               " +"+"+ String.valueOf(pontosDeHabilidade));
                } else {
                    JOptionPane.showMessageDialog(null, "Não há pontos suficientes nessa habilidade", "Mensagem", JOptionPane.WARNING_MESSAGE );
                    }
                }
            });
            add(lessCarisma);

        JButton moreLucky = new JButton("");
            moreLucky.setBounds(385,395,15,15);
            moreLucky.setBackground(Color.GREEN);
            moreLucky.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(pontosDeHabilidade == 0){
                        JOptionPane.showMessageDialog(null, "SEM PONTOS RESTANTES", "MENSAGGEM", JOptionPane.WARNING_MESSAGE);
                    } else {
                        luckyPoints++;
                        pontosDeHabilidade--;
                        luckyPointsLabel.setText("SORTE:                                          " + String.valueOf(luckyPoints));
                        habilidades.setText("HABILIDADES                               " +"+"+ String.valueOf(pontosDeHabilidade));
                    }
                }
            });

        add(moreLucky);

        JButton lessLucky = new JButton("");
            lessLucky.setBounds(350,395,15,15);
            lessLucky.setBackground(Color.RED);
            lessLucky.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(luckyPoints > 0){
                        luckyPoints--;
                        pontosDeHabilidade++;
                        luckyPointsLabel.setText("SORTE:                                          " + String.valueOf(luckyPoints));
                        habilidades.setText("HABILIDADES                               " +"+"+ String.valueOf(pontosDeHabilidade));
                    } else {
                        JOptionPane.showMessageDialog(null, "Não há pontos suficientes nessa habilidade", "Mensagem", JOptionPane.WARNING_MESSAGE );
                    }
                }
            });
        add(lessLucky);

        // Armazenar as informações do personagem em variáveis e ir para a tela de Status Inicial

        JButton statusScreen = new JButton("SALVAR");
        statusScreen.setBounds(200,420,100,30);
        statusScreen.setForeground(Color.BLACK);
        statusScreen.setBackground(Color.WHITE);
        statusScreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String novoNome = userName.getText();
                nomeDoPersonagem = novoNome;
                int idade = Integer.parseInt(userAge.getText());
                idadeDoPersonagem = idade;
                StatusIncial status = new StatusIncial();
                status.setVisible(true);
                setVisible(false);
            }
        });

        add(statusScreen);
        fundoDeTela();
        setVisible(true);
    }

    public static String getNomeDoPersonagem() {
        return nomeDoPersonagem;
    }

    public static int getIdade() {
        return idadeDoPersonagem;
    }

    public static int getCarismaPoints() {
        return carismaPoints;
    }

    public static int getLuckyPoints() {
        return luckyPoints;
    }

    public static Image imagem(){
        return img.getImage();
    }

    public void fundoDeTela(){
        //Adiciona o fundo de tela.
        ImageIcon fundo = new ImageIcon(getClass().getResource("/fundoCri.png"));
        Image imagemRedimensionada = fundo.getImage().getScaledInstance(500,500, Image.SCALE_SMOOTH);
        ImageIcon fundoMenu = new ImageIcon(imagemRedimensionada);
        JLabel menuFundo = new JLabel(fundoMenu);
        JPanel menu = new JPanel();
            menu.add(menuFundo);
            menu.setBounds(0,0,500,500);
        add(menu);
    }
}

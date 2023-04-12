import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jogo extends JFrame{

    Personagem personagem = new Personagem();

    String nomeEscolhido = personagem.nomeEscolhido;
    int carismaPoints = personagem.carismaPoints;
    int luckyPoints = personagem.luckyPoints;
    int idadeDoPersonagem = personagem.idadeDoPersonagem;
    int diasPassados = personagem.diasPassados;
    int fome = personagem.fome;
    int energia = personagem.energia;

    public static void main(String[] args) {
        new Jogo();
    }

    public Jogo(){

        setTitle("Hunting for Life");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setBackground(Color.RED);

        Border border = BorderFactory.createLineBorder(Color.BLACK, 4);
        Border border2 = BorderFactory.createLineBorder(Color.RED, 2);

        // Informações //

        //FOME
        JLabel fomeLabel = new JLabel("FOME");
            fomeLabel.setForeground(Color.BLACK);
            fomeLabel.setBounds(30, 20, fome, 25);
            fomeLabel.setFont(new Font("Arial", Font.BOLD, 9));
            fomeLabel.setOpaque(true);
            fomeLabel.setHorizontalAlignment(JLabel.CENTER);
            fomeLabel.setBackground(Color.GREEN);
            add(fomeLabel);

        //ENERGIA
        JLabel energiaLabel = new JLabel("ENERGIA");
            energiaLabel.setForeground(Color.BLACK);
            energiaLabel.setBounds(30, 53, energia, 25);
            energiaLabel.setFont(new Font("Arial", Font.BOLD, 9));
            energiaLabel.setOpaque(true);
            energiaLabel.setHorizontalAlignment(JLabel.CENTER);
            energiaLabel.setBackground(Color.YELLOW);
            add(energiaLabel);
            
        //Dias Passados
        JLabel tempoString = new JLabel("Dia: " );
            tempoString.setForeground(Color.WHITE);
            tempoString.setBounds(419,10,100,40);
            add(tempoString);
        JLabel tempo = new JLabel(String.valueOf(diasPassados));
            tempo.setForeground(Color.WHITE);
            tempo.setBounds(441,10,100,40);
            add(tempo);
        JLabel labelTempo = new JLabel();
            labelTempo.setBounds(416, 15, 40, 30);
            labelTempo.setFont(new Font("Arial", Font.BOLD, 9));
            labelTempo.setBackground(Color.BLACK);
            labelTempo.setOpaque(true);
            labelTempo.setHorizontalAlignment(JLabel.CENTER);
            labelTempo.setBorder(border2);
            add(labelTempo);
            
        // Habilidades
        JLabel luckyString = new JLabel("Sorte:" );
            luckyString.setForeground(Color.BLACK);
            luckyString.setBounds(150,17,100,40);
            add(luckyString);
        JLabel luckyNumber = new JLabel(String.valueOf(luckyPoints));
            luckyNumber.setForeground(Color.BLACK);
            luckyNumber.setBounds(240,17,100,40);
            add(luckyNumber);
            
        JLabel carismaString = new JLabel("Carisma:" );
            carismaString.setForeground(Color.BLACK);
            carismaString.setBounds(150,45,100,40);
            add(carismaString);
        JLabel carismaNumber = new JLabel(String.valueOf(carismaPoints));
            carismaNumber.setForeground(Color.BLACK);
            carismaNumber.setBounds(240,45,100,40);
            add(carismaNumber);

        //Label em volta
        JLabel labelNecessidades = new JLabel();
            labelNecessidades.setBounds(25, 15, 114, 70);
            labelNecessidades.setFont(new Font("Arial", Font.BOLD, 9));
            labelNecessidades.setHorizontalAlignment(JLabel.CENTER);
            labelNecessidades.setBorder(border);
            add(labelNecessidades);

        JLabel labelHabilidades = new JLabel();
            labelHabilidades.setBounds(143, 15, 114, 70);
            labelHabilidades.setFont(new Font("Arial", Font.BOLD, 9));
            labelHabilidades.setHorizontalAlignment(JLabel.CENTER);
            labelHabilidades.setBorder(border);
            add(labelHabilidades);

        JLabel labelInventario = new JLabel();
            labelInventario.setBounds(261, 15, 114, 70);
            labelInventario.setFont(new Font("Arial", Font.BOLD, 9));
            labelInventario.setHorizontalAlignment(JLabel.CENTER);
            labelInventario.setBorder(border);
            add(labelInventario);

        //Botões e ações

        JButton comer = new JButton("Comer");
        comer.setBounds(30,400,80,30);
        comer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fomeLabel.getWidth() < 100 && fomeLabel.getWidth() >= 10) {
                    int largura = fomeLabel.getWidth() + 10;
                    fomeLabel.setBounds(30, 20, largura, 25);
                    fomeLabel.setFont(new Font("Arial", Font.BOLD, 10));
                    fomeLabel.setBackground(Color.green);
                    if(fomeLabel.getWidth() <= 60 && fomeLabel.getWidth() >= 40) {
                        fomeLabel.setBackground(Color.ORANGE);
                    } if(fomeLabel.getWidth() <= 30) {
                        fomeLabel.setBackground(Color.RED);
                        JOptionPane.showMessageDialog(null, "Compre algo para comer ou coma logo, você irá morrer.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Sem fome");
                }
            }
        });
        add(comer);

        JButton dormir = new JButton("Dormir");
        dormir.setBounds(130,400,80,30);
        dormir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int larguraFome = fomeLabel.getWidth();
                int larguraEnergia = energiaLabel.getWidth();
                int novaLarguraFome = larguraFome - 20;
                int novaLarguraEnergia = larguraEnergia + 20;

                if(fomeLabel.getWidth() > 20 && energiaLabel.getWidth() < 100){
                    energiaLabel.setBounds(energiaLabel.getX(), energiaLabel.getY(), novaLarguraEnergia, energiaLabel.getHeight());
                    fomeLabel.setBounds(fomeLabel.getX(), fomeLabel.getY(), novaLarguraFome, fomeLabel.getHeight());
                    diasPassados++;
                    tempo.setText(String.valueOf(diasPassados));
                } if(energiaLabel.getWidth() < 40) {
                    energiaLabel.setBackground(Color.red);
                } if(energiaLabel.getWidth() > 40) {
                    energiaLabel.setBackground(Color.YELLOW);
                } if(fomeLabel.getWidth() > 65) {
                    fomeLabel.setBackground(Color.green);
                } if(fomeLabel.getWidth() <= 60 && fomeLabel.getWidth() >= 40) {
                    fomeLabel.setBackground(Color.ORANGE);
                } if(fomeLabel.getWidth() <= 30) {
                    fomeLabel.setBackground(Color.RED);
                    JOptionPane.showMessageDialog(null, "Compre algo para comer ou coma logo, você irá morrer.");
                } if(energiaLabel.getWidth() == 100){
                    JOptionPane.showMessageDialog(null, "Você está sem sono!");
                }
            }
        });
        add(dormir);

        JButton cacar = new JButton("Caçar");
        cacar.setBounds(230,400,80,30);
        cacar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                energiaLabel.setBounds(energiaLabel.getX(), energiaLabel.getY(), energiaLabel.getWidth() - 20, energiaLabel.getHeight());
            }
        });
        add(cacar);

        JButton viajar = new JButton("Viajar");
        viajar.setBounds(330,400,125,30);
        add(viajar);

        personagem.criacao.setVisible(false);
            setVisible(true);
        }
    }


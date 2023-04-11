import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jogo extends JFrame{

    Personagem personagem = new Personagem();


    public Jogo(){

        setTitle("Hunting for Life");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setBackground(Color.RED);

        JPanel vidaPanel = new JPanel();
            vidaPanel.setBounds(300,20,personagem.fome,25);
            vidaPanel.setBackground(new Color(255,0,0, 200));
            vidaPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
            add(vidaPanel);

        JButton comer = new JButton("Comer");
            comer.setBounds(300,50,80,35);
            comer.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int novaLargura = vidaPanel.getWidth() + 8;
                    vidaPanel.setBounds(vidaPanel.getX(), vidaPanel.getY(), novaLargura, vidaPanel.getHeight());
                    if(vidaPanel.getWidth() > 19){
                        vidaPanel.setBackground(Color.GREEN);
                    } if(vidaPanel.getWidth() >= 80){
                        JOptionPane.showMessageDialog(null, "Você está sem fome!");
                    }
                }
            });
            add(comer);

            JButton dormir = new JButton("Dormir");
            dormir.setBounds(150,50,80,35);
            dormir.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int novaLargura = vidaPanel.getWidth() - 9;
                    vidaPanel.setBounds(vidaPanel.getX(), vidaPanel.getY(), novaLargura, vidaPanel.getHeight());
                    if(vidaPanel.getWidth() < 19){
                        vidaPanel.setBackground(Color.RED);
                    } if(vidaPanel.getWidth() < 1){
                        JOptionPane.showMessageDialog(null, "Você está com fome!");
                    }
                }
            });
            add(dormir);
        }
    }



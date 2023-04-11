package testeteste;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class teste extends JFrame {
	 
			 
	public static void main(String[] args) {
		new teste();
	}
	
	public teste(){
		setTitle("Hunting for Life");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
               
        JLabel negocinho = new JLabel("FOME");
        negocinho.setForeground(Color.white);
        negocinho.setBounds(30, 20, 80, 25);
        negocinho.setFont(new Font("Arial", Font.BOLD, 9));
        negocinho.setOpaque(true);
        negocinho.setBackground(Color.GREEN);
        add(negocinho);
        
        JButton botao = new JButton("Comer");
        	botao.setBounds(30,400,80,30);
        	botao.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(negocinho.getWidth() < 100 && negocinho.getWidth() >= 30) {
					int largura = negocinho.getWidth() + 10;
					negocinho.setBounds(30, 20, largura, 25);	
					negocinho.setBackground(Color.green);
					} else {
						JOptionPane.showMessageDialog(null, "Sem fome");
					}
	            }
	        });
	        add(botao);
	        
	    JButton botao2 = new JButton("Dormir");
	    	botao2.setBounds(130,400,80,30);
	    	botao2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(negocinho.getWidth() > 30) {
						int largura = negocinho.getWidth() - 10;
						negocinho.setBounds(30, 20, largura, 25);
						negocinho.setBackground(Color.GREEN);
				}	if(negocinho.getWidth() <= 30) {
						negocinho.setBackground(Color.red);
						JOptionPane.showMessageDialog(null, "Muita fome, você encontra dificuldade para dormir!");
				}	if(negocinho.getWidth() <= 50) {
						negocinho.setBackground(Color.red);
				}	if(negocinho.getWidth() <= 50 && negocinho.getWidth() >= 40) {
						negocinho.setBackground(Color.ORANGE);
				}
	         }
	      });
	        add(botao2);
	        
	    JButton botao3 = new JButton("Caçar");
	    	botao3.setBounds(230,400,80,30);
	    	botao3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
	            }
	        });
	        add(botao3);
        setVisible(true);
	}
}

/*
JDialog dialog = new JDialog(this, "Janela de Diálogo", true); // O terceiro parâmetro "true" indica que é uma janela modal
dialog.setSize(200, 150); // Definir o tamanho da janela de diálogo
dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE); // Configurar a ação padrão ao fechar a janela
dialog.setLocationRelativeTo(this); // Definir a posição da janela de diálogo em relação à janela principal

// Adicionar componentes à janela de diálogo
JLabel label = new JLabel("Esta é uma janela de diálogo");
dialog.add(label);*/

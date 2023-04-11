package testeteste;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

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
               
        JLabel fome = new JLabel("FOME");
        fome.setForeground(Color.BLACK);
        fome.setBounds(30, 20, 80, 25);
        fome.setFont(new Font("Arial", Font.BOLD, 9));
        fome.setOpaque(true);
        fome.setHorizontalAlignment(JLabel.CENTER);
        fome.setBackground(Color.GREEN);
        add(fome);
        
        JLabel energia = new JLabel("ENERGIA");
        energia.setForeground(Color.BLACK);
        energia.setBounds(30, 50, 100, 25);
        energia.setFont(new Font("Arial", Font.BOLD, 9));
        energia.setOpaque(true);
        energia.setBackground(Color.YELLOW);
        add(energia);
        
        JLabel label = new JLabel();
        label.setBounds(25, 15, 114, 150);
        label.setFont(new Font("Arial", Font.BOLD, 9));
        label.setHorizontalAlignment(JLabel.CENTER);
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        label.setBorder(border);
        add(label);
        
        
          
        JButton comer = new JButton("Comer");
        comer.setBounds(30,400,80,30);
        comer.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(fome.getWidth() < 100 && fome.getWidth() >= 20) {
						int largura = fome.getWidth() + 10;
						fome.setBounds(30, 20, largura, 25);	
						fome.setFont(new Font("Arial", Font.BOLD, 10));
						fome.setBackground(Color.green);
					if(fome.getWidth() <= 60 && fome.getWidth() >= 30) {
						fome.setBackground(Color.ORANGE);
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
					if(fome.getWidth() > 30) {
						int largura = fome.getWidth() - 13;
						int larguraEnergia = energia.getWidth() + 25;
						energia.setBounds(30, 50, larguraEnergia, 25);
						fome.setBounds(30, 20, largura, 25);
						fome.setBackground(Color.GREEN);
				}	if(fome.getWidth() <= 30) {
						fome.setFont(new Font("Arial", Font.BOLD, 7));
						fome.setBackground(Color.red);
						JOptionPane.showMessageDialog(null, "Muita fome, você encontra dificuldade para dormir!");
				}	if(fome.getWidth() <= 50) {
						fome.setBackground(Color.red);
				}	if(fome.getWidth() <= 60 && fome.getWidth() >= 30) {
						fome.setBackground(Color.ORANGE);
				}
	         }
	      });
	        add(dormir);
	        
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




/*
         JFrame janela = new JFrame();
        janela.setSize(200, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um novo JPanel
        JPanel painel = new JPanel();
        painel.setLayout(null);
        painel.setBackground(Color.BLUE); // Define a cor de fundo como azul
        janela.add(painel);

        // Cria a primeira JLabel (fome)
        JLabel fome = new JLabel("FOME");
        fome.setForeground(Color.BLACK);
        fome.setBounds(30, 20, 80, 25);
        fome.setFont(new Font("Arial", Font.BOLD, 9));
        fome.setOpaque(true);
        fome.setBackground(Color.GREEN);
        painel.add(fome);

        // Cria a segunda JLabel (energia)
        JLabel energia = new JLabel("ENERGIA");
        energia.setForeground(Color.BLACK);
        energia.setBounds(30, 50, 100, 25);
        energia.setFont(new Font("Arial", Font.BOLD, 9));
        energia.setOpaque(true);
        energia.setBackground(Color.YELLOW);
        painel.add(energia);

        // Exibe a janela
        janela.setVisible(true);*/

/*
         
        ImageIcon faca = new ImageIcon(getClass().getResource("faca.png"));
        Image faceRedimensionada = faca.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        ImageIcon facaLoja = new ImageIcon(faceRedimensionada);
        
        JLabel imgLabel = new JLabel();
        imgLabel.setBounds(20,20,80,80);
        imgLabel.setBackground(Color.GREEN);
        imgLabel.setOpaque(true);
        imgLabel.setIcon(facaLoja);
        add(imgLabel);

        JLabel imgLabel2 = new JLabel();
        imgLabel2.setBounds(120,20,80,80);
        imgLabel2.setBackground(Color.GREEN);
        imgLabel2.setOpaque(true);
        imgLabel2.setIcon(facaLoja);
        add(imgLabel2);
        
        JLabel imgLabel3 = new JLabel();
        imgLabel3.setBounds(220,20,80,80);
        imgLabel3.setBackground(Color.GREEN);
        imgLabel3.setOpaque(true);
        imgLabel3.setIcon(facaLoja);
        add(imgLabel3);
        
        JButton comprarArma = new JButton("Comprar");
        	comprarArma.setBounds(20,100,80,20);
        	comprarArma.setFont(new Font("Arial", Font.BOLD, 10));
        	add(comprarArma);
		*/



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class gameMenu extends JFrame {
    
    JLabel label = new JLabel();
    int y = 20;
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
       
        
    //Cria o logo em ASCII
    for(int j = 0; j < 12; j++){
        String[] menuIcon = {" ___            ___","/      \\          /      \\","\\_     \\        /  __/"," _\\     \\      /  /__"," \\___  \\__/  __/","     \\_          \\_","       | @ @  \\_","       |","     _/     /\\","    /o)  (o/\\ \\_","    \\_____/ /","      \\____/"};
        label = new JLabel(menuIcon[j]);
        y += 15;
        label.setBounds(190, y ,400,50);
        label.setFont(new Font("Arial", Font.BOLD, 15));     
        add(label);
        setVisible(true);
            if(j != 0){
                Thread.sleep(500);
                setVisible(false);
            }
        Thread.sleep(500);
        
    }
    
    //Título
   
    
    
    JLabel title = new JLabel("Hunting for Life");
    title.setBounds(160, -15, 400, 100);
    title.setFont(new Font("Arial", Font.BOLD, 25));
    add(title);
    
    //INTRODUÇÃO
    JLabel introd = new JLabel("Bem-Vindo ao jogo de caça de texto. Selecione abaixo as opções:");
    introd.setBounds(40, 240, 500, 100);
    introd.setFont(new Font("Arial", Font.PLAIN, 15)); 
    add(introd);
    
    // Botões
    
    JButton info = new JButton("Instruções");
    info.setBounds(270,340,100,40);
    info.setBackground(Color.GREEN);
    info.setForeground(Color.BLACK);
    info.setFocusPainted(false);
    info.addActionListener(this::infos);
    add(info);
    
    JButton iniciar = new JButton("Jogar");
    iniciar.setBounds(120,340,100,40);
    iniciar.setBackground(Color.GREEN);
    iniciar.setForeground(Color.BLACK);
    iniciar.setFocusPainted(false);
    iniciar.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            Criacao telaDeCriacao = new Criacao();
            telaDeCriacao.setVisible(true);
            setVisible(false);
        }
    });
    add(iniciar);
    
    
    
            
    corDeFundo();
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
    
    
    
    
    
    
    public void corDeFundo(){
        JPanel corMenu = new JPanel();
        corMenu.setBackground(corDeFundo);
        corMenu.setBounds(0,0,500,500);
        add(corMenu);
    }
    
   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuGame;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author gusta
 */
public class Criacao extends JFrame{
    
    
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
        
        
        
        
    }
}

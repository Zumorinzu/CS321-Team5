/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import javax.swing.JFrame;

/**
 *
 * @author brian
 */
public class Main 
{
    public static void main(String[] args) 
    {
      JFrame window = new JFrame();  
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setResizable(true);
      window.setTitle("Fruit Game Window");
      
      GamePanel gamePanel = new GamePanel();
      window.add(gamePanel);
      
      window.pack();
      
      window.setLocationRelativeTo(null);
      window.setVisible(true);
        
      gamePanel.startGameThread();
      
    }
    
}

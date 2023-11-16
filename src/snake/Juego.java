/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snake;

import javax.swing.JFrame;

/**
 *
 * @author Cristina
 */
public class Juego extends JFrame{
    PanelDelJuego obj = new PanelDelJuego();
  
   Juego(){
       this.add(obj);
       this.setTitle("Snake");
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setResizable(false);
       this.pack();
       this.setVisible(true);
       this.setLocationRelativeTo(null);
   }

 public static void main(String[] args) {
        // TODO code application logic here
        Juego snake = new Juego();
        snake.setVisible(true);
    }}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package changebgcolorbuttons;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Aluno
 */
public class Frame extends JFrame {
    JButton colorButton1;
    JButton colorButton2;
    JButton colorButton3;
    
    public Frame(){
        super("Programa que muda a cor baseado no botão que você aperta (sim esse nome é enorme)");
        setLayout(new FlowLayout());
        
        ColorButtonHandler handler = new ColorButtonHandler();
        
        colorButton1 = new JButton("Azul");
        colorButton1.addActionListener(handler);
        
        colorButton2 = new JButton("Vermelho");
        colorButton2.addActionListener(handler);
        
        colorButton3 = new JButton("Amarelo");
        colorButton3.addActionListener(handler);
        
        add(colorButton1);
        add(colorButton2);
        add(colorButton3);
        
        
    }
    
    private class ColorButtonHandler implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Object pressedButton = e.getSource();
            
            if(pressedButton == colorButton1){
                System.out.println("Apertado botão 1");
                Frame.this.getContentPane().setBackground( Color.blue );
                
            }else if(pressedButton == colorButton2){
                System.out.println("Apertado botão 2");
                Frame.this.getContentPane().setBackground( Color.red );
                
            }else if(pressedButton == colorButton3){
                System.out.println("Apertado botão 3");
                Frame.this.getContentPane().setBackground( Color.yellow );
            }
            
        }
        
    }
}

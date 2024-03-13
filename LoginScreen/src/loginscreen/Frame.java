/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginscreen;

/**
 *
 * @author Aluno
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Frame extends JFrame{

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPanel loginPanel;
    private JLabel labelIF;
    private JButton loginButton;

    public Frame(){
        super("Fazer login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        
        loginPanel = new JPanel(new GridLayout(2, 1));
        
        Icon logoIF = new ImageIcon(getClass().getResource("logoIF.png"));
        labelIF = new JLabel();
        labelIF.setIcon(logoIF);
        
        JPanel userPassPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,0,35 ));
        userPassPanel.setPreferredSize(new Dimension(250, 150));
        
        usernameField = new JTextField("Nome de usuário");
        usernameField.setColumns(20);
        
        passwordField = new JPasswordField("Senha");
        passwordField.setColumns(20);
        
        userPassPanel.add(usernameField);
        userPassPanel.add(passwordField);
        
        JPanel loginButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 20));
        loginButton = new JButton("Ok");
        loginButton.setPreferredSize(new Dimension(50, 20));
        loginButtonPanel.add(loginButton);
        

        loginPanel.add(userPassPanel);
        loginPanel.add(loginButtonPanel);
        
        LoginHandler handler = new LoginHandler();
        loginButton.addActionListener(handler);
        
        
        add(loginPanel, BorderLayout.EAST);
        add(labelIF, BorderLayout.WEST);
        
        setVisible(true);
        
    }
    
    private class LoginHandler implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Olá "+usernameField.getText()+", sua senha é "+ new String(passwordField.getPassword()).trim());
            
        }
        
    }
    
}

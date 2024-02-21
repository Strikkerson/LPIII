/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iflogo;

import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class IFLogo extends JFrame{
       
    JLabel labelIF;
    
    public IFLogo(){
        super("IFMT - Campus Cuiabá");
        setLayout(new FlowLayout());
        
        Icon logoIF = new ImageIcon(getClass().getResource("logoIF.png"));
        labelIF = new JLabel("INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE MATO GROSSO");
        labelIF.setIcon(logoIF);
        labelIF.setHorizontalTextPosition(SwingConstants.CENTER);
        labelIF.setVerticalTextPosition(SwingConstants.BOTTOM);
        labelIF.setToolTipText("Logotipo do Instituto Federal de Mato Grosso");
        
        add(labelIF);
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textditengah;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Panel;
/**
 *
 * @author hp
 */
public class Textditengah extends Panel{
Textditengah(){
    setBackground(Color.GRAY);
    
}
public void paint  (Graphics g){
    Font f = new Font ("Helvetica", Font.BOLD,48);
    FontMetrics fm = getFontMetrics(f);
    g.setFont(f);
    
    String s = "Text Ini Tampil ditengah";
    int xpos = (this.size().width - fm.stringWidth(s)) / 2;
    int ypos = (this.size().height)/2;
    g.drawString(s, xpos, ypos);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Frame f = new Frame("Testing Graphics Panel"); 
                Textditengah gp = new Textditengah ();
                        f.add(gp);
                        f.setSize(900, 900);
                        f.setVisible(true);
    }
    
}

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/*  <applet code="ColorApplet.class" width="400" height="150"
          alt="Error loading applet!"> </applet> */

public class ColorApplet extends Applet {   
   public void paint(Graphics g) {
      setBackground(Color.CYAN);   
      g.setColor(Color.BLACK); 
      g.setFont(new Font("Times New Roman", Font.BOLD, 30)); 
      g.drawString("Hello world", 20, 80);

   }
}

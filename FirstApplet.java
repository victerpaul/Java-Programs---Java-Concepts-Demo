import java.awt.*;
import java.applet.*;
public class FirstApplet extends Applet
{
	String str;
	public void init()
	{
		str = "Java is interesting!";
	}
	public void paint(Graphics g)
	{
		g.drawString(str, 70, 80);
	}
}

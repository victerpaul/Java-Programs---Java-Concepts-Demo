//ParamMsg.java
import java.applet.Applet;
import java.awt.*;

public class ParamMsg extends Applet {

	String msg;

	public void init()
	{
		msg = getParameter("Greetings");
		if( msg == null)
			msg = "Hello";
	}
	public void paint(Graphics g) {
  		g.drawString (msg,10, 100);
	}
}

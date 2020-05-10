/*
<applet code ="DisplayImage.class" width = 200 height = 200>
</applet>
*/

import java.awt.*;
import java.applet.*;
public class DisplayImage extends Applet
{
	Image img;
	public void init()
	{
		img = getImage(getCodeBase(),"bg_global_logo.jpg");
	}
	public void paint(Graphics g)
	{
		g.drawImage(img,20,20,this);
	}
}

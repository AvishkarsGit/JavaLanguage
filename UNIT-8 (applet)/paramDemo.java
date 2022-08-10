import java.applet.*;
import java.awt.*;
public class paramDemo extends Applet
{
	String msg;
	public void init()
	{
		msg=getParameter("massage");
	}
	public void paint(Graphics g)
	{
		g.drawString("You have Enterd "+msg,100,50);
	}
}
/*
<applet code="paramDemo.class" width="500" height="500">
<param name="massage" value="Indian Army">
</applet>
*/
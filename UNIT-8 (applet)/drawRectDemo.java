//drawOval Method
import java.applet.*;
import java.awt.*;
public class drawRectDemo extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(10,20,150,80);
		g.fillRect(200,20,150,80);
	}
}
/*
<applet code="drawRectDemo.class" width="500" height="500">
</applet>
*/	
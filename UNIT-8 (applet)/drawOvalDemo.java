//drawOval Method
import java.applet.*;
import java.awt.*;
public class drawOvalDemo extends Applet
{
	public void paint(Graphics g)
	{
		g.drawOval(50,80,100,100);
		g.fillOval(200,80,100,100);
		g.drawOval(50,200,150,90);
		g.fillOval(260,200,150,90);
	}
}
/*
<applet code="drawOvalDemo.class" width="500" height="500">
</applet>
*/
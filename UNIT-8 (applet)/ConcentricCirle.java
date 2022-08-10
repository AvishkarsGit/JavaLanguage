//Draw concentric circle
import java.applet.*;
import java.awt.*;
public class ConcentricCirle extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.fillOval(170,180,200,200);
		g.setColor(Color.green);
		g.fillOval(200,210,150,150);
		g.setColor(Color.red);
		g.fillOval(220,240,100,100);
	}
}
/*
<applet code="ConcentricCirle.class" width="500" height="500">
</applet>
*/			
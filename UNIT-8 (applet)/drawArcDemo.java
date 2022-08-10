//drawArc Method
import java.applet.*;
import java.awt.*;
public class drawArcDemo extends Applet
{
	public void paint(Graphics g)
	{
		g.drawArc(50,80,100,150,45,180);
	}
}
/*
<applet code="drawArcDemo.class" width="500" height="500">
</applet>
*/	
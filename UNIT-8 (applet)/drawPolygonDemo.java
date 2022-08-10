//drawArc Method
import java.applet.*;
import java.awt.*;
public class drawPolygonDemo extends Applet
{
	public void paint(Graphics g)
	{
		int x[]={10,170,80,10};
		int y[]={20,40,140,20};
		int n=4;
	
		g.setColor(Color.red);
		g.fillPolygon(x,y,n);
	}
}
/*
<applet code="drawPolygonDemo.class" width="500" height="500">
</applet>
*/	
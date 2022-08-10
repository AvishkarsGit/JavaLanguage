//draw Tiranga
import java.applet.*;
import java.awt.*;
public class Tiranga extends Applet
{
	public void paint(Graphics g)
	{
	
	
        g.fillRect(30,30,10,340);
		g.setColor(Color.orange);
        g.fillRect(40,30,120,25);
        g.setColor(Color.white);
        g.fillRect(40,50,120,25);
        g.setColor(Color.green);
        g.fillRect(40,70,120,25);
		g.setColor(Color.black);
		g.drawOval(85,50,20,20);
		int l=0;
		int x=96, y=62;
		double x1,y1;
		double d;
		g.setColor(Color.black);
		
		for(int i=1;i<=24;i++)
		{
			d=(double)l*3.14/180.0;
			x1=x+(double)10*Math.cos(d);
			y1=y+(double)10*Math.sin(d);
			
			g.drawLine(x,y,(int)x1,(int)y1);
			
			l=l+(360/24);
		}
		g.setColor(Color.black);
		g.drawString("HAR GHAR TIRANGA",100,200);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
/*
<applet code="Tiranga.class" width="250" height="400">
</applet>
*/
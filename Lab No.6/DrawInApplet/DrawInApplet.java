import java.applet.*;
import java.awt.*;

public class DrawInApplet extends Applet{
	public void paint(Graphics g){
		g.drawOval(10,10,100,100);
		g.drawRect(10,10,100,50);
		g.drawLine(10,10,20,20);
	}
	public void stop(){
	}
} 

/*
<applet code="DrawInApplet.class" width="500" height="500">
</applet>
*/

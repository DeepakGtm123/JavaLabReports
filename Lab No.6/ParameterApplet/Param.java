import java.applet.Applet;
import java.awt.Graphics;

public class Param extends Applet{
	public void paint(Graphics g){
		String str = getParameter("msg");
		g.drawString(Str,50,50);
	}
}

/*
	<applet code="Param.class" width="500" height="500" <param name="msg" value="Welcome to Applet">> 
	</applet>
*/

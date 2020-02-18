import java.applet.*;
import java.awt.*;

public class LifeCycleApplet extends Applet{
	public void init(){
		System.out.println("Initialized");

	}
	public void start(){
		System.out.println("Started");
	}
	public void paint(Graphics g){
		System.out.println("Paint");
	}
	public void stop(){
		System.out.println("Stopped");
	}
	public void destroy(){
		System.out.println("Destroyed");
	}
}
/*
	<applet code="LifeCycleApplet.class" width="500" height="500">
	</applet>
*/


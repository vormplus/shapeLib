package test;

import processing.core.*;
import org.vormplus.shapeLib.Circle;

public class CircleTest extends PApplet {

	private static final long serialVersionUID = 1L;

	Circle d;
	
	static public void main(String args[])
	{
		PApplet.main(new String[] { /* "--present", */"test.CircleTest" });
	}

	public void setup()
	{
		size(400, 400);
		smooth();
		
		d = new Circle( this ).setRadius( 100.0f );
		
		noLoop();	
	}
	
	public void draw()
	{
		background(255);
		translate( width/2, height/2 );
		
		stroke(0);
		fill(255, 255, 0);
		
		d.render();
		
		println("Info for the Circle.");
		println("-----------------------------");
		println("Area:           " + d.area() );
		println("Circumference   " + d.circumference() );
		
	}
	
}

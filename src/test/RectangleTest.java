package test;

import processing.core.*;
import org.vormplus.shapeLib.Rectangle;

public class RectangleTest extends PApplet {

	private static final long serialVersionUID = 1L;

	Rectangle d;
	
	static public void main(String args[])
	{
		PApplet.main(new String[] { /* "--present", */"test.RectangleTest" });
	}

	public void setup()
	{
		size(400, 400);
		smooth();
		
		d = new Rectangle( this ).setWidth( 200.0f ).setHeight( 30.0f );
		
		noLoop();	
	}
	
	public void draw()
	{
		background(255);
		translate( width/2, height/2 );
		
		stroke(0);
		fill(255, 255, 0);
		
		d.render();
		
		println("Info for the Rectangle.");
		println("-----------------------------");
		println("Area:           " + d.area() );
		println("Perimeter       " + d.perimeter() );
		
	}
	
}

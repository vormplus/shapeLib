package test;

import processing.core.*;
import org.vormplus.shapeLib.polygons.*;

public class HendecagonTest extends PApplet {

	private static final long serialVersionUID = 1L;

	Hendecagon d;
	
	static public void main(String args[])
	{
		PApplet.main(new String[] { /* "--present", */"test.HendecagonTest" });
	}

	public void setup()
	{
		size(400, 400);
		smooth();
		
		d = new Hendecagon( this ).setRadius( 100.0f );
		
		noLoop();	
	}
	
	public void draw()
	{
		background(255);
		translate( width/2, height/2 );
		
		stroke(0);
		fill(255, 255, 0);
		
		d.render();
		
		println("Info for the Hendecagon.");
		println("-----------------------------");
		println("Area:           " + d.area() );
		println("Perimeter:      " + d.perimeter() );
		println("Internal Angle: " + d.internalAngle() );
		println("External Angle: " + d.externalAngle() );
		
	}
	
}

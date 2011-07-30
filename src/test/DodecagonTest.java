package test;

import processing.core.*;
import org.vormplus.shapeLib.polygons.*;

public class DodecagonTest extends PApplet {

	private static final long serialVersionUID = 1L;

	Dodecagon d;
	
	static public void main(String args[])
	{
		PApplet.main(new String[] { /* "--present", */"test.DodecagonTest" });
	}

	public void setup()
	{
		size(400, 400);
		smooth();
		
		d = new Dodecagon( this ).setRadius( 100.0f );
		
		noLoop();	
	}
	
	public void draw()
	{
		background(255);
		translate( width/2, height/2 );
		
		stroke(0);
		fill(255, 255, 0);
		
		d.render();
		
		println("Info for the Dodecagon.");
		println("-----------------------------");
		println("Area:           " + d.area() );
		println("Perimeter:      " + d.perimeter() );
		println("Internal Angle: " + d.internalAngle() );
		println("External Angle: " + d.externalAngle() );
		
	}
	
}

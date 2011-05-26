package test;

import processing.core.*;

import org.vormplus.shapeLib.polygons.*;

public class PentagonTest extends PApplet {

	Pentagon p;
	
	static public void main(String args[])
	{
		PApplet.main(new String[] { /* "--present", */"test.PentagonTest" });
	}

	public void setup()
	{
		size(400, 400);
		smooth();
		
		p = new Pentagon( this ).setRadius( 100.0f );
		
		noLoop();	
	}
	
	public void draw()
	{
		background(255);
		translate( width/2, height/2 );
		
		stroke(0);
		fill(255, 255, 0);
		
		p.render();
		
		println("Info for the Pentagon.");
		println("-----------------------------");
		println("Area:           " + p.area() );
		println("Perimeter:      " + p.perimeter() );
		println("Internal Angle: " + p.internalAngle() );
		println("External Angle: " + p.externalAngle() );
		
	}
	
}

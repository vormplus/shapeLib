package test;

import processing.core.*;

import org.vormplus.shapeLib.*;
import org.vormplus.shapeLib.polygons.Hexagon;

public class RoundedRectangleTest extends PApplet {

	RoundedRectangle r;

	static public void main(String args[])
	{
		PApplet.main(new String[] { /* "--present", */"test.RoundedRectangleTest" });
	}

	public void setup()
	{
		size(400, 400);
		smooth();
		
		r = new RoundedRectangle( this ).setHeight(150).setWidth(250).setRadius(25);
		
		noLoop();	
	}
	
	public void draw()
	{
		background(255);
		translate( width/2, height/2 );
		
		stroke(0);
		fill(255, 255, 0);
		
		r.render();
		
		println("Info for the Rounded Rectangle.");
		println("---------------------------------");
		println("Area:           " + r.area() );
		println("Perimeter:      " + r.perimeter() );
		
	}
	
}

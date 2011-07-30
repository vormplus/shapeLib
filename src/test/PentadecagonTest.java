package test;

import processing.core.*;
import org.vormplus.shapeLib.polygons.*;

public class PentadecagonTest extends PApplet {

	private static final long serialVersionUID = 1L;

	Pentadecagon h;
	
	static public void main( String args[] )
	{
		PApplet.main(new String[] { /* "--present", */"test.PentadecagonTest" });
	}

	public void setup()
	{
		size(400, 400);
		smooth();
		
		h = new Pentadecagon( this ).setRadius( 100.0f );
		
		noLoop();	
	}
	
	public void draw()
	{
		background(255);
		translate( width/2, height/2 );
		
		stroke(0);
		fill(255, 255, 0);
		
		h.render();
		
		println("Info for the Pentadecagon.");
		println("-----------------------------");
		println("Area:           " + h.area() );
		println("Perimeter:      " + h.perimeter() );
		println("Internal Angle: " + h.internalAngle() );
		println("External Angle: " + h.externalAngle() );
		
	}
	
}

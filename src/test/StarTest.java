package test;

import processing.core.*;
import org.vormplus.shapeLib.stars.*;

public class StarTest extends PApplet {

	private static final long serialVersionUID = 1L;

	Star s;
	
	static public void main(String args[])
	{
		PApplet.main(new String[] { /* "--present", */"test.StarTest" });
	}

	public void setup()
	{
		size(400, 400);
		smooth();
		
		s = new Star( this ); //.setRadius( 100.0f );
		
		noLoop();	
	}
	
	public void draw()
	{
		background(255);
		translate( width/2, height/2 );
		
		stroke(0);
		fill(255, 255, 0);
		
		s.render();
		
		
	}
	
}

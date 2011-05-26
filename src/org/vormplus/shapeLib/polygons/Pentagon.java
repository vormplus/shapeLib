package org.vormplus.shapeLib.polygons;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PVector;
import org.vormplus.shapeLib.BasicShape;

/**
 * Create a Pentagon object.
 * This class extends the BasicShape class.
 * 
 * References
 * -----------------
 * http://en.wikipedia.org/wiki/Pentagon
 * http://www.mathopenref.com/pentagon.html
 * 
 * @author Jan Vantomme
 */

public class Pentagon extends BasicShape {

	public float radius;
	
	private int numVertices = 5;
	public PVector[] vertices;
	
	/**
	 * Creates a Pentagon object
	 * @param _p Reference to the PApplet object. Normally use 'this'
	 */
	public Pentagon( PApplet _p )
	{
		super( _p );
		radius = 50.0f;
		
		vertices = new PVector[numVertices];
		calculateVertices();
	}

	/**
	 * Sets the radius for the Pentagon.
	 * @param r Radius for the Pentagon.
	 */
	public Pentagon setRadius(float r)
	{
		radius = r;
		calculateVertices();
		return this;
	}

	/**
	 * Function to calculate the coordinates of the vertices
	 */
	private void calculateVertices()
	{
		float a = PConstants.TWO_PI / numVertices;
		for (int i = 0; i < 5; i++) {
			float x = PApplet.cos( i * a ) * radius;
			float y = PApplet.sin( i * a ) * radius;
			vertices[i] = new PVector( x, y );
		}		
	}
	
	/**
	 * Renders the Pentagon to the screen.
	 */
	public void render()
	{
		p.beginShape();
		for (int i = 0; i < numVertices; i++) {
			p.vertex( vertices[i].x, vertices[i].y );
		}
		p.endShape(PConstants.CLOSE);
	}
	
	/**
	 * Returns the area of the Pentagon.
	 * @return float: Area of the Pentagon.
	 */
	public float area()
	{
		return 0.0f;
	}
	
	/**
	 * Returns the perimeter of the Pentagon.
	 * @return float: Perimeter of the Pentagon.
	 */
	public float perimeter()
	{
		return 0.0f;
	}
	
	/**
	 * Returns the internal angle of the Pentagon. This number is based on the formula: (( 180 * 5 ) - 360) / 5
	 * @return float: Internal angle of the Pentagon.
	 */
	public float internalAngle()
	{
		return 108.0f;
	}
	
	/**
	 * Returns the external angle of the Pentagon. This number is based on the formula: 180 - internal angle
	 * @return float: External angle of the Pentagon.
	 */
	public float externalAngle()
	{
		return 72.0f;
	}
}

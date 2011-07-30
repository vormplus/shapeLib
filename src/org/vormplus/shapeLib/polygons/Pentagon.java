package org.vormplus.shapeLib.polygons;

import processing.core.PApplet;
import processing.core.PVector;

import org.vormplus.shapeLib.polygons.RegularPolygon;


/**
 * Create a Pentagon object, a regular polygon with 5 sides.
 * This class extends the BasicShape class.
 * 
 * References
 * -----------------
 * http://en.wikipedia.org/wiki/Pentagon
 * http://www.mathopenref.com/pentagon.html
 * 
 * @author Jan Vantomme
 */

public class Pentagon extends RegularPolygon {

	public float radius;
	
	private int numVertices = 5;
	public PVector[] vertices;
	
	/**
	 * Creates a Pentagon object with a radius of 50.
	 * @param _p Reference to the PApplet object. Normally use 'this'
	 */
	public Pentagon( PApplet _p ) {
		super( _p );
		radius = 50.0f;
		
		vertices = calculateVertices( numVertices, radius );
	}

	/**
	 * Sets the radius for the Pentagon.
	 * @param r Radius for the Pentagon.
	 */
	public Pentagon setRadius(float r)
	{
		radius = r;
		
		vertices = calculateVertices( numVertices, radius );

		return this;
	}

	/**
	 * Renders the Pentagon to the screen.
	 */
	public void render()
	{
		render( vertices );
	}
	
	/**
	 * Returns the area of the Pentagon.
	 * @return float: Area of the Pentagon.
	 */
	public float area()
	{
		return area( numVertices, radius );
	}
	
	/**
	 * Returns the perimeter of the Pentagon.
	 * @return float: Perimeter of the Pentagon.
	 */
	public float perimeter()
	{
		return perimeter( vertices );
	}
	
	/**
	 * Returns the internal angle of the Pentagon.
	 * @return float: Internal angle of the Pentagon.
	 */
	public float internalAngle()
	{
		return internalAngle( numVertices );
	}
	
	/**
	 * Returns the external angle of the Pentagon.
	 * @return float: External angle of the Pentagon.
	 */
	public float externalAngle()
	{
		return externalAngle( numVertices );
	}
}

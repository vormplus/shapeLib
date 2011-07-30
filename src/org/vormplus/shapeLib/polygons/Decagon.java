package org.vormplus.shapeLib.polygons;

import processing.core.PApplet;
import processing.core.PVector;

import org.vormplus.shapeLib.polygons.RegularPolygon;

/**
 * Create a Decagon object.
 * This class extends the BasicShape class.
 * 
 * References
 * -----------------
 * http://en.wikipedia.org/wiki/Decagon
 * http://www.mathopenref.com/decagon.html
 * 
 * @author Jan Vantomme
 */

public class Decagon extends RegularPolygon {

	public float radius;
	
	private int numVertices = 10;
	public PVector[] vertices;

	/**
	 * Creates a Decagon object
	 * @param _p Reference to the PApplet object. Normally use 'this'
	 */
	public Decagon( PApplet _p ) {
		super( _p );

		radius = 50.0f;
		vertices = calculateVertices( numVertices, radius );
	}

	/**
	 * Sets the radius for the Decagon.
	 * @param r Radius for the Decagon.
	 */
	public Decagon setRadius(float r)
	{
		radius = r;
		vertices = calculateVertices( numVertices, radius );

		return this;
	}

	/**
	 * Renders the Decagon to the screen.
	 */
	public void render()
	{
		render( vertices );
	}
	
	/**
	 * Returns the area of the Decagon.
	 * @return float: Area of the Decagon.
	 */
	public float area()
	{
		return area( numVertices, radius );
	}
	
	/**
	 * Returns the perimeter of the Decagon.
	 * @return float: Perimeter of the Decagon.
	 */
	public float perimeter()
	{
		return perimeter( vertices );
	}
	
	/**
	 * Returns the internal angle of the Decagon.
	 * @return float: Internal angle of the Decagon.
	 */
	public float internalAngle()
	{
		return internalAngle( numVertices );
	}
	
	/**
	 * Returns the external angle of the Decagon.
	 * @return float: External angle of the Decagon.
	 */
	public float externalAngle()
	{
		return externalAngle( numVertices );
	}
	
}

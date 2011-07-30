package org.vormplus.shapeLib.polygons;

import processing.core.PApplet;
import processing.core.PVector;

import org.vormplus.shapeLib.polygons.RegularPolygon;

/**
 * Create a Octagon object, a regular polygon with 8 sides
 * This class extends the BasicShape class.
 * 
 * References
 * -----------------
 * http://en.wikipedia.org/wiki/Octagon
 * http://www.mathopenref.com/octagon.html
 * 
 * @author Jan Vantomme
 */

public class Octagon extends RegularPolygon {

	public float radius;
	
	private int numVertices = 8;
	public PVector[] vertices;
	
	/**
	 * Creates a Octagon object with a radius of 50.
	 * @param _p Reference to the PApplet object. Normally use 'this'
	 */
	public Octagon( PApplet _p ) {
		super( _p );
		radius = 50.0f;
		
		vertices = calculateVertices( numVertices, radius );
	}

	/**
	 * Sets the radius for the Octagon.
	 * @param r Radius for the Octagon.
	 */
	public Octagon setRadius(float r)
	{
		radius = r;
		
		vertices = calculateVertices( numVertices, radius );

		return this;
	}

	/**
	 * Renders the Octagon to the screen.
	 */
	public void render()
	{
		render( vertices );
	}
	
	/**
	 * Returns the area of the Octagon.
	 * @return float: Area of the Octagon.
	 */
	public float area()
	{
		return area( numVertices, radius );
	}
	
	/**
	 * Returns the perimeter of the Octagon.
	 * @return float: Perimeter of the Octagon.
	 */
	public float perimeter()
	{
		return perimeter( vertices );
	}
	
	/**
	 * Returns the internal angle of the Octagon.
	 * @return float: Internal angle of the Octagon.
	 */
	public float internalAngle()
	{
		return internalAngle( numVertices );
	}
	
	/**
	 * Returns the external angle of the Octagon.
	 * @return float: External angle of the Octagon.
	 */
	public float externalAngle()
	{
		return externalAngle( numVertices );
	}
}
package org.vormplus.shapeLib.polygons;

import processing.core.PApplet;
import processing.core.PVector;

import org.vormplus.shapeLib.polygons.RegularPolygon;

/**
 * Creates a Hendecagon object, a regular polygon with 11 sides.
 * This class extends the BasicShape class.
 * 
 * References
 * -----------------
 * http://en.wikipedia.org/wiki/Hendecagon
 * http://www.mathopenref.com/undecagon.html
 * 
 * @author Jan Vantomme
 */

public class Hendecagon extends RegularPolygon {

	public float radius;
	
	private int numVertices = 11;
	public PVector[] vertices;
	
	/**
	 * Creates a Hendecagon object with a radius of 50.
	 * @param _p Reference to the PApplet object. Normally use 'this'
	 */
	public Hendecagon( PApplet _p ) {
		super( _p );
		radius = 50.0f;
		
		vertices = calculateVertices( numVertices, radius );
	}

	/**
	 * Sets the radius for the Hendecagon.
	 * @param r Radius for the Hendecagon.
	 */
	public Hendecagon setRadius(float r)
	{
		radius = r;
		
		vertices = calculateVertices( numVertices, radius );

		return this;
	}

	/**
	 * Renders the Hendecagon to the screen.
	 */
	public void render()
	{
		render( vertices );
	}
	
	/**
	 * Returns the area of the Hendecagon.
	 * @return float: Area of the Hendecagon.
	 */
	public float area()
	{
		return area( numVertices, radius );
	}
	
	/**
	 * Returns the perimeter of the Hendecagon.
	 * @return float: Perimeter of the Hendecagon.
	 */
	public float perimeter()
	{
		return perimeter( vertices );
	}
	
	/**
	 * Returns the internal angle of the Hendecagon.
	 * @return float: Internal angle of the Hendecagon.
	 */
	public float internalAngle()
	{
		return internalAngle( numVertices );
	}
	
	/**
	 * Returns the external angle of the Hendecagon.
	 * @return float: External angle of the Hendecagon.
	 */
	public float externalAngle()
	{
		return externalAngle( numVertices );
	}
}

package org.vormplus.shapeLib.polygons;

import processing.core.PApplet;
import processing.core.PVector;

import org.vormplus.shapeLib.polygons.RegularPolygon;

/**
 * Creates a Heptagon object, a regular polygon with 7 sides.
 * This class extends the BasicShape class.
 * 
 * References
 * -----------------
 * http://en.wikipedia.org/wiki/Heptagon
 * http://www.mathopenref.com/heptagon.html
 * 
 * @author Jan Vantomme
 */

public class Heptagon extends RegularPolygon {

	public float radius;
	
	private int numVertices = 7;
	public PVector[] vertices;
	
	/**
	 * Creates a Heptagon object with a radius of 50.
	 * @param _p Reference to the PApplet object. Normally use 'this'
	 */
	public Heptagon( PApplet _p ) {
		super( _p );
		radius = 50.0f;
		
		vertices = calculateVertices( numVertices, radius );
	}

	/**
	 * Sets the radius for the Heptagon.
	 * @param r Radius for the Heptagon.
	 */
	public Heptagon setRadius(float r)
	{
		radius = r;
		
		vertices = calculateVertices( numVertices, radius );

		return this;
	}

	/**
	 * Renders the Heptagon to the screen.
	 */
	public void render()
	{
		render( vertices );
	}
	
	/**
	 * Returns the area of the Heptagon.
	 * @return float: Area of the Heptagon.
	 */
	public float area()
	{
		return area( numVertices, radius );
	}
	
	/**
	 * Returns the perimeter of the Heptagon.
	 * @return float: Perimeter of the Heptagon.
	 */
	public float perimeter()
	{
		return perimeter( vertices );
	}
	
	/**
	 * Returns the internal angle of the Heptagon.
	 * @return float: Internal angle of the Heptagon.
	 */
	public float internalAngle()
	{
		return internalAngle( numVertices );
	}
	
	/**
	 * Returns the external angle of the Heptagon.
	 * @return float: External angle of the Heptagon.
	 */
	public float externalAngle()
	{
		return externalAngle( numVertices );
	}
}

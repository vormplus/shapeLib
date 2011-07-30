package org.vormplus.shapeLib.polygons;

import processing.core.PApplet;
import processing.core.PVector;

import org.vormplus.shapeLib.polygons.RegularPolygon;

/**
 * Creates a Hexagon object, a regular polygon with 6 sides.
 * This class extends the BasicShape class.
 * 
 * References
 * -----------------
 * http://en.wikipedia.org/wiki/Hexagon
 * http://www.mathopenref.com/hexagon.html
 * 
 * @author Jan Vantomme
 */

public class Hexagon extends RegularPolygon {

	public float radius;
	
	private int numVertices = 6;
	public PVector[] vertices;
	
	/**
	 * Creates a Hexagon object with a radius of 50.
	 * @param _p Reference to the PApplet object. Normally use 'this'
	 */
	public Hexagon( PApplet _p ) {
		super( _p );
		radius = 50.0f;
		
		vertices = calculateVertices( numVertices, radius );
	}

	/**
	 * Sets the radius for the Hexagon.
	 * @param r Radius for the Hexagon.
	 */
	public Hexagon setRadius(float r)
	{
		radius = r;
		
		vertices = calculateVertices( numVertices, radius );

		return this;
	}

	/**
	 * Renders the Hexagon to the screen.
	 */
	public void render()
	{
		render( vertices );
	}
	
	/**
	 * Returns the area of the Hexagon.
	 * @return float: Area of the Hexagon.
	 */
	public float area()
	{
		return area( numVertices, radius );
	}
	
	/**
	 * Returns the perimeter of the Hexagon.
	 * @return float: Perimeter of the Hexagon.
	 */
	public float perimeter()
	{
		return perimeter( vertices );
	}
	
	/**
	 * Returns the internal angle of the Hexagon.
	 * @return float: Internal angle of the Hexagon.
	 */
	public float internalAngle()
	{
		return internalAngle( numVertices );
	}
	
	/**
	 * Returns the external angle of the Hexagon.
	 * @return float: External angle of the Hexagon.
	 */
	public float externalAngle()
	{
		return externalAngle( numVertices );
	}
}
package org.vormplus.shapeLib.polygons;

import processing.core.PApplet;
import processing.core.PVector;

import org.vormplus.shapeLib.polygons.RegularPolygon;

/**
 * Creates a Hexadecagon object, a regular polygon with 16 sides.
 * This class extends the BasicShape class.
 * 
 * References
 * -----------------
 * http://en.wikipedia.org/wiki/Hexadecagon
 * 
 * @author Jan Vantomme
 */

public class Hexadecagon extends RegularPolygon {

	public float radius;
	
	private int numVertices = 16;
	public PVector[] vertices;
	
	/**
	 * Creates a Hexadecagon object with a radius of 50.
	 * @param _p Reference to the PApplet object. Normally use 'this'
	 */
	public Hexadecagon( PApplet _p ) {
		super( _p );
		radius = 50.0f;
		
		vertices = calculateVertices( numVertices, radius );
	}

	/**
	 * Sets the radius for the Hexadecagon.
	 * @param r Radius for the Hexadecagon.
	 */
	public Hexadecagon setRadius(float r)
	{
		radius = r;
		
		vertices = calculateVertices( numVertices, radius );

		return this;
	}

	/**
	 * Renders the Hexadecagon to the screen.
	 */
	public void render()
	{
		render( vertices );
	}
	
	/**
	 * Returns the area of the Hexadecagon.
	 * @return float: Area of the Hexadecagon.
	 */
	public float area()
	{
		return area( numVertices, radius );
	}
	
	/**
	 * Returns the perimeter of the Hexadecagon.
	 * @return float: Perimeter of the Hexadecagon.
	 */
	public float perimeter()
	{
		return perimeter( vertices );
	}
	
	/**
	 * Returns the internal angle of the Hexadecagon.
	 * @return float: Internal angle of the Hexadecagon.
	 */
	public float internalAngle()
	{
		return internalAngle( numVertices );
	}
	
	/**
	 * Returns the external angle of the Hexadecagon.
	 * @return float: External angle of the Hexadecagon.
	 */
	public float externalAngle()
	{
		return externalAngle( numVertices );
	}
}

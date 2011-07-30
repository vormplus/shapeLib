package org.vormplus.shapeLib.polygons;

import processing.core.PApplet;
import processing.core.PVector;

import org.vormplus.shapeLib.polygons.RegularPolygon;

/**
 * Creates a Pentadecagon object, a regular polygon with 15 sides.
 * This class extends the RegularPolygon class.
 * 
 * References
 * -----------------
 * http://en.wikipedia.org/wiki/Pentadecagon
 * 
 * @author Jan Vantomme
 */

public class Pentadecagon extends RegularPolygon {

	public float radius;
	
	private int numVertices = 15;
	public PVector[] vertices;
	
	/**
	 * Creates a Pentadecagon object with a radius of 50.
	 * @param _p Reference to the PApplet object. Normally use 'this'
	 */
	public Pentadecagon( PApplet _p ) {
		super( _p );
		radius = 50.0f;
		
		vertices = calculateVertices( numVertices, radius );
	}

	/**
	 * Sets the radius for the Pentadecagon.
	 * @param r Radius for the Pentadecagon.
	 */
	public Pentadecagon setRadius(float r)
	{
		radius = r;
		
		vertices = calculateVertices( numVertices, radius );

		return this;
	}

	/**
	 * Renders the Pentadecagon to the screen.
	 */
	public void render()
	{
		render( vertices );
	}
	
	/**
	 * Returns the area of the Pentadecagon.
	 * @return float: Area of the Pentadecagon.
	 */
	public float area()
	{
		return area( numVertices, radius );
	}
	
	/**
	 * Returns the perimeter of the Pentadecagon.
	 * @return float: Perimeter of the Pentadecagon.
	 */
	public float perimeter()
	{
		return perimeter( vertices );
	}
	
	/**
	 * Returns the internal angle of the Pentadecagon.
	 * @return float: Internal angle of the Pentadecagon.
	 */
	public float internalAngle()
	{
		return internalAngle( numVertices );
	}
	
	/**
	 * Returns the external angle of the Pentadecagon.
	 * @return float: External angle of the Pentadecagon.
	 */
	public float externalAngle()
	{
		return externalAngle( numVertices );
	}
}

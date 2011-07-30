package org.vormplus.shapeLib.polygons;

import processing.core.PApplet;
import processing.core.PVector;

import org.vormplus.shapeLib.polygons.RegularPolygon;

/**
 * Creates a Icosagon object, a regular polygon with 20 sides.
 * This class extends the BasicShape class.
 * 
 * References
 * -----------------
 * http://en.wikipedia.org/wiki/Icosagon
 * 
 * @author Jan Vantomme
 */

public class Icosagon extends RegularPolygon {

	public float radius;
	
	private int numVertices = 20;
	public PVector[] vertices;
	
	/**
	 * Creates a Icosagon object with a radius of 50.
	 * @param _p Reference to the PApplet object. Normally use 'this'
	 */
	public Icosagon( PApplet _p ) {
		super( _p );
		radius = 50.0f;
		
		vertices = calculateVertices( numVertices, radius );
	}

	/**
	 * Sets the radius for the Icosagon.
	 * @param r Radius for the Icosagon.
	 */
	public Icosagon setRadius(float r)
	{
		radius = r;
		
		vertices = calculateVertices( numVertices, radius );

		return this;
	}

	/**
	 * Renders the Icosagon to the screen.
	 */
	public void render()
	{
		render( vertices );
	}
	
	/**
	 * Returns the area of the Icosagon.
	 * @return float: Area of the Icosagon.
	 */
	public float area()
	{
		return area( numVertices, radius );
	}
	
	/**
	 * Returns the perimeter of the Icosagon.
	 * @return float: Perimeter of the Icosagon.
	 */
	public float perimeter()
	{
		return perimeter( vertices );
	}
	
	/**
	 * Returns the internal angle of the Icosagon.
	 * @return float: Internal angle of the Icosagon.
	 */
	public float internalAngle()
	{
		return internalAngle( numVertices );
	}
	
	/**
	 * Returns the external angle of the Icosagon.
	 * @return float: External angle of the Icosagon.
	 */
	public float externalAngle()
	{
		return externalAngle( numVertices );
	}
}

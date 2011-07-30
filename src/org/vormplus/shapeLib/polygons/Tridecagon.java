package org.vormplus.shapeLib.polygons;

import processing.core.PApplet;
import processing.core.PVector;

import org.vormplus.shapeLib.polygons.RegularPolygon;

/**
 * Creates a Tridecagon object, a regular polygon with 6 sides.
 * This class extends the BasicShape class.
 * 
 * References
 * -----------------
 * http://en.wikipedia.org/wiki/Tridecagon
 * http://www.mathopenref.com/Tridecagon.html
 * 
 * @author Jan Vantomme
 */

public class Tridecagon extends RegularPolygon {

	public float radius;
	
	private int numVertices = 13;
	public PVector[] vertices;
	
	/**
	 * Creates a Tridecagon object with a radius of 50.
	 * @param _p Reference to the PApplet object. Normally use 'this'
	 */
	public Tridecagon( PApplet _p ) {
		super( _p );
		radius = 50.0f;
		
		vertices = calculateVertices( numVertices, radius );
	}

	/**
	 * Sets the radius for the Tridecagon.
	 * @param r Radius for the Tridecagon.
	 */
	public Tridecagon setRadius(float r)
	{
		radius = r;
		
		vertices = calculateVertices( numVertices, radius );

		return this;
	}

	/**
	 * Renders the Tridecagon to the screen.
	 */
	public void render()
	{
		render( vertices );
	}
	
	/**
	 * Returns the area of the Tridecagon.
	 * @return float: Area of the Tridecagon.
	 */
	public float area()
	{
		return area( numVertices, radius );
	}
	
	/**
	 * Returns the perimeter of the Tridecagon.
	 * @return float: Perimeter of the Tridecagon.
	 */
	public float perimeter()
	{
		return perimeter( vertices );
	}
	
	/**
	 * Returns the internal angle of the Tridecagon.
	 * @return float: Internal angle of the Tridecagon.
	 */
	public float internalAngle()
	{
		return internalAngle( numVertices );
	}
	
	/**
	 * Returns the external angle of the Tridecagon.
	 * @return float: External angle of the Tridecagon.
	 */
	public float externalAngle()
	{
		return externalAngle( numVertices );
	}
}
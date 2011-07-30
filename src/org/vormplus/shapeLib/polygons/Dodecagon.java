package org.vormplus.shapeLib.polygons;

import processing.core.PApplet;
import processing.core.PVector;

import org.vormplus.shapeLib.polygons.RegularPolygon;

/**
 * Create a Dodecagon object, a regular polygon with 12 sides
 * This class extends the BasicShape class.
 * 
 * References
 * -----------------
 * http://en.wikipedia.org/wiki/Dodecagon
 * http://www.mathopenref.com/dodecagon.html
 * 
 * @author Jan Vantomme
 */

public class Dodecagon extends RegularPolygon {

	public float radius;
	
	private int numVertices = 12;
	public PVector[] vertices;
	
	/**
	 * Creates a Dodecagon object with a radius of 50.
	 * @param _p Reference to the PApplet object. Normally use 'this'
	 */
	public Dodecagon( PApplet _p )
	{
		super( _p );
		
		radius = 50.0f;
		vertices = calculateVertices( numVertices, radius );
	}
	
	/**
	 * Sets the radius for the Dodecagon.
	 * @param r Radius for the Dodecagon.
	 */
	public Dodecagon setRadius( float r )
	{
		radius = r;	
		vertices = calculateVertices( numVertices, radius );
		
		return this;
	}
	
	/**
	 * Renders the Dodecagon to the screen.
	 */
	public void render()
	{
		render( vertices );		
	}
	
	/**
	 * Returns the area of the Dodecagon.
	 * @return float: Area of the Dodecagon.
	 */
	public float area()
	{
		return area( numVertices, radius );	
	}

	/**
	 * Returns the perimeter of the Dodecagon.
	 * @return float: Perimeter of the Dodecagon.
	 */
	public float perimeter()
	{
		return perimeter( vertices );
	}
	
	/**
	 * Returns the internal angle of the Dodecagon.
	 * @return float: Internal angle of the Dodecagon.
	 */
	public float internalAngle()
	{
		return internalAngle( numVertices );
	}
	
	/**
	 * Returns the external angle of the Dodecagon.
	 * @return float: External angle of the Dodecagon.
	 */
	public float externalAngle()
	{
		return externalAngle( numVertices );
	}	
}

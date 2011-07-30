package org.vormplus.shapeLib.polygons;

import processing.core.PApplet;
import processing.core.PVector;

import org.vormplus.shapeLib.polygons.RegularPolygon;

/**
 * Creates a Triangle object, a regular polygon with 3 sides.
 * This class extends the BasicShape class.
 * 
 * References
 * -----------------
 * http://en.wikipedia.org/wiki/Triangle
 * http://www.mathopenref.com/Triangle.html
 * 
 * @author Jan Vantomme
 */

public class Triangle extends RegularPolygon {

	public float radius;
	
	private int numVertices = 3;
	public PVector[] vertices;
	
	/**
	 * Creates a Triangle object with a radius of 50.
	 * @param _p Reference to the PApplet object. Normally use 'this'
	 */
	public Triangle( PApplet _p ) {
		super( _p );
		radius = 50.0f;
		
		vertices = calculateVertices( numVertices, radius );
	}

	/**
	 * Sets the radius for the Triangle.
	 * @param r Radius for the Triangle.
	 */
	public Triangle setRadius(float r)
	{
		radius = r;
		
		vertices = calculateVertices( numVertices, radius );

		return this;
	}

	/**
	 * Renders the Triangle to the screen.
	 */
	public void render()
	{
		render( vertices );
	}
	
	/**
	 * Returns the area of the Triangle.
	 * @return float: Area of the Triangle.
	 */
	public float area()
	{
		return area( numVertices, radius );
	}
	
	/**
	 * Returns the perimeter of the Triangle.
	 * @return float: Perimeter of the Triangle.
	 */
	public float perimeter()
	{
		return perimeter( vertices );
	}
	
	/**
	 * Returns the internal angle of the Triangle.
	 * @return float: Internal angle of the Triangle.
	 */
	public float internalAngle()
	{
		return internalAngle( numVertices );
	}
	
	/**
	 * Returns the external angle of the Triangle.
	 * @return float: External angle of the Triangle.
	 */
	public float externalAngle()
	{
		return externalAngle( numVertices );
	}
}
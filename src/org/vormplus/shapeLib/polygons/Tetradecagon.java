package org.vormplus.shapeLib.polygons;

import processing.core.PApplet;
import processing.core.PVector;

import org.vormplus.shapeLib.polygons.RegularPolygon;

/**
 * Creates a Tetradecagon object, a regular polygon with 14 sides.
 * This class extends the BasicShape class.
 * 
 * References
 * -----------------
 * http://en.wikipedia.org/wiki/Tetradecagon
 * 
 * @author Jan Vantomme
 */

public class Tetradecagon extends RegularPolygon {

	public float radius;
	
	private int numVertices = 14;
	public PVector[] vertices;
	
	/**
	 * Creates a Tetradecagon object with a radius of 50.
	 * @param _p Reference to the PApplet object. Normally use 'this'
	 */
	public Tetradecagon( PApplet _p ) {
		super( _p );
		radius = 50.0f;
		
		vertices = calculateVertices( numVertices, radius );
	}

	/**
	 * Sets the radius for the Tetradecagon.
	 * @param r Radius for the Tetradecagon.
	 */
	public Tetradecagon setRadius(float r)
	{
		radius = r;
		
		vertices = calculateVertices( numVertices, radius );

		return this;
	}

	/**
	 * Renders the Tetradecagon to the screen.
	 */
	public void render()
	{
		render( vertices );
	}
	
	/**
	 * Returns the area of the Tetradecagon.
	 * @return float: Area of the Tetradecagon.
	 */
	public float area()
	{
		return area( numVertices, radius );
	}
	
	/**
	 * Returns the perimeter of the Tetradecagon.
	 * @return float: Perimeter of the Tetradecagon.
	 */
	public float perimeter()
	{
		return perimeter( vertices );
	}
	
	/**
	 * Returns the internal angle of the Tetradecagon.
	 * @return float: Internal angle of the Tetradecagon.
	 */
	public float internalAngle()
	{
		return internalAngle( numVertices );
	}
	
	/**
	 * Returns the external angle of the Tetradecagon.
	 * @return float: External angle of the Tetradecagon.
	 */
	public float externalAngle()
	{
		return externalAngle( numVertices );
	}
}
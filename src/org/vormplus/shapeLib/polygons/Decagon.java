package org.vormplus.shapeLib.polygons;

import processing.core.PApplet;
import processing.core.PConstants;
import org.vormplus.shapeLib.BasicShape;

// http://en.wikipedia.org/wiki/Decagon

public class Decagon extends BasicShape {

	public float radius;
	
	private float cosLUT[];
	private float sinLUT[];

	/**
	 * Creates a Decagon object
	 * @param _p Reference to the PApplet object. Normally use 'this'
	 */
	public Decagon( PApplet _p ) {
		super( _p );
		radius = 50.0f;
		
		cosLUT = new float[10];
		sinLUT = new float[10];
		
		float a = PConstants.TWO_PI / 10;
		
		for (int i = 0; i < 10; i++) {
			cosLUT[i] = PApplet.cos( i * a );
			sinLUT[i] = PApplet.sin( i * a );
		}
	}

	/**
	 * Sets the radius for the Decagon.
	 * @param r Radius for the Decagon.
	 */
	public Decagon setRadius(float r)
	{
		radius = r;
		return this;
	}

	/**
	 * Renders the Decagon to the screen.
	 */
	public void render()
	{
		p.beginShape();
		for (int i = 0; i < 10; i++) {
			float x = cosLUT[i] * radius;
			float y = sinLUT[i] * radius;
			p.vertex(x, y);
		}
		p.endShape(PConstants.CLOSE);
	}
	
	/**
	 * Returns the area of the Decagon.
	 * @return float: Area of the Decagon.
	 */
	public float area()
	{
		
		return 0.0f;
	}
	
	/**
	 * Returns the perimeter of the Decagon.
	 * @return float: Perimeter of the Decagon.
	 */
	public float perimeter()
	{
		return 0.0f;
	}
	
	/**
	 * Returns the internal angle of the Decagon.
	 * @return float: Internal angle of the Decagon.
	 */
	public float internalAngle()
	{
		// (( 180 * 10 ) - 360) / 10
		return 144.0f;
	}
	
	/**
	 * Returns the external angle of the Decagon.
	 * @return float: External angle of the Decagon.
	 */
	public float externalAngle()
	{
		// 180 - internal angle
		return 36.0f;	
	}
	
}

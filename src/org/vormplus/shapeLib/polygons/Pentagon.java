package org.vormplus.shapeLib.polygons;

import processing.core.PApplet;
import org.vormplus.shapeLib.BasicShape;

// http://en.wikipedia.org/wiki/Pentagon

public class Pentagon extends BasicShape {

	public float radius;
	
	private float cosLUT[];
	private float sinLUT[];

	/**
	 * Creates a Pentagon object
	 * @param _p Reference to the PApplet object. Normally use 'this'
	 */
	public Pentagon( PApplet _p ) {
		super( _p );
		radius = 50.0f;
		
		cosLUT = new float[5];
		sinLUT = new float[5];
		
		float a = p.TWO_PI / 5;
		
		for (int i = 0; i < 5; i++) {
			cosLUT[i] = p.cos( i * a );
			sinLUT[i] = p.sin( i * a );
		}
	}

	/**
	 * Sets the radius for the Pentagon.
	 * @param r Radius for the Pentagon.
	 */
	public Pentagon setRadius(float r)
	{
		radius = r;
		return this;
	}

	/**
	 * Renders the Pentagon to the screen.
	 */
	public void render()
	{
		p.beginShape();
		for (int i = 0; i < 5; i++) {
			float x = cosLUT[i] * radius;
			float y = sinLUT[i] * radius;
			p.vertex(x, y);
		}
		p.endShape(p.CLOSE);
	}
	
	/**
	 * Returns the area of the Pentagon.
	 * @return float: Area of the Pentagon.
	 */
	public float area()
	{
		return 0.0f;
	}
	
	/**
	 * Returns the perimeter of the Pentagon.
	 * @return float: Perimeter of the Pentagon.
	 */
	public float perimeter()
	{
		return 0.0f;
	}
	
	/**
	 * Returns the internal angle of the Pentagon.
	 * @return float: Internal angle of the Pentagon.
	 */
	public float internalAngle()
	{
		// (( 180 * 5 ) - 360) / 5
		return 108.0f;
	}
	
	/**
	 * Returns the external angle of the Pentagon.
	 * @return float: External angle of the Pentagon.
	 */
	public float externalAngle()
	{
		// 180 - internal angle
		return 72.0f;
	}
}

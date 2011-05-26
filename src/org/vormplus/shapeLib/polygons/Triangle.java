package org.vormplus.shapeLib.polygons;

import processing.core.PApplet;
import processing.core.PConstants;
import org.vormplus.shapeLib.BasicShape;

public class Triangle extends BasicShape {

	public float radius;

	private float cosLUT[];
	private float sinLUT[];

	/**
	 * Creates a Triangle object
	 * @param _p Reference to the PApplet object. Normally use 'this'
	 */
	public Triangle( PApplet _p )
	{
		super( _p );
	
		radius = 50.0f;

		cosLUT = new float[3];
		sinLUT = new float[3];
		
		float a = PConstants.TWO_PI / 3;
		
		for (int i = 0; i < 3; i++) {
			cosLUT[i] = PApplet.cos( i * a );
			sinLUT[i] = PApplet.sin( i * a );
		}
	
	}
	
	/**
	 * Sets the radius for the Triangle.
	 * @param r Radius for the Triangle.
	 */
	public Triangle setRadius( float r )
	{
		radius = r;
		return this;
	}

	/**
	 * Renders the Triangle to the screen.
	 */
	public void render()
	{
		p.beginShape();
		for (int i = 0; i < 3; i++) {
			float x = cosLUT[i] * radius;
			float y = sinLUT[i] * radius;
			p.vertex(x, y);
		}
		p.endShape(PConstants.CLOSE);
	}
	
}

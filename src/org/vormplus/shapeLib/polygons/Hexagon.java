package org.vormplus.shapeLib.polygons;

import processing.core.PApplet;
import org.vormplus.shapeLib.BasicShape;

public class Hexagon extends BasicShape {

	public float radius;
	
	private float cosLUT[];
	private float sinLUT[];

	/**
	 * Creates a Hexagon object
	 * @param _p Reference to the PApplet object. Normally use 'this'
	 */
	public Hexagon( PApplet _p ) {
		super( _p );
		radius = 50.0f;
		
		cosLUT = new float[6];
		sinLUT = new float[6];
		
		float a = p.TWO_PI / 6;
		
		for (int i = 0; i < 6; i++) {
			cosLUT[i] = p.cos( i * a );
			sinLUT[i] = p.sin( i * a );
		}
	}

	/**
	 * Sets the radius for the Hexagon.
	 * @param r Radius for the Hexagon.
	 */
	public Hexagon setRadius(float r)
	{
		radius = r;
		return this;
	}

	/**
	 * Renders the Hexagon to the screen.
	 */
	public void render()
	{
		p.beginShape();
		for (int i = 0; i < 6; i++) {
			float x = cosLUT[i] * radius;
			float y = sinLUT[i] * radius;
			p.vertex(x, y);
		}
		p.endShape(p.CLOSE);
	}
	
	/**
	 * Returns the area of the Hexagon.
	 * @return float: Area of the Hexagon.
	 */
	public float area()
	{
		// faster with r * r in stead of pow() ???
		float area = ((3 * p.sqrt(3)) / 2) * p.pow(radius , 2);
		return area;
	}
	
	/**
	 * Returns the perimeter of the Hexagon.
	 * @return float: Perimeter of the Hexagon.
	 */
	public float perimeter()
	{
		float perimeter = 6 * radius;
		return perimeter;
	}
	
	/**
	 * Returns the internal angle of the Hexagon.
	 * @return float: Internal angle of the Hexagon.
	 */
	public float internalAngle()
	{
		// (( 180 * 6 ) - 360) / 6
		return 120.0f;
	}
	
	/**
	 * Returns the external angle of the Hexagon.
	 * @return float: External angle of the Hexagon.
	 */
	public float externalAngle()
	{
		// 180 - internal angle
		return 60.0f;
	}
}

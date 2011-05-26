package org.vormplus.shapeLib;

import processing.core.PApplet;
import org.vormplus.shapeLib.BasicShape;

public class RoundedRectangle extends BasicShape {

	public float w;
	public float h;
	public float r;
	
	/**
	 * Creates a RoundedRectangle object
	 * @param _p Reference to the PApplet object. Normally use 'this'
	 */
	public RoundedRectangle( PApplet _p )
	{
		super( _p );
		
		w = 100.0f;
		h = 100.0f;
		r = 20.0f;
		
	}
	
	/**
	 * Sets the width for the rounded rectangle.
	 * @param _w width for the rounded rectangle.
	 */
	public RoundedRectangle setWidth( float _w )
	{
		w = _w;
		return this;
	}
	
	/**
	 * Sets the height for the rounded rectangle.
	 * @param _h height for the rounded rectangle.
	 */
	public RoundedRectangle setHeight( float _h )
	{
		h = _h;
		return this;
	}
	
	/**
	 * Sets the radius for the rounded rectangle.
	 * @param _r radius for the rounded rectangle.
	 */
	public RoundedRectangle setRadius( float _r )
	{
		r = _r;
		return this;
	}
	
	/**
	 * Renders the rounded rectangle to the screen.
	 */
	public void render()
	{
		p.beginShape();
		p.vertex(  w/2 - r, -h/2 );
		p.bezierVertex( w/2 - r , -h/2, w/2, -h/2, w/2 , -h/2 + r);
		p.vertex(  w/2 , h/2 - r );
		p.bezierVertex( w/2, h/2 , w/2 - r , h/2 , w/2 - r, h/2);
		p.vertex( -w/2 + r,  h/2 );
		p.bezierVertex( - w/2, h/2, -w/2, h/2 - r, -w/2 , h/2 - r );
		p.vertex( -w/2 , -h/2 + r );
		p.bezierVertex( -w/2, -h/2, -w/2 + r, -h/2, -w/2 + r, -h/2 );		
		p.endShape(p.CLOSE);	
	}
	
	/**
	 * Returns the area of the rounded rectangle.
	 * @return float: Area of the rounded rectangle.
	 */
	public float area()
	{
		float area = (w * h) - ( 4 * r * r) + ( p.PI * r * r );
		return area;
	}
	
	/**
	 * Returns the perimeter of the rounded rectangle.
	 * @return float: Perimeter of the rounded rectangle.
	 */
	public float perimeter()
	{
		float perimeter = (( w + h ) * 2) - ( 8 * r ) + ( p.PI * r * 2);
		return perimeter;
	}
	
}

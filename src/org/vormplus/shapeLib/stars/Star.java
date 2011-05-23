package org.vormplus.shapeLib.stars;

import processing.core.PApplet;
import org.vormplus.shapeLib.BasicShape;

public class Star extends BasicShape {

	public float innerRadius;
	public float outerRadius;
	
	public  int  numSpikes;
	private int  numPoints;

	private float cosLUT[];
	private float sinLUT[];	
	
	/**
	 * Creates a Star object
	 * @param _p Reference to the PApplet object. Normally use 'this'
	 */
	public Star( PApplet _p )
	{
		super( _p );
	
		numSpikes = 6;
		numPoints = numSpikes * 2;
		innerRadius = 50.0f;
		outerRadius = 100.0f;
		
		cosLUT = new float[numPoints];
		sinLUT = new float[numPoints];
		
		calculatePoints();
	}
	
	public Star setNumSpikes( int _numSpikes )
	{
		numSpikes = _numSpikes;
		numPoints = numSpikes * 2;
		cosLUT = new float[numPoints];
		sinLUT = new float[numPoints];
		calculatePoints();
		return this;
	}
	
	/**
	 * Sets the inner radius for the star.
	 * @param r Inner radius for the star.
	 */
	public Star setInnerRadius( float r )
	{
		innerRadius = r;
		calculatePoints();
		return this;
	}

	/**
	 * Sets the outer radius for the star.
	 * @param r Outer radius for the star.
	 */
	public Star setOuterRadius( float r )
	{
		outerRadius = r;
		calculatePoints();
		return this;
	}
	
	/**
	 * Renders the star to the screen.
	 */
	public void render()
	{
		p.beginShape();
		for ( int i = 0; i < numPoints; i++ ) {
		    float x, y;
		    if ( i % 2 == 0 ) {
		        x = cosLUT[i] * outerRadius;
		        y = sinLUT[i] * outerRadius;
		    } else {
		        x = cosLUT[i] * innerRadius;
		        y = sinLUT[i] * innerRadius;
		    }
		    p.vertex( x, y );
		}		
		p.endShape(p.CLOSE);
		
	}
	
	private void calculatePoints()
	{
		float a = p.TWO_PI / numPoints;
		
		for ( int i = 0; i < numPoints; i++ ) {
			cosLUT[i] = p.cos( a * i );
        	sinLUT[i] = p.sin( a * i );
		}	
	}
	
}

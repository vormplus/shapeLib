package org.vormplus.shapeLib;

import processing.core.*;
import org.vormplus.shapeLib.BasicShape;

public class Rectangle extends BasicShape {
	
	public float w;
	public float h;
	
	public Rectangle( PApplet _p )
	{
		super( _p );
		
		w = 150.0f;
		h = 100.0f;
	}
	
	public Rectangle setWidth( float _w )
	{
		w = _w;
		return this;
	}
	
	public Rectangle setHeight( float _h )
	{
		h = _h;
		return this;
	}
	
	public void render()
	{
		p.beginShape();
		p.vertex( -w/2, -h/2 );
		p.vertex(  w/2, -h/2 );
		p.vertex(  w/2,  h/2 );
		p.vertex( -w/2,  h/2 );		
		p.endShape( PConstants.CLOSE );
	}
	
	public float area()
	{
		return w * h;
	}
	
	public float perimeter()
	{
		return ( w + h ) * 2;
		
	}
}

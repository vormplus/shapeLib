package org.vormplus.shapeLib;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PVector;

import org.vormplus.shapeLib.BasicShape;

public class Circle extends BasicShape {

	public float radius;
	
	private int numVertices = 360;
	public PVector[] vertices;
	
	public Circle( PApplet _p )
	{
		super( _p );

		radius = 50.0f;
		vertices = calculateVertices( numVertices, radius );

	}

	/**
	 * Sets the radius for the Circle.
	 * @param r Radius for the Circle.
	 */
	public Circle setRadius(float r)
	{
		radius = r;
		vertices = calculateVertices( numVertices, radius );

		return this;
	}
	
	/**
	 * Function to calculate the coordinates of the vertices
	 */
	PVector[] calculateVertices( int numVertices, float radius)
	{
		PVector[] vertices = new PVector[numVertices];
		
		float a = PConstants.TWO_PI / numVertices;
		for (int i = 0; i < numVertices; i++) {
			float x = PApplet.cos( i * a ) * radius;
			float y = PApplet.sin( i * a ) * radius;
			vertices[i] = new PVector( x, y );
		}
		
		return vertices;		
	}

	/**
	 * Renders the Circle to the screen.
	 */
	public void render()
	{
		p.beginShape();
		for (int i = 0; i < vertices.length; i++) {
			p.vertex( vertices[i].x, vertices[i].y );
		}
		p.endShape(PConstants.CLOSE);
	}

	/**
	 * Returns the area of the Circle.
	 * @return float: Area of the Circle.
	 */
	public float area()
	{
		return PConstants.PI * radius * radius;
	}
	
	/**
	 * Returns the circle of the Circle.
	 * @return float: Circumference of the Circle.
	 */
	public float circumference()
	{
		return PConstants.TWO_PI * radius;
	}
}
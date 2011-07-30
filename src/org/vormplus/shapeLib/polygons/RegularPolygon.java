package org.vormplus.shapeLib.polygons;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PVector;

import org.vormplus.shapeLib.BasicShape;

public class RegularPolygon extends BasicShape {

	public RegularPolygon( PApplet _p ) {
		super( _p );
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
	 * Renders the Polygon to the screen.
	 */
	public void render( PVector[] vertices )
	{
		p.beginShape();
		for (int i = 0; i < vertices.length; i++) {
			p.vertex( vertices[i].x, vertices[i].y );
		}
		p.endShape(PConstants.CLOSE);
	}

	
	/**
	 * Function to calculate the area of the regular polygon.
	 * More info about calculating the area of regular polygons can be found over here: http://www.mathopenref.com/polygonregulararea.html
	 */
	public float area( int numVertices, float radius )
	{
		float area = ( radius * radius * numVertices * PApplet.sin( PConstants.TWO_PI / numVertices ) ) / 2;
		
		return area;	
	}
	
	/**
	 * Function to calculate the internal angle of the regular polygon
	 */
	public float perimeter( PVector[] vertices )
	{	
		float perimeter = PApplet.dist( vertices[0].x, vertices[0].y, vertices[1].x, vertices[1].y ) * vertices.length;
		
		return perimeter;	
	}
	
	/**
	 * Function to calculate the internal angle of the regular polygon
	 */
	public float internalAngle( int numVertices )
	{
		return (( 180 * numVertices ) - 360) / numVertices;
	}

	/**
	 * Function to calculate the external angle of the regular polygon
	 */
	public float externalAngle( int numVertices )
	{
		return 180 - internalAngle( numVertices );
	}
}

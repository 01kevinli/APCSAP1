//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	public Ball(int x, int y) {
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;
		
	}
	
	public Ball(int x, int y, int width, int height) {
		super(x,y,width,height);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int width, int height, Color col) {
		super(x,y,width,height,col);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int width, int height, Color col, int xS, int yS) {
		super(x,y,width,height,col);
		xSpeed = xS;
		ySpeed = yS;
	}
	public Ball(int x, int y, int width, int height, int xS, int yS) {
		super(x,y,width,height);
		xSpeed = xS;
		ySpeed = yS;
	}
	public void setXSpeed(int xS){
		xSpeed = xS;
	}
	
	public void setYSpeed(int yS){
		ySpeed = yS;
	}
	
	
	 public int getXSpeed()
	  {
		  return xSpeed;
	  }
	  
	  public int getYSpeed()
	  {
		  return ySpeed;
	  }
	

   

   public void moveAndDraw(Graphics window)
   {
   	draw(window, Color.white);
    window.fillOval(getX(), getY(), getWidth(), getHeight());
   	setX(getX()+xSpeed);
   	setY(getY()+ySpeed);

	window.setColor(Color.black);
	window.fillOval(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Ball ball = (Ball) obj;
		if( ball.getXSpeed()!= xSpeed){
			return false;
		}
		if(ball.getYSpeed()!= ySpeed) {
			return false;
		}
		else return true;



		
	}   

  

   public String toString() {
	  return super.toString() + " " + xSpeed + " "+ySpeed;
   }
   public boolean didCollideLeft(Object obj) {
	   Block ob = (Block) obj;
	   if(getX() > ob.getX() && getX()<= ob.getX() + ob.getWidth() && (getY() >= ob.getY() && getY() + getHeight() <= ob.getY() + ob.getHeight()) ) {
		   return true;
	   }
	   return false;
   }
   public boolean didCollideRight(Object obj){
		Block ob = (Block)obj;
		if (getX() < ob.getX() && getX() + getWidth() >= ob.getX() && (getY() >= ob.getY() && getY() + getHeight() <= ob.getY()+ob.getHeight())){
			return true;
		}
		return false;
	}
	public boolean didCollideTop(Object obj){
		Block ob = (Block)obj;
		if (getY()+getHeight() >= ob.getY() && getY() < ob.getY()+ob.getHeight() && (getX()>=ob.getX() && getX()+getWidth()<=ob.getX()+ob.getWidth())){
			return true;
		}
		return false;
	}
	public boolean didCollideBottom(Object obj){
		Block ob = (Block)obj;
		if (getY() <= ob.getY()+ob.getHeight() && getY()+getHeight() > ob.getY() && (getX()>=ob.getX() && getX()+getWidth()<=ob.getX()+ob.getWidth())){
			return true;
		}
		return false;
	}
   
   
}
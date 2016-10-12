/*

* @ Xolani Gwaqa
* Draw Applet  
* Choose Color and draw

*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Drawmodified extends Applet   
{

	String temp;
	Choice l;
	Color c;
	private int x_pos=0,y_pos=0;


	Graphics g = getGraphics();
 

 public void init()
 {

	 setLayout(new BorderLayout());
	 Ha ll = new Ha();
	 l =new Choice();
	 l.addItem("red");
	 l.addItem("yellow");
	 l.addItem("green");
	 l.addItem("blue");
	 l.addItem("pink");
	 l.addItem("white");
	 l.addItem("black");
	 l.addItem("magenta");
	 
	
	 Panel p1 = new Panel(); 
	 
	 
	 p1.add(l); 
	 l.addItemListener(ll);
	 add(p1,"North");

    Handlepanel p = new Handlepanel();

	addMouseMotionListener(p);

	
}


class Ha implements ItemListener
{
 public void itemStateChanged(ItemEvent ie)
 {

  if(ie.getStateChange() == ie.SELECTED)
  {
   temp = l.getSelectedItem();
  
  }  
 }
}



class Handlepanel extends MouseMotionAdapter
{

public void mouseDragged(MouseEvent e)
 {
  x_pos =e.getX();
  y_pos =e.getY();
  
  int lastx,lasty;
 
  lastx =e.getX();
  lasty =e.getY();
  Graphics g = getGraphics();
  
	  if(temp =="red")
	  g.setColor(Color.red);
	  else 
	  if(temp=="yellow")
	  g.setColor(Color.yellow);
	  else if(temp=="green")
	  g.setColor(Color.green);
	   else if(temp=="black")
	  g.setColor(Color.black);
	  else if(temp=="pink")
	  g.setColor(Color.pink);
	  else if(temp=="magenta")
	  g.setColor(Color.magenta);
	  else if(temp=="white")
	  g.setColor(Color.white);
	 
  else g.setColor(Color.blue);
	  g.drawLine(x_pos-4,y_pos-4,lastx-4,lasty-4);
	  g.drawLine(x_pos-3,y_pos-3,lastx-3,lasty-3);
	  g.drawLine(x_pos-1,y_pos-2,lastx-2,lasty-2);
	  g.drawLine(x_pos+1,y_pos+1,lastx+1,lasty+1);
	  g.drawLine(x_pos,y_pos,lastx,lasty);
	  g.drawLine(x_pos+1,y_pos+1,lastx+1,lasty+1);
	  g.drawLine(x_pos+2,y_pos+2,lastx+2,lasty+2);
	  g.drawLine(x_pos+3,y_pos+3,lastx+3,lasty+3);
	  g.drawLine(x_pos+4,y_pos+4,lastx+4,lasty+4);
	  lastx=x_pos;
	  lasty=y_pos;
	  
 }

}

}
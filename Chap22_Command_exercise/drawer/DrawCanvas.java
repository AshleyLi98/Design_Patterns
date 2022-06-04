package drawer;

import command.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawCanvas extends Canvas implements Drawable{
	
	private Color color;
	private int radius;
	private MacroCommand history;
	
	public DrawCanvas(int width, int height, MacroCommand history) {
		setSize(width, height);
		setBackground(Color.white);
		this.history = history;
		init();
	}
	
	public void paint(Graphics g) {
		history.execute();
	}
	
	public void draw(int x, int y) {
		Graphics g = getGraphics();
		g.setColor(color);
		g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
		color = Color.red;
		radius = 6;
		history.append(new ColorCommand(this, color));
		
	}

	@Override
	public void setColor(Color color) {
		// TODO Auto-generated method stub
		
		this.color = color;
		
	}

}

package com.UltraUI.com.main;

import java.awt.Color;
import java.awt.Graphics;

public class Menu {

	public void tick() {
		
	}
	
	public void render(Graphics g) {
		g.setColor(Color.cyan);
		g.fillRect(0, 0, Game.WIDTH*Game.SCALE, Game.HEIGHT*Game.SCALE);
	}

}

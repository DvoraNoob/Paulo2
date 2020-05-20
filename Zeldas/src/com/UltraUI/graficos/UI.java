package com.UltraUI.graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.UltraUI.com.main.Game;
import com.UltraUI.entities.*;

public class UI {

	public void render(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(8, 4, 80, 8);
		g.setColor(Color.GREEN);
		g.fillRect(8, 4,(int)((Game.player.life/Game.player.maxlife)*80), 8);
	}
	
	
	
}

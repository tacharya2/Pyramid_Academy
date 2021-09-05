package com.firstSpringFrame.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	private GameConsole game;

	@Autowired
	public GameRunner(GameConsole game) { // Constructor
		this.game = game;
	}

	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
}

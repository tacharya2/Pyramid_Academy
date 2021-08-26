package com.firstSpringFrame.learnspringframework;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.firstSpringFrame.learnspringframework.game.GameRunner;
import com.firstSpringFrame.learnspringframework.game.MarioGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		// SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		MarioGame game = new MarioGame();

		GameRunner runner = new GameRunner(game);

		runner.runGame();

	}

}

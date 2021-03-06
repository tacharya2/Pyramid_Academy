// NOTE: To create a new package under the existing package: 
// Go to the current package and .addName of new package
package com.firstSpringFrame.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.firstSpringFrame.learnspringframework.game.GameRunner;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

		// select the expression and Alt + Shift + L = new Context menu
		// OR Ctrl + 1;

		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		// We have various contexts to call here: MarioGame, GameRunner, SuperContraGame
		// Which one do you want to bean the context with
		/*
		 * MarioGame game = new MarioGame(); GameRunner runner = new GameRunner(game);
		 */

		GameRunner runner = context.getBean(GameRunner.class);

		runner.runGame();
	}
}

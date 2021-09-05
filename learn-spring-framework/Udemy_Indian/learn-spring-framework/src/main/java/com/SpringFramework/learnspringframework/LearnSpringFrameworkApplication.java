package com.SpringFramework.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

		// IntelliJ shortcut key to assign a statement to a new local variable = Ctrl + Alt + v
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		// We have various contexts to call here: MarioGame, GameRunner, SuperContraGame
		// Which one do you want to bean the context with
		GameRunner runner = context.getBean(GameRunner.class);

		//MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();// dafault constructor and an instance
		//GameRunner gameRunner = new GameRunner(game);// user defined constructor and an instance

		runner.runGame();
	}
}

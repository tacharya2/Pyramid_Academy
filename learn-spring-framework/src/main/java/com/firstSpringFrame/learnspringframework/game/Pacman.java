package com.firstSpringFrame.learnspringframework.game;

import org.springframework.context.annotation.Primary;

public class Pacman implements GameConsole {

	@Override
	@Primary
	public void up() {
		System.out.println("Look up");

	}

	@Override
	public void down() {
		System.out.println("Look down");
	}

	@Override
	public void left() {
		System.out.println("Look back");
	}

	@Override
	public void right() {
		System.out.println("Look front");
	}

}

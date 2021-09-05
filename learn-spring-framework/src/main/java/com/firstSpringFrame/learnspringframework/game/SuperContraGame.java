package com.firstSpringFrame.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GameConsole{

	@Override
	public void up() {
		System.out.println("Move up");

	}

	@Override
	public void down() {
		System.out.println("Move down");

	}

	@Override
	public void left() {
		System.out.println("Go back");

	}

	@Override
	public void right() {
		System.out.println("Go forward");

	}
}

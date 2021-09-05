package com.SpringFramework.learnspringframework;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {
    @Override
    public void up(){
        System.out.println("Jump up");
    }
    @Override
    public void down(){
        System.out.println("Get into the hole");
    }
    @Override
    public void left(){
        System.out.println("Stop");
    }
    @Override
    public void right(){
        System.out.println("accelerate");
    }
}

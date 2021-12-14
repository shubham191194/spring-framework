package com.shubham.learning.springframework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MarioGame implements IGame {

    @Override
    public void up() {
        System.out.println("Jumping up");
    }

    @Override
    public void down() {
        System.out.println("Going down the pipe");
    }

    @Override
    public void left() {
        System.out.println("going left");
    }

    @Override
    public void right() {
        System.out.println("Going right");
    }
}

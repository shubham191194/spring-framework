package com.shubham.learning.springframework;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements IGame {
    @Override
    public void up() {
        System.out.println("Contra going up");
    }

    @Override
    public void down() {
        System.out.println("Contra going down");
    }

    @Override
    public void left() {
        System.out.println("Contra going left");
    }

    @Override
    public void right() {
        System.out.println("Contra going right");
    }
}

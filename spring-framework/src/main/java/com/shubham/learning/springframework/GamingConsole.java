package com.shubham.learning.springframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GamingConsole {
    private IGame iGame;

    @Autowired
    public GamingConsole(IGame iGame) {
        this.iGame = iGame;
    }

    public void run() {
        iGame.left();
        iGame.right();
        iGame.down();
        iGame.up();
    }
}

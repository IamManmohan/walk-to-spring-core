package org.spring.core.without.xml.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Game {
    @Value("Cricket")
    private String gameName;
    private Player player;

    public Game() {
        super();
    }

    public Game(String gameName, Player player) {
        this.gameName = gameName;
        this.player = player;
    }

    @Autowired
    public Game(Player player) {
        this.player = player;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameName='" + gameName + '\'' +
                ", player=" + player +
                '}';
    }
}

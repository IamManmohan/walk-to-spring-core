package org.spring.core.without.xml.config;

import org.springframework.beans.factory.annotation.Value;

public class Player {
    @Value("Cricketer")
    private String playerType;

    public Player() {
        super();
    }

    public Player(String playerType) {
        this.playerType = playerType;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerType='" + playerType + '\'' +
                '}';
    }
}

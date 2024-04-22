package com.gamingroom;

/**
 * A class to hold information about a player, inheriting from the Entity class.
 *
 * @author coce@snhu.edu
 */
public class Player extends entity {

    /**
     * Constructor with an identifier and name
     */
    public Player(long id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "Player [id=" + getId() + ", name=" + getName() + "]";
    }
}
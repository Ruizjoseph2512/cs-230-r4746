package com.gamingroom;

/**
 * A class to hold information about a game, inheriting from the Entity class.
 *
 * @author coce@snhu.edu
 */
public class Game extends entity {

    /**
     * Hide the default constructor to prevent creating empty instances.
     */
    private Game() {
        super(0, null); // Call the Entity constructor with default values
    }

    /**
     * Constructor with an identifier and name
     */
    public Game(long id, String name) {
        super(id, name); // Call the Entity constructor with provided values
    }

    @Override
    public String toString() {
        return "Game [id=" + getId() + ", name=" + getName() + "]";
    }
}
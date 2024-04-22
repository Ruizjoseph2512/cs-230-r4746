package com.gamingroom;

/**
 * A class to hold information about a team, inheriting from the Entity class.
 *
 * @author coce@snhu.edu
 */
public class Team extends entity {

    /**
     * Constructor with an identifier and name
     */
    public Team(long id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "Team [id=" + getId() + ", name=" + getName() + "]";
    }
}
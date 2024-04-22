package com.gamingroom;

/**
 * A base class to hold common attributes and behaviors for entities in the game.
 *
 * @author [Your Name]
 */
public class entity {
    private long id;
    private String name;
    private boolean isActive;

    /**
     * Constructor to create a new Entity object.
     *
     * @param id   The unique identifier for the entity.
     * @param name The name of the entity.
     */
    public entity(long id, String name) {
        this.id = id;
        this.name = name;
        this.isActive = true; // Entities are active by default
    }

    /**
     * Retrieves the unique identifier of the entity.
     *
     * @return The id of the entity.
     */
    public long getId() {
        return id;
    }

    /**
     * Retrieves the name of the entity.
     *
     * @return The name of the entity.
     */
    public String getName() {
        return name;
    }

    /**
     * Checks if the entity is active or not.
     *
     * @return True if the entity is active, false otherwise.
     */
    public boolean getIsActive() {
        return isActive;
    }

    /**
     * Activates or deactivates the entity.
     *
     * @param active True to activate the entity, false to deactivate.
     */
    public void setActive(boolean active) {
        this.isActive = active;
    }

    @Override
    public String toString() {
        return "Entity [id=" + id + ", name=" + name + ", isActive=" + isActive + "]";
    }
}
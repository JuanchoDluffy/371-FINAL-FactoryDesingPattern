/**
 * This class represents a  space pirate enemy ship, which is a type of UFO enemy ship.
 * It has a pirate theme, a unique name, and inflicts high damage.
 */
public class SpacePirateEnemyShip extends UFOEnemyShip {
    
    /**
     * Constructs a new PirateEnemyShip object with a predefined name and damage.
     */
    public SpacePirateEnemyShip(){
        setName("Pirate Enemy Ship!!!");
        setDamage(500.0);
    }
}


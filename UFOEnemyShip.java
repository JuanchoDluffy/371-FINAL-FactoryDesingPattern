/**
 * This class represents a UFO enemy ship, which is a type of enemy ship.
 * It has a unique name and inflicts moderate damage.
 */
public class UFOEnemyShip extends EnemyShip {
    
    /**
     * Constructs a new UFOEnemyShip object with a predefined name and damage.
     */
    public UFOEnemyShip(){
        setName("UFO Enemy Ship");
        setDamage(20.0);
    }
}

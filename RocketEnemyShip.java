/**
 * This class represents a rocket enemy ship, which is a type of enemy ship.
 * It has a unique name and inflicts moderate damage.
 */
public class RocketEnemyShip extends EnemyShip {
    
    /**
     * Constructs a new RocketEnemyShip object with a predefined name and damage.
     */
    public RocketEnemyShip(){
        setName("Rocket Enemy Ship");
        setDamage(10.0);
    }
}

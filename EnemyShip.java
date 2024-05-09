/**
 * This abstract class represents an enemy ship in a game.
 */
public abstract class EnemyShip {
    
    /** The name of the enemy ship. */
    private String name;
    
    /** The speed of the enemy ship. */
    private double speed;
    
    /** The X direction of the enemy ship. */
    private double directionX;
    
    /** The Y direction of the enemy ship. */
    private double directionY;
    
    /** The amount of damage the enemy ship can inflict. */
    private double amtDamage;
    
    /**
     * Get the name of the enemy ship.
     * @return The name of the enemy ship.
     */
    public String getName() { return name; }
    
    /**
     * Set the name of the enemy ship.
     * @param newName The new name of the enemy ship.
     */
    public void setName(String newName) { name = newName; }
    
    /**
     * Get the amount of damage the enemy ship can inflict.
     * @return The amount of damage the enemy ship can inflict.
     */
    public double getDamage() { return amtDamage; }
    
    /**
     * Set the amount of damage the enemy ship can inflict.
     * @param newDamage The new amount of damage the enemy ship can inflict.
     */
    public void setDamage(double newDamage) { amtDamage = newDamage; }
    
    /**
     * Make the enemy ship follow the hero ship.
     */
    public void followHeroShip(){
        System.out.println(getName() + " is following the hero");
    }
    
    /**
     * Display the enemy ship on the screen.
     */
    public void displayEnemyShip(){
        System.out.println(getName() + " is on the screen");
    }
    
    /**
     * Make the enemy ship shoot and inflict damage to the hero ship.
     */
    public void enemyShipShoots() {
        System.out.println(getName() + " attacks and does " + getDamage() + " damage to hero");
    }
    
}


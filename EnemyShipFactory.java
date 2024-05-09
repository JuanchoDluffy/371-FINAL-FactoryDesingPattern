/**
 * This class represents a factory for creating enemy ships.
 * By encapsulating ship creation, modifications can be made in a single place.
 */
public class EnemyShipFactory{
    
    /**
     * Creates an enemy ship based on the provided ship type.
     * @param newShipType The type of ship to create.
     * @return An instance of the created enemy ship.
     */
    public EnemyShip makeEnemyShip(String newShipType){
        
        EnemyShip newShip = null;
        
        if (newShipType.equals("U")){
            return new UFOEnemyShip();
        } else if (newShipType.equals("R")){
            return new RocketEnemyShip();
        } else if (newShipType.equals("P")){
            return new SpacePirateEnemyShip();
        } else if (newShipType.equals("S")){
            return new SuperDestroyerEnemyShip();
        } else if (newShipType.equals("B")){
            return new BigUFOEnemyShip();
        } else {
            return null;
        }
    }
}

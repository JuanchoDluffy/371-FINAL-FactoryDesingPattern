import java.util.Scanner;

/**
 * This class tests the functionality of the EnemyShip and EnemyShipFactory classes.
 */
public class EnemyShipTesting {

    /**
     * The main method to test the creation and behavior of enemy ships.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args){
        
        // Create the factory object
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        
        // Enemy ship object
        EnemyShip theEnemy = null;
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("What type of ship? (U / R / B / P / S)");
        
        if (userInput.hasNextLine()){
            String typeOfShip = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
            if(theEnemy != null){
                doStuffEnemy(theEnemy);
            } else {
                System.out.print("Please enter U, R, B, P, or S next time");
            }
        }
    }
    
    /**
     * Executes methods of the super class.
     * @param anEnemyShip The enemy ship object.
     */
    public static void doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}

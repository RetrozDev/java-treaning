public class BattleSimulator {
    public static void simulateBattle(Player player1, Player player2) {
        Console.info("--- Battle begins! ---");
        int round = 1;
        
        while (player1.getHealth() > 0 && player2.getHealth() > 0) {
            Console.info("Round " + round + ":");
            
            // Player 1 attacks
            performAttack(player1, player2);
            if (player2.getHealth() <= 0) {
                Console.success(player1.getName() + " wins! " + player2.getName() + " has been defeated!");
                break;
            }

            // Player 2 attacks
            performAttack(player2, player1);
            if (player1.getHealth() <= 0) {
                Console.success(player2.getName() + " wins! " + player1.getName() + " has been defeated!");
                break;
            }
            
            round++;
            Console.info(""); // Empty line for better readability
        }
    }
    
    private static void performAttack(Player attacker, Player defender) {
        Console.log(attacker.getName() + " attacks " + defender.getName());
        defender.setHealth(defender.getHealth() - attacker.getAttackPower());
        Console.log(defender.getName() + " health: " + defender.getHealth());
    }
}

public class Chapter6 {
    public static void run() {
        Console.info("=== Chapter 6: Objects ===");
        
        // Create players
        Player player1 = new Player("Player 1", 100.0, 20.0);
        Player player2 = new Player("Player 2", 120.0, 25.0);
        
        // Display player stats
        displayPlayerStats(player1);
        displayPlayerStats(player2);
        
        Console.success("Both players are ready for battle!");
        
        // Start the battle
        BattleSimulator.simulateBattle(player1, player2);
    }
    
    private static void displayPlayerStats(Player player) {
        Console.info(player.getName() + " stats:"
                + "\nHealth: " + player.getHealth()
                + "\nAttack Power: " + player.getAttackPower());
    }
}

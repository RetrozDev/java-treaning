public class Pineapple extends Fruit {

    public Pineapple() {
        super("Pineapple", "Yellow", false); // Initialize with name, color, and seed presence
    }
    
    @Override
    public void taste() {
        Console.log("The pineapple tastes sweet and tangy.");
    }

    
}

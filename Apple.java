public class Apple extends Fruit {

    public Apple() {
        super("Apple", "Green", true); // Initialize with name, color, and seed presence
    }
    
    @Override
    public void taste() {
        Console.log("The apple tastes sweet and crisp.");
    }

    
}

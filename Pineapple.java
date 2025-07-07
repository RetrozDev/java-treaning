public class Pineapple extends Fruit implements PeelFruit {

    private final  boolean peeled = false; 

    public Pineapple() {
        super("Pineapple", "Yellow", false); // Initialize with name, color, and seed presence
    }
    
    @Override
    public void taste() {
        Console.log("The pineapple tastes sweet and tangy.");
    }

    @Override
    public boolean isPeeled() {
        return peeled;
    }

    @Override
    public String getSkinType() {
        return "Rough and spiky";
    }

    
}

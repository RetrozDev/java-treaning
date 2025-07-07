public class Strawberry extends Fruit implements PeelFruit {

    private final boolean peeled = false; // Default state of the strawberry

    public Strawberry() {
        super("Strawberry", "Red", true); // Initialize with name, color, and seed presence
    }

    @Override
    public void taste() {
        Console.log("The strawberry tastes sweet and juicy.");
    }

    @Override
    public boolean isPeeled() {
        return peeled;
    }

    @Override
    public String getSkinType() {
        return "Red skin with tiny seeds on the surface";
    }

}

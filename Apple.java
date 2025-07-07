public class Apple extends Fruit implements PeelFruit {

    private final boolean peeled = false;

    public Apple() {
        super("Apple", "Green", true); // Initialize with name, color, and seed presence
    }

    @Override
    public void taste() {
        Console.log("The apple tastes sweet and crisp.");
    }

    @Override
    public boolean isPeeled() {
        return peeled;
    }

    @Override
    public String getSkinType() {
        return "Smooth green skin";
    }

}

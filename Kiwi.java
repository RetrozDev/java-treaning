public class Kiwi extends Fruit implements PeelFruit {

    private final  boolean peeled = false; // Default state of the kiwi

    public Kiwi() {
        super("Kiwi", "Brown", true); // Initialize with name, color, and seed presence
    }
    
    @Override
    public void taste() {
        Console.log("The kiwi tastes sweet and slightly tangy.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        Console.log("Kiwi is a small fruit with a fuzzy brown exterior and bright green flesh.");
    }

    @Override
    public boolean isPeeled() {
        return peeled ;
    }

    @Override
    public String getSkinType() {
        return "Fuzzy brown skin" ;
    }
    
}

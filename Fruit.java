public abstract class Fruit {

    private final String  name;
    private final String color;
    private final boolean hasSeeds;
    
    public Fruit(String name, String color, boolean hasSeeds) {
        this.name = name;
        this.color = color;
        this.hasSeeds = hasSeeds;
    }



    public abstract void taste();
    public void displayInfo() {
        Console.log("Fruit name: " + name);
        Console.log("Fruit color: " + color);
        Console.log("Does the fruit have seeds? " + hasSeeds);
    }
}

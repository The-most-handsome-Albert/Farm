public class Chicken {
    private String breed;
    private int eggsPerDay;
    private boolean isMean;
    private double weight;

    public Chicken(){
        breed = "Fried Chicken";
        eggsPerDay = 1;
        isMean = false;
        weight = 1.0;
    }

    public Chicken(String b, int e, boolean m, double w) {
        breed = b;
        eggsPerDay = e;
        isMean = m;
        weight = w;
    }

    public void makeNoise(){
        System.out.println("CLUCK CLUCK CLUCK");
    }

    public double eatFood(int amount){
        weight += amount;
        return weight;
    }

    public void displayChicken() {
        System.out.println("Breed: " + breed);
        System.out.println("Eggs per day: " + eggsPerDay);
        System.out.println("Mean: " + isMean);
        System.out.println("Weight: " + weight);
    }
}

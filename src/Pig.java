public class Pig {
    private String color;
    private int sizeOfPen;
    private boolean wallowedInMud;
    private double weight;

    public Pig(){
        color = "brown";
        sizeOfPen = 100;
        wallowedInMud = true;
        weight = 1.0;
    }

    public Pig(String c, int s, boolean w, double we){
        color = c;
        sizeOfPen = s;
        wallowedInMud = w;
        weight = we;
    }

    public void makeNoise(){
        System.out.println("OINK OINK OINK");
    }

    public int upgradePenSize(int amount){
        sizeOfPen += amount;
        return sizeOfPen;
    }

    public void displayPig() {
        System.out.println("Color: " + color);
        System.out.println("Size of pen: " + sizeOfPen);
        System.out.println("Wallowed In Mud: " + wallowedInMud);
        System.out.println("Weight: " + weight);
    }
}

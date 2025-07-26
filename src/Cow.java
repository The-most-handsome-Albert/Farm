public class Cow {
    private String name;
    double weight;
    int age;
    boolean isMale;

    public Cow(){
        name = "Cow";
        weight = 1.0;
        age = 1;
        isMale = true;
    }

    public Cow(String n, double w, int a, boolean m){
        name = n;
        weight = w;
        age = a;
        isMale = m;
    }

    public void makeNoise(){
        System.out.println("MOO MOO MOO");
    }

    public int haveBirthday(){
        age++;
        return age;
    }

    public void displayCow(){
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + isMale);
    }
}

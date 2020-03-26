package surcharge;

public class Entity {

    String name;
    int age;

    public Entity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String ageDifference(int age) {
        return "difference = " + (this.age - age) + " years";
    }
}

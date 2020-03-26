package surcharge;

import java.awt.print.Pageable;

public class sousEntity extends Entity {

    public sousEntity(String name,int age) {
        super(name, age);
    }

    public String ageDifference(int age) {
        return ""+(this.age-age);
    }

    public int ageDifference() {
        return 0;
    }
}

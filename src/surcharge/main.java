package surcharge;

public class main {

    static int nombreDeMatch(int participant){
        return participant*(participant-1)/2;
    }

    public static void main(String[] args) {


        Entity entity = new sousEntity("seb", 46);

        Entity entity1 = new Entity("sebE", 45);

        System.out.println(entity.ageDifference(20));

        System.out.println(entity1.ageDifference(20));

        System.out.println(entity.ageDifference(20));

        sousEntity sousEntity = (surcharge.sousEntity) entity;

        System.out.println(sousEntity.ageDifference());

        System.out.println(sousEntity.hashCode());

        System.out.println(entity.hashCode());

        entity.name = "kathia";

        System.out.println(entity.name);
        System.out.println(sousEntity.name);
        System.out.println(nombreDeMatch(4));
    }
}

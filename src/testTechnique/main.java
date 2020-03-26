package testTechnique;

public class main {

    public static void main(String[] args) {

        Node first = new Node(0);

        Node second = new Node(1);
        first.nextNode = second;

        Node third = new Node(2);
        second.nextNode = third;

        Node fourth = new Node(3);
        third.nextNode = fourth;

        Node fifth = new Node(4);
        fourth.nextNode = fifth;

        System.out.println(fourth.find(3));

        String a = null;

        String b ="";

        if (a != null && a.length() == 0) {
            System.out.println("string vide");

        }

        if (b != null && b.length() == 0) {
            System.out.println("string vide");

        }


    }
}

package testTechnique;

public class Node {

    Node nextNode;
    int valeur;

    public Node(int valeur) {
        this.valeur = valeur;
    }

    public Node find(int request) {
        if (this.valeur == request) {
            return this;
        }
        if (this.nextNode != null && this.nextNode.valeur <= request) {
            return this.nextNode.find(request);
        }

        return null;
    }

    public String toString() {
        return ""+this.valeur;
    }

}

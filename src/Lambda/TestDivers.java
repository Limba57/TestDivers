package Lambda;


import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestDivers {

    public static void main(String[] args) {

        Consumer<Object> afficher = (texte) -> {
            System.out.println(texte.toString());
        };

        afficher.accept("Hello world");

        Comparator<Integer> sortByGreaterThan = (firstInt, secondInt) -> Integer.compare(firstInt, secondInt);

        BiPredicate<Integer,Integer> greaterThan = (firstInt,secondInt) -> firstInt > secondInt;

        afficher.accept(Boolean.toString(greaterThan.test(20,30)));

        Function<Integer,String> nombreEnString = nombre -> {
            return "Ce nombre est égale à : "+nombre;
        };

        Integer[] table = {2, 8, 4, 3, 9, 1, 7, 0};

        afficher.accept(nombreEnString.apply(1258));

        afficher.accept(table.toString());

        Arrays.sort(table,sortByGreaterThan);

        afficher.accept(table.toString());

        Function<Integer,Integer> doubler = (i) ->{
            int resultat = i * 2;
            System.out.println("le double de "+i+" est "+resultat);
            return resultat;
        };

        Function<Integer,Integer> laMoitier = (i) ->{
            int resultat = i/2;
            System.out.println("la moitier de " + i + " est " + resultat);
            return resultat;
        };

        System.out.println(doubler.andThen(laMoitier).apply(14));
        System.out.println(doubler.compose(laMoitier).apply(14));

        List<Integer> tableDeux = new ArrayList<>();
        tableDeux.add(3);
        tableDeux.add(5);
        tableDeux.add(4);
        tableDeux.add(9);
        tableDeux.add(7);
        tableDeux.add(8);
        tableDeux.add(1);
        tableDeux.add(0);

        tableDeux.forEach(afficher::accept);

        Collections.sort(tableDeux, sortByGreaterThan);
        System.out.println("");

        tableDeux.forEach(System.out::print);

        tableDeux.forEach(afficher::accept);


    }
}

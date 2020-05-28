package m2.s08;

import java.util.Arrays;

public class More {
    public static void main(String[] args) {
        int[] one = { 1, 2, 3, 4, 5 };
        int[] two = { 6, 2, 4, 5, 3 };
//toString stampa gli elementi nell'array
        System.out.println(one);
        System.out.println(Arrays.toString(two));
//copyOf gestisce gli elementi
        System.out.println(Arrays.toString(Arrays.copyOf(one, 3)));
//sort riordina
        Arrays.sort(two);
        System.out.println(Arrays.toString(two));
//fill riempie
        int[] three = new int[5];
        Arrays.fill(three, 42);
        System.out.println(Arrays.toString(three));
//equals confronta e ritorna un booleano
        System.out.println(Arrays.equals(one, new int[] { 1, 2, 3, 4, 5 }));
    }
}

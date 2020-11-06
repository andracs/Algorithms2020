import java.util.Arrays;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 06/11/2020
 */

public class Jenna {

    public static void main(String[] args) {
        String[] x = {"a", "b", "c"};
        String y = "y";

        System.out.println(Arrays.toString(x));

        Jenna j = new Jenna();
        j.toString(x);

    }

    void toString(String[] arrayX){
        System.out.print("Arrayet indeholder: [");
        int i = 0;
        for(String navn : arrayX) {
            System.out.print (navn);
            if (i++ < arrayX.length - 1) System.out.print (", ");
        }
        System.out.println("]");
    }
}

package ArraySumProgB;


import java.util.HashSet;

public class HashSetArray {

    public static void main(String[] args) {

        int[] number = {4, 2, 7, 6, -3, -1, -2, 42, 0, -42, 9, -4, 5, -5, -6, -7, -8, -99, 42, 11, 20, 1, 2, 3} ;

        HashSet<Integer> HS = new HashSet<>();

        for (int i = 0; i < number.length; ++i) {

        int temp = 0 - number[i];

        if (HS.contains(temp)) {
            System.out.println(" The pair: " + temp + " and number: " + number[i] + " Adds to 0");
            };
        HS.add(number [i]);
        }
    }
}

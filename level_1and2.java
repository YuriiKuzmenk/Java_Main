package algorims_121022;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class level_1and2 {

    public static void main (String[] args) {

        byte num1;
        byte num2;
        byte num3;
        byte i = 0;
        Scanner loadNumber = new Scanner(System.in);
        int sum;
        System.out.println("Enter the value of number 1 and press the key <Enter>");
        num1 = loadNumber.nextByte();
        System.out.println("Enter the value of number 2 and press the key <Enter>");
        num2 = loadNumber.nextByte();
        System.out.println("Enter the value of number 3 and press the key <Enter>");
        num3 = loadNumber.nextByte();
        sum = num1 + num2 + num3;
        System.out.println("sum= " + sum);
        System.out.println();

        byte[] arrayFor={25,14,56,15,47};
        byte [] arrayAfter = new byte[5];
        System.out.println(Arrays.toString(arrayFor));

        System.out.println("select the number before which we will insert a new element and press the key <Enter>");
        num1 = loadNumber.nextByte();
        System.out.println("Enter the number (for inside in the array) and press the key <Enter>");
        num2 = loadNumber.nextByte();
        byte j = 0;
        for (i=0; i<arrayFor.length; i++, j++ ) {
            arrayAfter[i]=arrayFor[j];
            if ((arrayAfter[i]==num1) & (i==j)) {
                arrayAfter[i]=num2;
                j--;
            }
        };
        System.out.println(Arrays.toString(arrayAfter));
        System.out.println();
        System.out.println(Arrays.toString(arrayFor));
        byte indxmax=0;
        byte indxmin=0;
        byte nmax, nmin;
        nmax=nmin=arrayFor[0];
        for (i=0; i<arrayFor.length-1; i++) {

            if (arrayFor[i+1] > nmax) {nmax=arrayFor[i+1];
                indxmax = (byte) (i+1);
            };
            if (arrayFor[i+1] <nmin) {nmin=arrayFor[i+1];
                indxmin = (byte) (i+1);
            };
        }

           System.out.println("Maximal element: " +(indxmax+1)+ "; value: "+arrayFor[indxmax]);
        System.out.println("Minimal element: " +(indxmin+1)+ "; value: "+arrayFor[indxmin]);





    }
}

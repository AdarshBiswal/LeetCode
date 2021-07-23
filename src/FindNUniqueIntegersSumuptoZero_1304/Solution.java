package FindNUniqueIntegersSumuptoZero_1304;

import java.sql.Array;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int n = 11;
        int output[] = sumZero(n);


        for (int i = 0; i < n; i++) {
            System.out.print(output[i] + " ");
        }

    }


    public static int[] sumZero(int n) {

       int output[]=new int[n];
        for (int i = 0; i < n-1; i+=2) {
            output[i]=i+1;
            output[i+1]=-(i+1);
        }
        if(n%2!=0)
            output[n-1]=0;
       return output;


    }



}

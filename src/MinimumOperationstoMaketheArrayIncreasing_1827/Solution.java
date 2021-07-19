package MinimumOperationstoMaketheArrayIncreasing_1827;

import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String input1[]=s.split(" ");
        int input[]=new int[input1.length];
        for(int i=0;i<input1.length;i++)
        {
            input[i]=Integer.parseInt(input1[i]);
        }

        int min=0;
        for(int i=1;i<input.length;i++)
        {
            if(input[i-1]>=input[i]) {
                min = min + (input[i-1] - input[i] + 1);
                input[i] = input[i-1]+ 1;
            }
        }

        System.out.println(min);


    }

}

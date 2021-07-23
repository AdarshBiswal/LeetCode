package GenerateParentheses_22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(generateParenthesis(n));


    }
    public static List<String> generateParenthesis(int n) {

        List<String> output =new ArrayList<String>();

        generateParenthesisBackTrack(output,"",0,0,n);

        return output;

    }

    private static void generateParenthesisBackTrack(List<String> output, String currentString, int open, int close, int n) {



        if(n*2==currentString.length())
        {


            output.add(currentString);
            return;
        }

        if(open < n)
            generateParenthesisBackTrack(output,currentString+"(",open+1,close,n);

        if(close < open)
            generateParenthesisBackTrack(output,currentString+")",open,close+1,n);

    }
}

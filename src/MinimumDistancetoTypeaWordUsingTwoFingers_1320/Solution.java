package MinimumDistancetoTypeaWordUsingTwoFingers_1320;

import java.sql.SQLOutput;

public class Solution {

    public static void main(String[] args) {
        System.out.println(minimumDistance("AHNTOU"
        ));
    }
    public static int minimumDistance(String word) {

        //XFinger
        int x1=0;
        int y1=0;

        //YFinger
        int x2=0;
        int y2=0;
        int totalCost=0;
        boolean left=false;
        boolean right=false;

        boolean firstX=true;
        boolean firstY=true;

        if(checkLeft(word) || checkLeft(word))
        {
            System.out.println(true);
            int j=word.length()/2;

            for(int i=0;i<word.length()/2;i++)
            {
                System.out.println(word.charAt(i));
                System.out.println(word.charAt(j));
                if(i==0)
                {
                    String s=getCordinate(word.charAt(i)+"");
                    int x3=Integer.parseInt(s.charAt(0)+"");
                    int y3=Integer.parseInt(s.charAt(2)+"");
                    x1=x3;
                    y1=y3;

                }
                if(j==word.length()/2)
                {
                    String s=getCordinate(word.charAt(j)+"");
                    int x4=Integer.parseInt(s.charAt(0)+"");
                    int y4=Integer.parseInt(s.charAt(2)+"");
                    x2=x4;
                    y2=y4;
                    j++;
                    continue;

                }
                String xFinger=getCordinate(word.charAt(i)+"");
                String yFinger=getCordinate(word.charAt(j)+"");

                int x3=Integer.parseInt(xFinger.charAt(0)+"");
                int y3=Integer.parseInt(xFinger.charAt(2)+"");

                int x4=Integer.parseInt(yFinger.charAt(0)+"");
                int y4=Integer.parseInt(yFinger.charAt(2)+"");




                totalCost+= (Math.abs(x1-x3)+Math.abs(y1-y3))+(Math.abs(x2-x4)+Math.abs(y2-y4));
                x1=x3;
                y1=y3;
                x2=y4;
                y3=y4;
                j++;


            }

            if(word.length()%2!=0)
            {
                String yFinger=getCordinate(word.charAt(j)+"");
                int x4=Integer.parseInt(yFinger.charAt(0)+"");
                int y4=Integer.parseInt(yFinger.charAt(2)+"");
                totalCost+=Math.abs(x2-x4)+Math.abs(y2-y4);
            }

        }
        else
        {
            for(int i=0;i<word.length();i++)
            {
                String s=getCordinate(word.charAt(i)+"");

                int x3 = 0,x4=0;
                int y3=0,y4=0;
                if(Integer.parseInt(s.charAt(2)+"")<3)
                {
                    x3=Integer.parseInt(s.charAt(0)+"");
                    y3=Integer.parseInt(s.charAt(2)+"");
                    left=true;
                    right=false;

                }
                else
                {
                    x4=Integer.parseInt(s.charAt(0)+"");
                    y4=Integer.parseInt(s.charAt(2)+"");
                    right=true;
                    left=false;
                }


                if(left)
                {

                    if(firstX)
                    {
                        x1=x3;
                        y1=y3;
                        System.out.println(word.charAt(i)+" left "+0);
                        firstX=false;
                        continue;
                    }
                    totalCost+=Math.abs(x1-x3)+Math.abs(y1-y3);
                    System.out.println(word.charAt(i)+" left "+totalCost);
                    left=false;
                    x1=x3;
                    y1=y3;
                }
                if(right)
                {
                    if(firstY)
                    {
                        x2=x4;
                        y2=y4;
                        System.out.println(word.charAt(i)+" right "+0);
                        firstY=false;
                        continue;
                    }
                    totalCost+=Math.abs(x2-x4)+Math.abs(y2-y4);
                    System.out.println(word.charAt(i)+" right "+totalCost);
                    right=false;
                    x2=x4;
                    y2=y4;
                }

            }

        }





        return totalCost;


    }

    public static String getCordinate(String s)
    {
        if(s.equals("A"))
            return "0 0";
        if(s.equals("B"))
            return "0 1";
        if(s.equals("C"))
            return "0 2";
        if(s.equals("D"))
            return "0 3";
        if(s.equals("E"))
            return "0 4";
        if(s.equals("F"))
            return "0 5";
        if(s.equals("G"))
            return "1 0";
        if(s.equals("H"))
            return "1 1";
        if(s.equals("I"))
            return "1 2";
        if(s.equals("J"))
            return "1 3";
        if(s.equals("K"))
            return "1 4";
        if(s.equals("L"))
            return "1 5";
        if(s.equals("M"))
            return "2 0";
        if(s.equals("N"))
            return "2 1";
        if(s.equals("O"))
            return "2 2";
        if(s.equals("P"))
            return "2 3";
        if(s.equals("Q"))
            return "2 4";
        if(s.equals("R"))
            return "2 5";
        if(s.equals("S"))
            return "3 0";
        if(s.equals("T"))
            return "3 1";
        if(s.equals("U"))
            return "3 2";
        if(s.equals("V"))
            return "3 3";
        if(s.equals("W"))
            return "3 4";
        if(s.equals("X"))
            return "3 5";
        if(s.equals("Y"))
            return "4 0";
        if(s.equals("Z"))
            return "4 1";

        return null;

    }


    public static boolean checkLeft(String word)
    {
        for(int i=0;i<word.length();i++)
        {
            if((Integer.parseInt(getCordinate(word.charAt(i)+"").charAt(0)+"")>3))
            {
                return false;
            }
        }

            return  true;
    }
    public static boolean checkRight(String word)
    {
        for(int i=0;i<word.length();i++)
        {
            if((Integer.parseInt(getCordinate(word.charAt(i)+"").charAt(0)+"")<=3))
            {
                return false;
            }
        }

        return  true;
    }
}

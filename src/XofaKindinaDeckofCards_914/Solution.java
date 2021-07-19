package XofaKindinaDeckofCards_914;

import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public static void main(String args[])
    {
        int deck[]={1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3};
        System.out.println(hasGroupsSizeX(deck));
    }
    public static boolean hasGroupsSizeX(int[] deck) {

        HashMap<Integer,Integer>hm =new HashMap<Integer,Integer>();


        if(deck.length==1||deck.length==0)
            return false;

        for(int i=0;i<deck.length;i++)
        {
            if(hm.get(deck[i])!=null)
            {
                hm.put(deck[i],hm.get(deck[i])+1);
            }
            else
            {
                hm.put(deck[i],1);
            }

        }

        System.out.println(hm);
        int check=0;


        for(Integer itr:hm.keySet())
        {
            if(check==0)
            {
                check=hm.get(itr);
                continue;
            }
            else
            {
                if(gcd(check,hm.get(itr))==1)
                {
                    return false;
                }
                else
                {
                    check=hm.get(itr);
                }

            }
        }


    return true;

    }
    public static int gcd(int x,int y)
    {
        int gcd=1;
        for(int i = 1; i <= x && i <= y; i++)
        {
            if(x%i==0 && y%i==0)
                gcd = i;
        }
       return gcd;
    }

}

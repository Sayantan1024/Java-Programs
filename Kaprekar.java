import java.util.*;
class Kaprekar
{
    String rem(int n) //to calculate first and second part 
    {
        int v=0; //declaration
        int sq=n*n;
        int c1=0,c=0;
        for(int i=n;i>0;i/=10) //count digits of n
            c++;
        String q=Integer.toString(sq/((int)Math.pow(10,c))); //first part of sq
        String r=Integer.toString(sq%((int)Math.pow(10,c))); //second part of sq
        
        for(int i=(Integer.parseInt(r));i>0;i/=10) //count digits of second part
            c1++;
            
        if(c1!=c)
          {
             for(int i=1;i<c;i++)
               r=v+r;
           }     
        String s=q+"+"+r;
        return s;
    }    
    boolean kap(int n) //to check if a number is kaprekar or not
    {
        int p=1,s=0,c=0; //declaration
        int fp=0,lp=0;
        p=n*n;
        int temp=p;
        for(int i=temp;i>0;i/=10)
            c++;
        for(int i=c-1;i>0;i--)
           {
               fp=p/(int)Math.pow(10,i); //calculating first part of p
               lp=p%(int)Math.pow(10,i); //calculating second part of p
               if(fp==0 || lp==0)
                  continue;
               s=fp+lp;
               if(s==n)
                  return true;
                }
                return false;
    }
    void generate() // to generate all kaprekar numbers within given range
    {
        for(int i=1;i<1000;i++)
           {
               if(kap(i)==true)
                  System.out.println(i+" "+(i*i)+" "+rem(i)); //printing
                }
    }
    public static void main()
    {
        Kaprekar ob=new Kaprekar(); //creating object ob 
        ob.generate(); //calling function
    }
}
    
            
    
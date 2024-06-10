import java.util.*;
class Magic
{
    
    int sum(int n)
    {
       int s=0,c;
       while(n>0)
       {
           c=n%10;
           s=s+c;
           n=n/10;
        }
        return s;
    }    
    int check(int n)
    {
        int s1=0;
        while(n>9)
        {
            s1=0;
            s1=sum(n);   
            n=s1;
        }
        return s1;
    }
    void range(int l,int u)
    {
        int i;
        for(i=l;i<=u;i++)
           {
               if(check(i)==1)
                  System.out.print(i+" ");
                }
            }
            
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Magic ob=new Magic();
        int p,q;
        System.out.println("Enter lower and upper limits");
        p=sc.nextInt();
        q=sc.nextInt();
        ob.range(p,q);
        
       
        }
}
        
     
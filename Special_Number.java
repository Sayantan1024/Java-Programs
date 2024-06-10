import java.util.*;
class Special_Number
{
    int fact(int n)
    {
        int f=1,i;
        for(i=1;i<=n;i++)
          {
              f=f*i;
            }
    return f;
    }
    int spec(int n)
    {
        int s=0,c;
        while(n>0)
        {
           c=n%10;
           s=s+fact(c);
           n=n/10;
        }
        return s;
    }
    void range(int l,int u)
    {
        int i;
        for(i=l;i<=u;i++)
          {
              if(i==spec(i))
                System.out.println(i+",");
            }
        }
        
          
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Special_Number ob=new Special_Number();
        int lo,up;
        System.out.println("Enter lower and upper limits");
        lo=sc.nextInt();
        up=sc.nextInt();
        ob.range(lo,up);
    }
}
    
    
        
  
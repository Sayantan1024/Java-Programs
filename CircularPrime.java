import java.util.*;
class CircularPrime
{
    int N; //declaration
    public CircularPrime(int n) //paramterized constructor to initialise N
    {
        N=n;
    }    
    int prime(int n) //check for prime
    {
        int c=0; //declaration
        for(int i=1;i<=n;i++)
           {
               if(n%i==0)
                  c++; //count factors
                }
        return c;
    }
    void check()
    {
        int r,c=0; //declaration
        int num=N;
        while(num>0)
        {
            r=num%10;
            c++; //count digits
            num=num/10;
        }
        num=N;
        int t=0;
        for(int i=1;i<=c;i++)
           {
               r=num%10;
               num=num/10;
               num=(r*(int)Math.pow(10,c-1))+num;
               System.out.println(num);
               if(prime(num)==2)
                 {
                     t=1;
                    }
                 else
                   {
                       t=-1;
                       break;
                    }  
           }
        if(t==1)
          System.out.print(N+" IS A CIRCULAR PRIME");
          else
            System.out.print(N+" IS NOT A CIRCULAR PRIME"); //printing
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int no; //declaration
        System.out.println("enter number"); //input number
        no=sc.nextInt();
        CircularPrime ob=new CircularPrime(no); //creating object ob
        ob.check(); //calling function
    }
    
}
    
        
                 
    
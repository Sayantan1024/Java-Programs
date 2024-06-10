import java.util.*;
class Arms_Recur
{
    void arms(int k,int s,int n)
    {
        int c;
        if(n==0)
          {
              if(s==k)
                 System.out.print("Armstrong no.");
                 else
                    System.out.print("Not Armstrong");
              return;
            }
            else
              {
                  c=n%10;
                  s=s+c*c*c;
                  n=n/10;
                  arms(k,s,n);
                }
            }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Arms_Recur ob=new Arms_Recur();
        int no;
        System.out.println("enter number");
        no=sc.nextInt();
        ob.arms(no,0,no);
    }
}
    
                        
      
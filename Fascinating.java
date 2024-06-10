import java.util.*;
class Fascinating
{
    int n; //declaration
    public Fascinating() //default constructor to initialise n
    {
        n=0;
    }
    void input() //input number
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
    }
    void check()
    {
        int idx1,idx2,c=0; //declaration
        String s;
        int num2=n*2;
        int num3=n*3;
        s=""+n+num2+num3; //concatenating
        for(char i='1';i<='9';i++)
           {
               idx1=s.indexOf(i);
               idx2=s.lastIndexOf(i);
               if(idx1==-1 || idx1!=idx2)
                  c=1;
                }
        if(c==1)
           System.out.print("NUMBER IS NOT FASCINATING"); 
           else
             System.out.print(n+" is fascinating number"); //printing
    }
    public static void main()
    {
        Fascinating ob=new Fascinating(); //creating object ob
        ob.input(); //calling function
        ob.check(); //calling function
    }
}
    
    
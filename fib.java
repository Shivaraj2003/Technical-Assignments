import java.util.Scanner;
class fib{
    public static void main(String args[])
    {
        int fib0=0,fib1=1,fib2;
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the N value: ");
        N=sc.nextInt();
        if(N==0)
            System.out.print(fib0);
        else if(N==1)
        System.out.print(fib1);
        else{
                System.out.print(fib0+" "+fib1);
                for(int i=2;i<N;i++)

        {
           fib2=fib0+fib1;
           fib0=fib1;
           fib1=fib2;
           System.out.print(" "+fib2);

            
        }

        }
       


    }
}
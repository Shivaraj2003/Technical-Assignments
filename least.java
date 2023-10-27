import java.util.Scanner;
class least{
    public static void main(String args[])
    {
        int N;
        System.out.println("Enter N: ");
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        int count=N-1,temp;
        if(N>0){
        System.out.println("Enter "+N+"  numbers");
        int min=sc.nextInt();
        while(count!=0)
        {
            temp=sc.nextInt();
            if(temp<min)
                min=temp;
            count--;
        }
        System.out.println("Minimum is: "+min);
        }
    }
}
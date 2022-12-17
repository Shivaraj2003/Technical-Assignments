import java.util.Scanner;
class Series1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        double ans;
        int p=(n-1)/2;
        if(n<=30)
        {
            if(n%2==0)
                ans=Math.pow(3,p);
            else
                ans=Math.pow(2,p);
            
            System.out.println((int)ans);
        }
        else
            System.out.println("Invalid input");
    }
}
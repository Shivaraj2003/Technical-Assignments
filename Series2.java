import java.util.Scanner;
class Series2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int ans;
        if(n<=200000)
        {
            if(n%2!=0)
                ans=n-1;
            else
                ans=(n-1)/2;
            
            System.out.println(ans);
        }
        else
            System.out.println("Invalid input");
    }
}
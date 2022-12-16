
import java.util.Scanner;
class Assignment4{
public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ar[]=new int[n];
    int total=0,count,temp;
    for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        temp=ar[i];
        if(temp==-1)
            continue;
        count=1;
        for(int j=i+1;j<n;j++)
        {
            if(ar[j]==temp)
            {
                count++;
                ar[j]=-1;
            }

        }
        if(count%2!=0)
            total++;
    } 
    System.out.println(total);
}

}
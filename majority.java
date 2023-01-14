import java.util.Scanner;
class majority{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
        a[i]=sc.nextInt();
        }
        int temp,count=0,max=0,num=0;
       for(int i=0;i<n-1;i++)
          {
            temp=a[i];
            count=0;

            for(int j=i+1;j<n;j++)
            {
                if(a[j]==temp)
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
                num=a[i];
            }
          }
          System.out.println(num);
    }
}
import java.util.StringTokenizer;
class ReverseWords{
    public static void main(String args[]){
        System.out.println("Enter the string: ");
        String str=new java.util.Scanner(System.in).nextLine();
        String rev[]=new String[1000];
        StringTokenizer stk=new StringTokenizer(str,".");
        int i=-1;

        while(stk.hasMoreTokens())
        {
            rev[++i]=stk.nextToken();
            rev[++i]=".";
            
        }
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(rev[j]);
        }

    }
}

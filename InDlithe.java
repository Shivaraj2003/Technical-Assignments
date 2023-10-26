class InDlithe{
    public static void main(String args[])
    {
        char arr[]={'D','L','I','T','H','E'};
        int len=arr.length;
        for(int i=0;i<len;i++)
        { 
            int t=i;
            for(int j=0;j<len-i;j++)
            {   
                while(t!=0)
                {
                    System.out.print(" ");
                    t--;
                }
               
               
                System.out.print(arr[j]+"");
            }
            System.out.println();
        }

    }
}
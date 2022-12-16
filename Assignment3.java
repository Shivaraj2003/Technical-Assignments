class Assignment3{
    public static void main(String args[]){
        String str = new java.util.Scanner(System.in).nextLine();
		int len = str.length();
		for (int i = 1; i<=len;i++){
			System.out.printf("%-"+i+"."+1+"s  ", str);
            
            System.out.printf("%"+i+"."+1+"s\n", str);
    }
    }
}
import java.lang.Thread;

class thread1 extends Thread{

public void run(){
try{
    thread2 b=new thread2();
while(true){
System.out.println("VTU");

thread1.sleep(500);
b.start();

}
}
catch(Exception e)
{
    System.out.println("Exception");
}
}
}

class thread2 extends Thread{

public void run(){


System.out.println(".....MITE.....");



}


}

class thread {


public static void main(String arg[]){

thread1 a=new thread1();

{
System.out.println("SHIVARAJ");
a.start();


}

}

}


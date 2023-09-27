
/* Two way to create a thread
1. By using Thread class
2. By using the runnable interface
 */

public class Main {
    public static void main(String[] args) {
myThread mt=new myThread();//Now create thread object
        mt.start(); // now we can call run method using start method call (invoke the thread).
        //if we can call again the start method then they thorw the error.We can  not invoke the thread exception

 myRunnable mr=new myRunnable();
 Thread th=new Thread(mr);
 th.start();

    }
}


/* Now first create thread by using thread class
1.first extends the thread class in your class
2. then you can create run method
 */
class myThread extends Thread{
    public void run(){
        System.out.println("Threading");
    }
}
//By using Runnable interface
class myRunnable implements Runnable{
        public void run(){
            System.out.println("Runnable");
        }
}

//------------------------------------------------------------------------------------------------------------------------------------


// Life Cycle of thread
//New----->Runnable------------>Running---------->dead
//          \                         /
//            \                     /
//               \               /
//                wating   , sleep (block , waiting)
// Different cases of executing Thread
// There mainly four way
//1. Performing  Single task from single thread
//2.Performing Single task from Multiple Thread
//3.Performing Multiple task from Single thread  ---> This is not possible because if you run single thread in multiple task  then the whole program is  corrpect
//4.Performing Multiple task  from  Multiple thread


public class SecondLecture {
    public static void main(String []args){ // main thread is also a thread which is create by JVm
                Test t=new Test();
                t.start(); // single task from single thread

        Test t1=new Test();
        t1.start(); //  t and t2 Single task from Multiple Thread


        //----------------------------------------------------------------------------------------
        myThread1 mt1=new myThread1();
        mt1.start();
        myThread2 mt2=new myThread2(); // Multiple task  from  Multiple thread
        mt2.start();

    }
}


//1. Performing  Single task from single thread
class Test extends Thread{
    public void run(){
        System.out.println("Thread task");
    }
}
//---------------------------------------------------------------------------------------------------------
   // 4 Performing Multiple task  from  Multiple thread

class myThread1 extends Thread{
    public void run(){
        System.out.println("Task 1");
    }
}

class myThread2 extends Thread{
    public void run(){
        System.out.println("Task 2 ");
    }
}
